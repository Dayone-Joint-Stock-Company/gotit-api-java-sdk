package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherApi;
import com.gotit.sdk.model.REQUESTCREATEVOUCHERLINKV;
import com.gotit.sdk.model.VOUCHERVRESPONSE;

import java.io.IOException;
import java.util.Random;

public class VoucherVHandler extends BaseHandler {
    public VoucherVHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherApi apiInstance = new VoucherApi(apiClient);
        
        // Generate random order name and transaction ref id
        String orderName = generateRandomString(10);
        String transactionRefId = generateRandomString(10);
        
        // Create request object
        REQUESTCREATEVOUCHERLINKV request = new REQUESTCREATEVOUCHERLINKV()
            .productId(1541)
            .productPriceId(2991)
            .quantity(1)
            .orderName(orderName)
            .expiryDate("2025-11-15")
            .transactionRefId(transactionRefId)
            .useOtp(1)
            .otpType(1)
            .password("123456")
            .receiverName("Quang Huynh")
            .phone("0394162063")
            .email("quang.huynh@gotit.vn")
            .activeDate("")
            .isConvertToCoverLink(1);
        
        VOUCHERVRESPONSE result = apiInstance.createVoucherLinkV(xGiAuthorization, request);
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