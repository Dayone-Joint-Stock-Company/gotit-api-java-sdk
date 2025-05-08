package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherSendMethodApi;
import com.gotit.sdk.model.REQUESTSENDVOUCHERBYEMAIL;
import com.gotit.sdk.model.VOUCHERSENDEMAILRESPONSE;

import java.io.IOException;

public class VoucherSendEmailHandler extends BaseHandler {
    public VoucherSendEmailHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(apiClient);
        
        // Create request object
        REQUESTSENDVOUCHERBYEMAIL request = new REQUESTSENDVOUCHERBYEMAIL()
            .voucherLinkCode("gLsZaFRN")
            .email("quang.huynh@gotit.vn")
            .receiverNm("Got It")
            .senderNm("Got It")
            .message("Have a good day");
        
        VOUCHERSENDEMAILRESPONSE result = apiInstance.sendVoucherByEmail(xGiAuthorization, request);
        return result.toJson();
    }
} 