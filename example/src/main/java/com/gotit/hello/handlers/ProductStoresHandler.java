package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.api.ProductsApi;
import com.gotit.sdk.model.STORESRESPONSE;

import java.io.IOException;

public class ProductStoresHandler extends BaseHandler {
    public ProductStoresHandler(String apiBasePath, String xGiAuthorization) {
        super(apiBasePath, xGiAuthorization);
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        ApiClient apiClient = createApiClient();
        ProductsApi apiInstance = new ProductsApi(apiClient);
        
        // Extract product_id from the request
        String path = exchange.getRequestURI().getPath();
        String[] segments = path.split("/");
        int productId = Integer.parseInt(segments[segments.length - 1]);
        
        STORESRESPONSE result = apiInstance.getStoresOfProduct(xGiAuthorization, productId);
        return result.toJson();
    }
} 