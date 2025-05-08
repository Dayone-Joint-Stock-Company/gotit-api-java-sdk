

# VOUCHERVSCHEMA


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionRefId** | **String** | TransactionRefId receive from client request |  [optional] |
|**voucherCode** | **String** | Voucher code. Contains 10 numbers, unique and not duplicated with any other voucher. For some brands that do not use Got It code but use integerernal code (Big C, Mobile World), the system returns the integerernal code. |  [optional] |
|**voucherLink** | **String** | Link of voucher |  [optional] |
|**voucherLinkCode** | **String** | Last 8 characters of voucher link |  [optional] |
|**voucherImageLink** | **String** | Link of voucher image. To display vouchers as images |  [optional] |
|**voucherCoverLink** | **String** | Cover link of voucher. |  [optional] |
|**voucherCoverLinkCode** | **String** | Last 8 characters of voucher cover link |  [optional] |
|**voucherSerial** | **String** | Is a unique code to identify voucher link v and is not valid for use. For example: V1562342ET2 |  [optional] |
|**expiryDate** | **String** | Voucher expiration date |  [optional] |
|**product** | [**VOUCHERVSCHEMAProduct**](VOUCHERVSCHEMAProduct.md) |  |  [optional] |



