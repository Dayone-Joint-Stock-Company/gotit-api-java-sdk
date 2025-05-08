package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherSendMethodApi;
import com.gotit.sdk.model.REQUESTSENDVOUCHERBYSMS;
import com.gotit.sdk.model.VOUCHERSENDSMSRESPONSE;

import java.io.IOException;

public class VoucherSendSmsHandler extends BaseHandler {
    public VoucherSendSmsHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(apiClient);
        
        // Create request object
        REQUESTSENDVOUCHERBYSMS request = new REQUESTSENDVOUCHERBYSMS()
            .voucherLinkCode("gLsZaFRN")
            .phoneNo("0394162063")
            .receiverNm("Got It")
            .senderNm("Got It");
        
        VOUCHERSENDSMSRESPONSE result = apiInstance.sendVoucherBySMS(xGiAuthorization, request);
        return result.toJson();
    }
} 