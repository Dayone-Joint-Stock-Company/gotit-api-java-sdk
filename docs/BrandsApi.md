# BrandsApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandsByProducts**](BrandsApi.md#brandsByProducts) | **GET** /api/v4.0/brands/brandsByProducts | Get brand by product |
| [**getDetailOfBrand**](BrandsApi.md#getDetailOfBrand) | **GET** /api/v4.0/brands/{id} | Get brand detail |
| [**getListOfBrands**](BrandsApi.md#getListOfBrands) | **GET** /api/v4.0/brands | Get list of brands |


<a id="brandsByProducts"></a>
# **brandsByProducts**
> BRANDDETAILRESPONSE brandsByProducts(xGIAuthorization)

Get brand by product

Returns brand detail data master

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.BrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    BrandsApi apiInstance = new BrandsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    try {
      BRANDDETAILRESPONSE result = apiInstance.brandsByProducts(xGIAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandsApi#brandsByProducts");
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

[**BRANDDETAILRESPONSE**](BRANDDETAILRESPONSE.md)

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

<a id="getDetailOfBrand"></a>
# **getDetailOfBrand**
> BRANDDETAILRESPONSE getDetailOfBrand(xGIAuthorization, id)

Get brand detail

Returns brand detail data master

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.BrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    BrandsApi apiInstance = new BrandsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    Integer id = 46; // Integer | Brand Id
    try {
      BRANDDETAILRESPONSE result = apiInstance.getDetailOfBrand(xGIAuthorization, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandsApi#getDetailOfBrand");
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
| **id** | **Integer**| Brand Id | |

### Return type

[**BRANDDETAILRESPONSE**](BRANDDETAILRESPONSE.md)

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

<a id="getListOfBrands"></a>
# **getListOfBrands**
> BRANDSRESPONSE getListOfBrands(xGIAuthorization)

Get list of brands

Retrieve a list of brands

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.BrandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    BrandsApi apiInstance = new BrandsApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    try {
      BRANDSRESPONSE result = apiInstance.getListOfBrands(xGIAuthorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandsApi#getListOfBrands");
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

[**BRANDSRESPONSE**](BRANDSRESPONSE.md)

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

