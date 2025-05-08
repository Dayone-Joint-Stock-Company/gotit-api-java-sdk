package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.VoucherSendMethodApi;
import com.gotit.sdk.model.REQUESTCHECKSTATUSZNS;
import com.gotit.sdk.model.VOUCHERCHECKZNSRESPONSE;

import java.io.IOException;

public class VoucherCheckZnsHandler extends BaseHandler {
    public VoucherCheckZnsHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(apiClient);
        
        // Create request object
        REQUESTCHECKSTATUSZNS request = new REQUESTCHECKSTATUSZNS()
            .transactionId("aNGqaAljTaLc5B3");
        
        VOUCHERCHECKZNSRESPONSE result = apiInstance.checkStatusZNS(xGiAuthorization, request);
        return result.toJson();
    }
} 