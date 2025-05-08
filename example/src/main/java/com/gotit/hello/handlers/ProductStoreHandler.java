package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.api.ProductsApi;
import com.gotit.sdk.model.STORESRESPONSE;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ProductStoreHandler extends BaseHandler {
    private final int productId;

    public ProductStoreHandler(String apiBasePath, String xGiAuthorization, int productId) {
        super(apiBasePath, xGiAuthorization);
        this.productId = productId;
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
            String errorResponse = "{\"error\": \"Internal Server Error\"}";
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

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        
        try {
            STORESRESPONSE result = apiInstance.getStoresOfProduct(xGiAuthorization, productId);
            return result.toJson();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#getStoresOfProduct");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
} 