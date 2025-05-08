

# VOUCHERCHECKSCHEMADETAIL


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionRefId** | **String** | TransactionRefId receive from client request |  [optional] |
|**voucherCode** | **String** | Voucher code. Contains 10 numbers, unique and not duplicated with any other voucher. For some brands that do not use Got It code but use integerernal code (Big C, Mobile World), the system returns the integerernal code. |  [optional] |
|**voucherLink** | **String** | Link of voucher |  [optional] |
|**voucherCoverLink** | **String** | Cover link of voucher. |  [optional] |
|**voucherSerial** | **String** | Is a unique code to identify voucher link v and is not valid for use. For example: V1562342ET2 |  [optional] |
|**groupLink** | **String** | https://e-stg.gotit.vn/gLsZaFRN |  [optional] |
|**groupVoucherSerial** | **String** | E2V2RML6F52 |  [optional] |
|**groupCoverLink** | **String** | https://e-stg.gotit.vn/gLsZaFRN |  [optional] |
|**voucherLinkCode** | **String** | Last 8 characters of voucher link |  [optional] |
|**voucherImageLink** | **String** | Link of voucher image. To display vouchers as images |  [optional] |
|**expiryDate** | **String** | Voucher expiration date |  [optional] |
|**stateCode** | **Integer** | State Code |  [optional] |
|**stateText** | **String** | State Text |  [optional] |
|**usedStore** | [**List&lt;STORESSCHEMA&gt;**](STORESSCHEMA.md) |  |  [optional] |
|**usedTime** | **String** | Used Time |  [optional] |
|**usedBrand** | **String** | State Text |  [optional] |
|**product** | [**PRODUCTV**](PRODUCTV.md) |  |  [optional] |



