package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.api.VoucherStatusApi;
import com.gotit.sdk.model.VOUCHERCHECKRESPONSE;
import com.gotit.sdk.model.VOUCHERCHECKSCHEMA;
import com.gotit.sdk.model.VOUCHERCHECKSCHEMADETAIL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VoucherStatusHandler extends BaseHandler {
    public VoucherStatusHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        // Set default configuration
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-biz-stg.gotit.vn");
        defaultClient.addDefaultHeader("X-GI-Authorization", xGiAuthorization);

        VoucherStatusApi apiInstance = new VoucherStatusApi(defaultClient);
        String refId = "voucher_0711_102"; // String | Transaction RefId
        Boolean isExcludeStoreListInfo = true; // Boolean | Exclude store list information
        Integer storeListPage = 1; // Integer | Store Page
        Integer storeListPageSize = 200; // Integer | Store Page Size
        
        try {
            VOUCHERCHECKRESPONSE result = apiInstance.checkVoucher(xGiAuthorization, refId, isExcludeStoreListInfo, storeListPage, storeListPageSize);
            return result.toJson();
        } catch (ApiException e) {
            System.err.println("Exception when calling VoucherStatusApi#checkVoucher");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
} 