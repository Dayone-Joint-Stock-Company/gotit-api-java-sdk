package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.ProductsApi;
import com.gotit.sdk.model.PRODUCTSRESPONSE;

import java.io.IOException;

public class ProductsHandler extends BaseHandler {
    public ProductsHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        ProductsApi apiInstance = new ProductsApi(apiClient);
        
        // Default parameters
        int page = 1;
        int pageSize = 200;
        int minPrice = 1000;
        int maxPrice = 10000000;
        boolean isExcludeStoreListInfo = false;
        int storeListPage = 1;
        int storeListPageSize = 50;

        PRODUCTSRESPONSE result = apiInstance.getListOfProducts(
            xGiAuthorization,
            page,
            pageSize,
            minPrice,
            maxPrice,
            isExcludeStoreListInfo,
            storeListPage,
            storeListPageSize
        );
        return result.toJson();
    }
} 