# VoucherSendMethodApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkStatusZNS**](VoucherSendMethodApi.md#checkStatusZNS) | **POST** /api/v4.0/vouchers/send/zns/check | Check status zns |
| [**sendVoucherByEmail**](VoucherSendMethodApi.md#sendVoucherByEmail) | **POST** /api/v4.0/vouchers/send/email | Send voucher by mail |
| [**sendVoucherBySMS**](VoucherSendMethodApi.md#sendVoucherBySMS) | **POST** /api/v4.0/vouchers/send/sms | Send voucher by sms |
| [**sendVoucherByZNS**](VoucherSendMethodApi.md#sendVoucherByZNS) | **POST** /api/v4.0/vouchers/send/zns | Send voucher by zns |


<a id="checkStatusZNS"></a>
# **checkStatusZNS**
> VOUCHERCHECKZNSRESPONSE checkStatusZNS(xGIAuthorization, REQUESTCHECKSTATUSZNS)

Check status zns

Check status zns

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherSendMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTCHECKSTATUSZNS REQUESTCHECKSTATUSZNS = new REQUESTCHECKSTATUSZNS(); // REQUESTCHECKSTATUSZNS | 
    try {
      VOUCHERCHECKZNSRESPONSE result = apiInstance.checkStatusZNS(xGIAuthorization, REQUESTCHECKSTATUSZNS);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherSendMethodApi#checkStatusZNS");
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
| **REQUESTCHECKSTATUSZNS** | [**REQUESTCHECKSTATUSZNS**](REQUESTCHECKSTATUSZNS.md)|  | [optional] |

### Return type

[**VOUCHERCHECKZNSRESPONSE**](VOUCHERCHECKZNSRESPONSE.md)

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

<a id="sendVoucherByEmail"></a>
# **sendVoucherByEmail**
> VOUCHERSENDEMAILRESPONSE sendVoucherByEmail(xGIAuthorization, REQUESTSENDVOUCHERBYEMAIL)

Send voucher by mail

Send voucher by mail

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherSendMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTSENDVOUCHERBYEMAIL REQUESTSENDVOUCHERBYEMAIL = new REQUESTSENDVOUCHERBYEMAIL(); // REQUESTSENDVOUCHERBYEMAIL | 
    try {
      VOUCHERSENDEMAILRESPONSE result = apiInstance.sendVoucherByEmail(xGIAuthorization, REQUESTSENDVOUCHERBYEMAIL);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherSendMethodApi#sendVoucherByEmail");
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
| **REQUESTSENDVOUCHERBYEMAIL** | [**REQUESTSENDVOUCHERBYEMAIL**](REQUESTSENDVOUCHERBYEMAIL.md)|  | [optional] |

### Return type

[**VOUCHERSENDEMAILRESPONSE**](VOUCHERSENDEMAILRESPONSE.md)

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

<a id="sendVoucherBySMS"></a>
# **sendVoucherBySMS**
> VOUCHERSENDSMSRESPONSE sendVoucherBySMS(xGIAuthorization, REQUESTSENDVOUCHERBYSMS)

Send voucher by sms

Send voucher by sms

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherSendMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTSENDVOUCHERBYSMS REQUESTSENDVOUCHERBYSMS = new REQUESTSENDVOUCHERBYSMS(); // REQUESTSENDVOUCHERBYSMS | 
    try {
      VOUCHERSENDSMSRESPONSE result = apiInstance.sendVoucherBySMS(xGIAuthorization, REQUESTSENDVOUCHERBYSMS);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherSendMethodApi#sendVoucherBySMS");
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
| **REQUESTSENDVOUCHERBYSMS** | [**REQUESTSENDVOUCHERBYSMS**](REQUESTSENDVOUCHERBYSMS.md)|  | |

### Return type

[**VOUCHERSENDSMSRESPONSE**](VOUCHERSENDSMSRESPONSE.md)

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

<a id="sendVoucherByZNS"></a>
# **sendVoucherByZNS**
> VOUCHERSENDZNSRESPONSE sendVoucherByZNS(xGIAuthorization, REQUESTSENDVOUCHERBYZNS)

Send voucher by zns

Send voucher by zns

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherSendMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherSendMethodApi apiInstance = new VoucherSendMethodApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    REQUESTSENDVOUCHERBYZNS REQUESTSENDVOUCHERBYZNS = new REQUESTSENDVOUCHERBYZNS(); // REQUESTSENDVOUCHERBYZNS | 
    try {
      VOUCHERSENDZNSRESPONSE result = apiInstance.sendVoucherByZNS(xGIAuthorization, REQUESTSENDVOUCHERBYZNS);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherSendMethodApi#sendVoucherByZNS");
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
| **REQUESTSENDVOUCHERBYZNS** | [**REQUESTSENDVOUCHERBYZNS**](REQUESTSENDVOUCHERBYZNS.md)|  | [optional] |

### Return type

[**VOUCHERSENDZNSRESPONSE**](VOUCHERSENDZNSRESPONSE.md)

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

