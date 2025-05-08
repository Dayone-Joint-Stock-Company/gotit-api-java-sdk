# VoucherStatusApi

All URIs are relative to *https://api-biz-stg.gotit.vn*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkVoucher**](VoucherStatusApi.md#checkVoucher) | **GET** /api/v4.0/vouchers/multiple/status/{refId} | Check voucher status |


<a id="checkVoucher"></a>
# **checkVoucher**
> VOUCHERCHECKRESPONSE checkVoucher(xGIAuthorization, refId, isExcludeStoreListInfo, storeListPage, storeListPageSize)

Check voucher status

Check voucher status

### Example
```java
// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.models.*;
import com.gotit.sdk.api.VoucherStatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-biz-stg.gotit.vn");

    VoucherStatusApi apiInstance = new VoucherStatusApi(defaultClient);
    String xGIAuthorization = "API key GotIt provided"; // String | Authorization
    String refId = "voucher_0711_102"; // String | Transaction RefId
    Boolean isExcludeStoreListInfo = true; // Boolean | Exclude store list information
    Integer storeListPage = 1; // Integer | Store Page
    Integer storeListPageSize = 200; // Integer | Store Page Size
    try {
      VOUCHERCHECKRESPONSE result = apiInstance.checkVoucher(xGIAuthorization, refId, isExcludeStoreListInfo, storeListPage, storeListPageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherStatusApi#checkVoucher");
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
| **refId** | **String**| Transaction RefId | |
| **isExcludeStoreListInfo** | **Boolean**| Exclude store list information | [optional] |
| **storeListPage** | **Integer**| Store Page | [optional] |
| **storeListPageSize** | **Integer**| Store Page Size | [optional] |

### Return type

[**VOUCHERCHECKRESPONSE**](VOUCHERCHECKRESPONSE.md)

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

