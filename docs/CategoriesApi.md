# CategoriesApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategoryByProduct**](CategoriesApi.md#getCategoryByProduct) | **GET** /api/v4.0/categories/categoriesByProducts | Get category by product |
| [**getListOfCategories**](CategoriesApi.md#getListOfCategories) | **GET** /api/v4.0/categories | Get lists category |


<a id="getCategoryByProduct"></a>
# **getCategoryByProduct**
> CATEGORIESRESPONSE getCategoryByProduct(xGIAuthorization)

Get category by product

Returns all categories data master

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    try {
      CATEGORIESRESPONSE result = apiInstance.getCategoryByProduct(xGIAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoryByProduct");
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

### Return type

[**CATEGORIESRESPONSE**](CATEGORIESRESPONSE.md)

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

<a id="getListOfCategories"></a>
# **getListOfCategories**
> CATEGORIESRESPONSE getListOfCategories(xGIAuthorization)

Get lists category

Returns all categories data master

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.CategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    try {
      CATEGORIESRESPONSE result = apiInstance.getListOfCategories(xGIAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getListOfCategories");
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

### Return type

[**CATEGORIESRESPONSE**](CATEGORIESRESPONSE.md)

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

