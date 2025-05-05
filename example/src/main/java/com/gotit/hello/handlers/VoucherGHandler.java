package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherApi;
import com.gotit.sdk.model.REQUESTCREATEVOUCHERLINKG;
import com.gotit.sdk.model.VOUCHERGRESPONSE;
import com.gotit.sdk.model.PRODUCTDEFAULTLINKG;

import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class VoucherGHandler extends BaseHandler {
    public VoucherGHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherApi apiInstance = new VoucherApi(apiClient);
        
        // Generate random order name and transaction ref id
        String orderName = generateRandomString(10);
        String transactionRefId = generateRandomString(10);
        
        // Create product list
        PRODUCTDEFAULTLINKG product = new PRODUCTDEFAULTLINKG()
            .productId(1541)
            .productPriceId(2991)
            .quantity(1);
        
        // Create request object
        REQUESTCREATEVOUCHERLINKG request = new REQUESTCREATEVOUCHERLINKG()
            .productList(Arrays.asList(product))
            .orderName(orderName)
            .expiryDate("2025-11-15")
            .transactionRefId(transactionRefId)
            .useOtp(1)
            .otpType(1)
            .password("123456")
            .receiverName("Quang Huynh")
            .phone("0394162063")
            .email("quang.huynh@gotit.vn");
        
        VOUCHERGRESPONSE result = apiInstance.createVoucherLinkG(xGiAuthorization, request);
        return result.toJson();
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
} 