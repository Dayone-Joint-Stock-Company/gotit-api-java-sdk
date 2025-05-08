# ProductsApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListOfProducts**](ProductsApi.md#getListOfProducts) | **GET** /api/v4.0/products | Get all products master data |
| [**getProductDetail**](ProductsApi.md#getProductDetail) | **GET** /api/v4.0/products/{id} | Get product detail data |
| [**getStoresOfProduct**](ProductsApi.md#getStoresOfProduct) | **GET** /api/v4.0/products/{id}/stores | Get stores of this product |


<a id="getListOfProducts"></a>
# **getListOfProducts**
> PRODUCTSRESPONSE getListOfProducts(xGIAuthorization, page, pageSize, minPrice, maxPrice, isExcludeStoreListInfo, storeListPage, storeListPageSize)

Get all products master data

Returns all products master data

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    Integer page = 1; // Integer | Page
    Integer pageSize = 200; // Integer | Page Size
    Integer minPrice = 1000; // Integer | Min price
    Integer maxPrice = 10000000; // Integer | Max price
    Boolean isExcludeStoreListInfo = true; // Boolean | Stores
    Integer storeListPage = 1; // Integer | Store Page
    Integer storeListPageSize = 200; // Integer | Store Page Size
    try {
      PRODUCTSRESPONSE result = apiInstance.getListOfProducts(xGIAuthorization, page, pageSize, minPrice, maxPrice, isExcludeStoreListInfo, storeListPage, storeListPageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getListOfProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGIAuthorization** | **String**| Authorization | |
| **page** | **Integer**| Page | |
| **pageSize** | **Integer**| Page Size | |
| **minPrice** | **Integer**| Min price | [optional] |
| **maxPrice** | **Integer**| Max price | [optional] |
| **isExcludeStoreListInfo** | **Boolean**| Stores | [optional] |
| **storeListPage** | **Integer**| Store Page | [optional] |
| **storeListPageSize** | **Integer**| Store Page Size | [optional] |

### Return type

[**PRODUCTSRESPONSE**](PRODUCTSRESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

<a id="getProductDetail"></a>
# **getProductDetail**
> PRODUCTDETAILRESPONSE getProductDetail(xGIAuthorization, id, isExcludeStoreListInfo, storeListPage, storeListPageSize)

Get product detail data

Returns product detail data

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    Integer id = 1541; // Integer | Product ID
    Boolean isExcludeStoreListInfo = true; // Boolean | Exclude store list information
    Integer storeListPage = 1; // Integer | Store Page
    Integer storeListPageSize = 200; // Integer | Store Page Size
    try {
      PRODUCTDETAILRESPONSE result = apiInstance.getProductDetail(xGIAuthorization, id, isExcludeStoreListInfo, storeListPage, storeListPageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductDetail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGIAuthorization** | **String**| Authorization | |
| **id** | **Integer**| Product ID | |
| **isExcludeStoreListInfo** | **Boolean**| Exclude store list information | [optional] |
| **storeListPage** | **Integer**| Store Page | [optional] |
| **storeListPageSize** | **Integer**| Store Page Size | [optional] |

### Return type

[**PRODUCTDETAILRESPONSE**](PRODUCTDETAILRESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

<a id="getStoresOfProduct"></a>
# **getStoresOfProduct**
> STORESRESPONSE getStoresOfProduct(xGIAuthorization, id)

Get stores of this product

Returns all stores of this product

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    Integer id = 1541; // Integer | Product ID
    try {
      STORESRESPONSE result = apiInstance.getStoresOfProduct(xGIAuthorization, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getStoresOfProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGIAuthorization** | **String**| Authorization | |
| **id** | **Integer**| Product ID | |

### Return type

[**STORESRESPONSE**](STORESRESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

