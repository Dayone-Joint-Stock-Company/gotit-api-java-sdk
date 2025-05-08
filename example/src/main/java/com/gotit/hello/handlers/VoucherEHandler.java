package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.api.VoucherApi;
import com.gotit.sdk.model.REQUESTCREATEVOUCHERLINKE;
import com.gotit.sdk.model.VOUCHERERESPONSE;
import com.gotit.hello.config.AppConfig;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.Random;

public class VoucherEHandler extends BaseHandler {
    public VoucherEHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            // Set response headers
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().set("Access-Control-Allow-Methods", "GET, OPTIONS");
            exchange.getResponseHeaders().set("Access-Control-Allow-Headers", "Content-Type, X-GI-Authorization");

            // Handle OPTIONS request for CORS
            if (exchange.getRequestMethod().equalsIgnoreCase("OPTIONS")) {
                exchange.sendResponseHeaders(200, -1);
                return;
            }

            // Check if private key is empty
            if (AppConfig.PRIVATE_KEY_STR == null || AppConfig.PRIVATE_KEY_STR.trim().isEmpty()) {
                String errorResponse = "{\"error\": \"Private key is empty. Please set the PRIVATE_KEY_STR AppConfig variable.\"}";
                byte[] errorBytes = errorResponse.getBytes(StandardCharsets.UTF_8);
                exchange.sendResponseHeaders(500, errorBytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(errorBytes);
                }
                return;
            }

            // Process the request
            String response = processRequest(exchange);
            
            // Send response
            byte[] responseBytes = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        } catch (ApiException e) {
            // Handle API exceptions
            String errorResponse = "{\"error\": \"" + e.getMessage() + "\"}";
            byte[] errorBytes = errorResponse.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(500, errorBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(errorBytes);
            }
        } catch (Exception e) {
            // Handle other exceptions
            String errorResponse = "{\"error\": \"Internal Server Error: " + e.getMessage() + "\"}";
            byte[] errorBytes = errorResponse.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(500, errorBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(errorBytes);
            }
        }
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        // Set default configuration
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-biz-stg.gotit.vn");
        defaultClient.addDefaultHeader("X-GI-Authorization", xGiAuthorization);

        VoucherApi apiInstance = new VoucherApi(defaultClient);
        
        // Generate random order name and transaction ref id
        String orderName = generateRandomString(10);
        String transactionRefId = generateRandomString(10);
        
        // Create signature
        String data = xGiAuthorization + "|" + transactionRefId;
        String signature = signData(data);
        
        // Create request object
        REQUESTCREATEVOUCHERLINKE request = new REQUESTCREATEVOUCHERLINKE()
            .orderName(orderName)
            .transactionRefId(transactionRefId)
            .amount(100000)
            .expiryDate("2025-11-15")
            .productId(1541)
            .useOtp(1)
            .otpType(1)
            .password("123456")
            .receiverName("Quang Huynh")
            .phone("0394162063")
            .email("quang.huynh@gotit.vn")
            .signature(signature);
        
        try {
            VOUCHERERESPONSE result = apiInstance.createVoucherLinkE(xGiAuthorization, request);
            return result.toJson();
        } catch (ApiException e) {
            throw e;
        }
    }
    
    private String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    private String signData(String data) throws IOException {
        try {
            // Add BouncyCastle as a security provider
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

            // Parse the private key using BouncyCastle
            try (PEMParser pemParser = new PEMParser(new StringReader(AppConfig.PRIVATE_KEY_STR))) {
                Object obj = pemParser.readObject();
                JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
                PrivateKey privateKey;
                
                if (obj instanceof PEMKeyPair) {
                    privateKey = converter.getPrivateKey(((PEMKeyPair) obj).getPrivateKeyInfo());
                } else if (obj instanceof PrivateKeyInfo) {
                    privateKey = converter.getPrivateKey((PrivateKeyInfo) obj);
                } else {
                    throw new IOException("Unsupported key format: " + obj.getClass().getName());
                }

                // Create signature
                Signature signature = Signature.getInstance("SHA256withRSA", "BC");
                signature.initSign(privateKey);
                signature.update(data.getBytes(StandardCharsets.UTF_8));

                // Sign and encode
                byte[] signatureBytes = signature.sign();
                return Base64.getEncoder().encodeToString(signatureBytes);
            }
        } catch (Exception e) {
            throw new IOException("Failed to sign data", e);
        }
    }
} 