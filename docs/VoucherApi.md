# VoucherApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVoucherLinkE**](VoucherApi.md#createVoucherLinkE) | **POST** /api/v4.0/vouchers/e | Create voucher link e |
| [**createVoucherLinkG**](VoucherApi.md#createVoucherLinkG) | **POST** /api/v4.0/vouchers/g | Create voucher link g |
| [**createVoucherLinkV**](VoucherApi.md#createVoucherLinkV) | **POST** /api/v4.0/vouchers/v | Create voucher link v |


<a id="createVoucherLinkE"></a>
# **createVoucherLinkE**
> VOUCHERERESPONSE createVoucherLinkE(xGIAuthorization, REQUESTCREATEVOUCHERLINKE)

Create voucher link e

Create voucher link e

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTCREATEVOUCHERLINKE REQUESTCREATEVOUCHERLINKE = new REQUESTCREATEVOUCHERLINKE(); // REQUESTCREATEVOUCHERLINKE | 
    try {
      VOUCHERERESPONSE result = apiInstance.createVoucherLinkE(xGIAuthorization, REQUESTCREATEVOUCHERLINKE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#createVoucherLinkE");
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
| **REQUESTCREATEVOUCHERLINKE** | [**REQUESTCREATEVOUCHERLINKE**](REQUESTCREATEVOUCHERLINKE.md)|  | [optional] |

### Return type

[**VOUCHERERESPONSE**](VOUCHERERESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

<a id="createVoucherLinkG"></a>
# **createVoucherLinkG**
> VOUCHERGRESPONSE createVoucherLinkG(xGIAuthorization, REQUESTCREATEVOUCHERLINKG)

Create voucher link g

Create voucher link g

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTCREATEVOUCHERLINKG REQUESTCREATEVOUCHERLINKG = new REQUESTCREATEVOUCHERLINKG(); // REQUESTCREATEVOUCHERLINKG | 
    try {
      VOUCHERGRESPONSE result = apiInstance.createVoucherLinkG(xGIAuthorization, REQUESTCREATEVOUCHERLINKG);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#createVoucherLinkG");
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
| **REQUESTCREATEVOUCHERLINKG** | [**REQUESTCREATEVOUCHERLINKG**](REQUESTCREATEVOUCHERLINKG.md)|  | [optional] |

### Return type

[**VOUCHERGRESPONSE**](VOUCHERGRESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

<a id="createVoucherLinkV"></a>
# **createVoucherLinkV**
> VOUCHERVRESPONSE createVoucherLinkV(xGIAuthorization, REQUESTCREATEVOUCHERLINKV)

Create voucher link v

Create voucher link v

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherApi apiInstance = new VoucherApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTCREATEVOUCHERLINKV REQUESTCREATEVOUCHERLINKV = new REQUESTCREATEVOUCHERLINKV(); // REQUESTCREATEVOUCHERLINKV | 
    try {
      VOUCHERVRESPONSE result = apiInstance.createVoucherLinkV(xGIAuthorization, REQUESTCREATEVOUCHERLINKV);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#createVoucherLinkV");
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
| **REQUESTCREATEVOUCHERLINKV** | [**REQUESTCREATEVOUCHERLINKV**](REQUESTCREATEVOUCHERLINKV.md)|  | [optional] |

### Return type

[**VOUCHERVRESPONSE**](VOUCHERVRESPONSE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Request not found |  -  |
| **500** | System error |  -  |

