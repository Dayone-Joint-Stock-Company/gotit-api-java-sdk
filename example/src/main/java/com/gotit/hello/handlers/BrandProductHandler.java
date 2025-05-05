package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.BrandsApi;
import com.gotit.sdk.model.BRANDDETAILRESPONSE;

import java.io.IOException;

public class BrandProductHandler extends BaseHandler {
    public BrandProductHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        BrandsApi apiInstance = new BrandsApi(apiClient);
        
        BRANDDETAILRESPONSE result = apiInstance.brandsByProducts(xGiAuthorization);
        return result.toJson();
    }
} 