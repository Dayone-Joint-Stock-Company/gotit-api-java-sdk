package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.api.ProductsApi;
import com.gotit.sdk.model.PRODUCTDETAILRESPONSE;

import java.io.IOException;

public class ProductDetailHandler extends BaseHandler {
    private final int productId;

    public ProductDetailHandler(String apiBasePath, String xGiAuthorization, int productId) {
        super(apiBasePath, xGiAuthorization);
        this.productId = productId;
    }

    @Override
    protected String processRequest(HttpExchange exchange) throws ApiException, IOException {
        // Set default configuration
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-biz-stg.gotit.vn");
        defaultClient.addDefaultHeader("X-GI-Authorization", xGiAuthorization);

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        
        // Default parameters
        Boolean isExcludeStoreListInfo = false; // Boolean | Exclude store list information
        Integer storeListPage = 1; // Integer | Store Page
        Integer storeListPageSize = 50; // Integer | Store Page Size
        
        try {
            PRODUCTDETAILRESPONSE result = apiInstance.getProductDetail(
                xGiAuthorization, 
                productId, 
                isExcludeStoreListInfo, 
                storeListPage, 
                storeListPageSize
            );
            return result.toJson();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#getProductDetail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
} 