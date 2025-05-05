package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.api.BrandsApi;
import com.gotit.sdk.model.BRANDDETAILRESPONSE;

import java.io.IOException;

public class BrandDetailHandler extends BaseHandler {
    private final int brandId;

    public BrandDetailHandler(String apiBasePath, String xGiAuthorization, int brandId) {
        super(apiBasePath, xGiAuthorization);
        this.brandId = brandId;
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        // Set default configuration
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-biz-stg.gotit.vn");
        defaultClient.addDefaultHeader("X-GI-Authorization", xGiAuthorization);

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        
        try {
            BRANDDETAILRESPONSE result = apiInstance.getDetailOfBrand(xGiAuthorization, brandId);
            return result.toJson();
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#getDetailOfBrand");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
} 