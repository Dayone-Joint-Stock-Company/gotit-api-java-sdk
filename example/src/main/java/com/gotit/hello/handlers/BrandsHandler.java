package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.BrandsApi;
import com.gotit.sdk.model.BRANDSRESPONSE;

import java.io.IOException;

public class BrandsHandler extends BaseHandler {
    public BrandsHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        BrandsApi apiInstance = new BrandsApi(apiClient);
        
        BRANDSRESPONSE result = apiInstance.getListOfBrands(xGiAuthorization);
        return result.toJson();
    }
} 