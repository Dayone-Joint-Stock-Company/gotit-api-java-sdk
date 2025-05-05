# com.gotit.sdk

SDK Technical document for GotIt APIs

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.gotit.api</groupId>
  <artifactId>com.gotit.sdk</artifactId>
  <version>4.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'com.gotit.sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'com.gotit.sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.gotit.api:com.gotit.sdk:4.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/com.gotit.sdk-4.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.ApiException;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://api-biz-stg.gotit.vn*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandsApi* | [**brandsByProducts**](docs/BrandsApi.md#brandsByProducts) | **GET** /api/v4.0/brands/brandsByProducts | Get brand by product
*BrandsApi* | [**getDetailOfBrand**](docs/BrandsApi.md#getDetailOfBrand) | **GET** /api/v4.0/brands/{id} | Get brand detail
*BrandsApi* | [**getListOfBrands**](docs/BrandsApi.md#getListOfBrands) | **GET** /api/v4.0/brands | Get list of brands
*CategoriesApi* | [**getCategoryByProduct**](docs/CategoriesApi.md#getCategoryByProduct) | **GET** /api/v4.0/categories/categoriesByProducts | Get category by product
*CategoriesApi* | [**getListOfCategories**](docs/CategoriesApi.md#getListOfCategories) | **GET** /api/v4.0/categories | Get lists category
*ProductsApi* | [**getListOfProducts**](docs/ProductsApi.md#getListOfProducts) | **GET** /api/v4.0/products | Get all products master data
*ProductsApi* | [**getProductDetail**](docs/ProductsApi.md#getProductDetail) | **GET** /api/v4.0/products/{id} | Get product detail data
*ProductsApi* | [**getStoresOfProduct**](docs/ProductsApi.md#getStoresOfProduct) | **GET** /api/v4.0/products/{id}/stores | Get stores of this product
*VoucherApi* | [**createVoucherLinkE**](docs/VoucherApi.md#createVoucherLinkE) | **POST** /api/v4.0/vouchers/e | Create voucher link e
*VoucherApi* | [**createVoucherLinkG**](docs/VoucherApi.md#createVoucherLinkG) | **POST** /api/v4.0/vouchers/g | Create voucher link g
*VoucherApi* | [**createVoucherLinkV**](docs/VoucherApi.md#createVoucherLinkV) | **POST** /api/v4.0/vouchers/v | Create voucher link v
*VoucherSendMethodApi* | [**checkStatusZNS**](docs/VoucherSendMethodApi.md#checkStatusZNS) | **POST** /api/v4.0/vouchers/send/zns/check | Check status zns
*VoucherSendMethodApi* | [**sendVoucherByEmail**](docs/VoucherSendMethodApi.md#sendVoucherByEmail) | **POST** /api/v4.0/vouchers/send/email | Send voucher by mail
*VoucherSendMethodApi* | [**sendVoucherBySMS**](docs/VoucherSendMethodApi.md#sendVoucherBySMS) | **POST** /api/v4.0/vouchers/send/sms | Send voucher by sms
*VoucherSendMethodApi* | [**sendVoucherByZNS**](docs/VoucherSendMethodApi.md#sendVoucherByZNS) | **POST** /api/v4.0/vouchers/send/zns | Send voucher by zns
*VoucherStatusApi* | [**checkVoucher**](docs/VoucherStatusApi.md#checkVoucher) | **GET** /api/v4.0/vouchers/multiple/status/{refId} | Check voucher status


## Documentation for Models

 - [BRANDCATEGORYDETAIL](docs/BRANDCATEGORYDETAIL.md)
 - [BRANDCATEGORYDETAILRESPONSE](docs/BRANDCATEGORYDETAILRESPONSE.md)
 - [BRANDDETAIL](docs/BRANDDETAIL.md)
 - [BRANDDETAILRESPONSE](docs/BRANDDETAILRESPONSE.md)
 - [BRANDREEDEMSCHEMA](docs/BRANDREEDEMSCHEMA.md)
 - [BRANDSDETAIL](docs/BRANDSDETAIL.md)
 - [BRANDSRESPONSE](docs/BRANDSRESPONSE.md)
 - [CATEGORIESDETAIL](docs/CATEGORIESDETAIL.md)
 - [CATEGORIESRESPONSE](docs/CATEGORIESRESPONSE.md)
 - [GROUPVOUCHERSCHEMA](docs/GROUPVOUCHERSCHEMA.md)
 - [HTTPBADREQUEST](docs/HTTPBADREQUEST.md)
 - [HTTPINTERNALSERVERERROR](docs/HTTPINTERNALSERVERERROR.md)
 - [HTTPNOTFOUND](docs/HTTPNOTFOUND.md)
 - [HTTPUNAUTHORIZED](docs/HTTPUNAUTHORIZED.md)
 - [PAGINGSCHEMA](docs/PAGINGSCHEMA.md)
 - [PRODUCTDEFAULTLINKG](docs/PRODUCTDEFAULTLINKG.md)
 - [PRODUCTDETAIL](docs/PRODUCTDETAIL.md)
 - [PRODUCTDETAILRESPONSE](docs/PRODUCTDETAILRESPONSE.md)
 - [PRODUCTG](docs/PRODUCTG.md)
 - [PRODUCTPRICESCHEMA](docs/PRODUCTPRICESCHEMA.md)
 - [PRODUCTSALLDETAIL](docs/PRODUCTSALLDETAIL.md)
 - [PRODUCTSDEFAULTLINKG](docs/PRODUCTSDEFAULTLINKG.md)
 - [PRODUCTSDETAIL](docs/PRODUCTSDETAIL.md)
 - [PRODUCTSRESPONSE](docs/PRODUCTSRESPONSE.md)
 - [PRODUCTSRESPONSEDataInner](docs/PRODUCTSRESPONSEDataInner.md)
 - [PRODUCTSVOUCHERCHECK](docs/PRODUCTSVOUCHERCHECK.md)
 - [PRODUCTV](docs/PRODUCTV.md)
 - [PRODUCTVENDORLINKG](docs/PRODUCTVENDORLINKG.md)
 - [REQUESTCHECKSTATUSZNS](docs/REQUESTCHECKSTATUSZNS.md)
 - [REQUESTCREATEVOUCHERLINKE](docs/REQUESTCREATEVOUCHERLINKE.md)
 - [REQUESTCREATEVOUCHERLINKG](docs/REQUESTCREATEVOUCHERLINKG.md)
 - [REQUESTCREATEVOUCHERLINKV](docs/REQUESTCREATEVOUCHERLINKV.md)
 - [REQUESTSENDVOUCHERBYEMAIL](docs/REQUESTSENDVOUCHERBYEMAIL.md)
 - [REQUESTSENDVOUCHERBYSMS](docs/REQUESTSENDVOUCHERBYSMS.md)
 - [REQUESTSENDVOUCHERBYZNS](docs/REQUESTSENDVOUCHERBYZNS.md)
 - [STOREPAGINGSCHEMA](docs/STOREPAGINGSCHEMA.md)
 - [STOREPRODUCTSCHEMA](docs/STOREPRODUCTSCHEMA.md)
 - [STORESRESPONSE](docs/STORESRESPONSE.md)
 - [STORESRESPONSEDataInner](docs/STORESRESPONSEDataInner.md)
 - [STORESSCHEMA](docs/STORESSCHEMA.md)
 - [USAGEMETHODSCHEMA](docs/USAGEMETHODSCHEMA.md)
 - [VENDORSCHEMA](docs/VENDORSCHEMA.md)
 - [VOUCHERCHECKRESPONSE](docs/VOUCHERCHECKRESPONSE.md)
 - [VOUCHERCHECKSCHEMA](docs/VOUCHERCHECKSCHEMA.md)
 - [VOUCHERCHECKSCHEMADETAIL](docs/VOUCHERCHECKSCHEMADETAIL.md)
 - [VOUCHERCHECKZNSRESPONSE](docs/VOUCHERCHECKZNSRESPONSE.md)
 - [VOUCHERCHECKZNSRESPONSEData](docs/VOUCHERCHECKZNSRESPONSEData.md)
 - [VOUCHERE](docs/VOUCHERE.md)
 - [VOUCHERERESPONSE](docs/VOUCHERERESPONSE.md)
 - [VOUCHERESCHEMA](docs/VOUCHERESCHEMA.md)
 - [VOUCHERG](docs/VOUCHERG.md)
 - [VOUCHERGRESPONSE](docs/VOUCHERGRESPONSE.md)
 - [VOUCHERGSCHEMA](docs/VOUCHERGSCHEMA.md)
 - [VOUCHERSENDEMAILRESPONSE](docs/VOUCHERSENDEMAILRESPONSE.md)
 - [VOUCHERSENDEMAILSCHEMA](docs/VOUCHERSENDEMAILSCHEMA.md)
 - [VOUCHERSENDSMSRESPONSE](docs/VOUCHERSENDSMSRESPONSE.md)
 - [VOUCHERSENDSMSSCHEMA](docs/VOUCHERSENDSMSSCHEMA.md)
 - [VOUCHERSENDZNSRESPONSE](docs/VOUCHERSENDZNSRESPONSE.md)
 - [VOUCHERSENDZNSRESPONSEData](docs/VOUCHERSENDZNSRESPONSEData.md)
 - [VOUCHERV](docs/VOUCHERV.md)
 - [VOUCHERVRESPONSE](docs/VOUCHERVRESPONSE.md)
 - [VOUCHERVSCHEMA](docs/VOUCHERVSCHEMA.md)
 - [VOUCHERVSCHEMAProduct](docs/VOUCHERVSCHEMAProduct.md)


<a id="documentation-for-authorization"></a>

## Author

quang.huynh@gotit.vn


## Running Examples with Docker

### Prerequisites
- Docker installed on your system
- Docker Compose installed on your system

### Running the Example

1. Clone the repository:
```bash
git clone https://github.com/Dayone-Joint-Stock-Company/gotit-api-java-sdk.git
cd gotit-api-java-sdk
```

2. Configure the environment:
   - Open `example/src/main/java/com/gotit/hello/config/AppConfig.java`
   - Set your `X_GI_AUTHORIZATION` token
   - Set your `PRIVATE_KEY_STR` for voucher operations

3. Build and run with Docker Compose:
```bash
cd example
docker-compose up --build
```

The example API will be available at `http://localhost:5001`

### Available Endpoints

#### Voucher Endpoints
- `GET /vouchers/e` - Create E voucher
- `GET /vouchers/v` - Create V voucher
- `GET /vouchers/g` - Create G voucher
- `GET /vouchers/send_sms` - Send voucher via SMS
- `GET /vouchers/send_email` - Send voucher via Email
- `GET /vouchers/send_zns` - Send voucher via ZNS
- `GET /vouchers/check_zns` - Check ZNS status
- `GET /vouchers/check_status_voucher` - Check voucher status

#### Brand Endpoints
- `GET /brands` - List all brands
- `GET /brands/{id}` - Get brand details
- `GET /brands/brand_product` - Get brand products

#### Category Endpoints
- `GET /categories` - List all categories
- `GET /categories/category_product` - Get category products

#### Product Endpoints
- `GET /products` - List all products
- `GET /products/{id}` - Get product details
- `GET /products/{id}/stores` - Get product stores