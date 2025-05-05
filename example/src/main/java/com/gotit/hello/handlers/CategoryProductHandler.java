package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.CategoriesApi;
import com.gotit.sdk.model.CATEGORIESRESPONSE;

import java.io.IOException;

public class CategoryProductHandler extends BaseHandler {
    public CategoryProductHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        CategoriesApi apiInstance = new CategoriesApi(apiClient);
        
        CATEGORIESRESPONSE result = apiInstance.getCategoryByProduct(xGiAuthorization);
        return result.toJson();
    }
} 