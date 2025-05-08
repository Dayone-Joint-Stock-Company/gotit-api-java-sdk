package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherSendMethodApi;
import com.gotit.sdk.model.REQUESTSENDVOUCHERBYZNS;
import com.gotit.sdk.model.VOUCHERSENDZNSRESPONSE;

import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class VoucherSendZnsHandler extends BaseHandler {
    public VoucherSendZnsHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(apiClient);
        
        // Generate random transaction id
        String transactionId = generateRandomString(15);
        
        // Create request object
        REQUESTSENDVOUCHERBYZNS request = new REQUESTSENDVOUCHERBYZNS()
            .phoneNo("0394162063")
            .receiverNm("Got It")
            .voucherSerials(Arrays.asList("E2V2RML6F52"))
            .transactionId(transactionId);
        
        VOUCHERSENDZNSRESPONSE result = apiInstance.sendVoucherByZNS(xGiAuthorization, request);
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