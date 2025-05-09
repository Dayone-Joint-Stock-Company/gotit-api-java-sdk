/*
 * Sample API
 * Technical document APIs for API Version 4.
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: quang.huynh@gotit.vn
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gotit.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.gotit.sdk.model.PRODUCTV;
import com.gotit.sdk.model.STORESSCHEMA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gotit.sdk.JSON;

/**
 * VOUCHERCHECKSCHEMADETAIL
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-05T09:04:05.866297444Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class VOUCHERCHECKSCHEMADETAIL {
  public static final String SERIALIZED_NAME_TRANSACTION_REF_ID = "transactionRefId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REF_ID)
  @javax.annotation.Nullable
  private String transactionRefId;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucherCode";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  @javax.annotation.Nullable
  private String voucherCode;

  public static final String SERIALIZED_NAME_VOUCHER_LINK = "voucherLink";
  @SerializedName(SERIALIZED_NAME_VOUCHER_LINK)
  @javax.annotation.Nullable
  private String voucherLink;

  public static final String SERIALIZED_NAME_VOUCHER_COVER_LINK = "voucherCoverLink";
  @SerializedName(SERIALIZED_NAME_VOUCHER_COVER_LINK)
  @javax.annotation.Nullable
  private String voucherCoverLink;

  public static final String SERIALIZED_NAME_VOUCHER_SERIAL = "voucherSerial";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SERIAL)
  @javax.annotation.Nullable
  private String voucherSerial;

  public static final String SERIALIZED_NAME_GROUP_LINK = "groupLink";
  @SerializedName(SERIALIZED_NAME_GROUP_LINK)
  @javax.annotation.Nullable
  private String groupLink;

  public static final String SERIALIZED_NAME_GROUP_VOUCHER_SERIAL = "groupVoucherSerial";
  @SerializedName(SERIALIZED_NAME_GROUP_VOUCHER_SERIAL)
  @javax.annotation.Nullable
  private String groupVoucherSerial;

  public static final String SERIALIZED_NAME_GROUP_COVER_LINK = "groupCoverLink";
  @SerializedName(SERIALIZED_NAME_GROUP_COVER_LINK)
  @javax.annotation.Nullable
  private String groupCoverLink;

  public static final String SERIALIZED_NAME_VOUCHER_LINK_CODE = "voucherLinkCode";
  @SerializedName(SERIALIZED_NAME_VOUCHER_LINK_CODE)
  @javax.annotation.Nullable
  private String voucherLinkCode;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE_LINK = "voucherImageLink";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE_LINK)
  @javax.annotation.Nullable
  private String voucherImageLink;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  @javax.annotation.Nullable
  private String expiryDate;

  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  @javax.annotation.Nullable
  private Integer stateCode;

  public static final String SERIALIZED_NAME_STATE_TEXT = "stateText";
  @SerializedName(SERIALIZED_NAME_STATE_TEXT)
  @javax.annotation.Nullable
  private String stateText;

  public static final String SERIALIZED_NAME_USED_STORE = "used_store";
  @SerializedName(SERIALIZED_NAME_USED_STORE)
  @javax.annotation.Nullable
  private List<STORESSCHEMA> usedStore;

  public static final String SERIALIZED_NAME_USED_TIME = "used_time";
  @SerializedName(SERIALIZED_NAME_USED_TIME)
  @javax.annotation.Nullable
  private String usedTime;

  public static final String SERIALIZED_NAME_USED_BRAND = "used_brand";
  @SerializedName(SERIALIZED_NAME_USED_BRAND)
  @javax.annotation.Nullable
  private String usedBrand;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  @javax.annotation.Nullable
  private PRODUCTV product;

  public VOUCHERCHECKSCHEMADETAIL() {
  }

  public VOUCHERCHECKSCHEMADETAIL transactionRefId(@javax.annotation.Nullable String transactionRefId) {
    this.transactionRefId = transactionRefId;
    return this;
  }

  /**
   * TransactionRefId receive from client request
   * @return transactionRefId
   */
  @javax.annotation.Nullable
  public String getTransactionRefId() {
    return transactionRefId;
  }

  public void setTransactionRefId(@javax.annotation.Nullable String transactionRefId) {
    this.transactionRefId = transactionRefId;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherCode(@javax.annotation.Nullable String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

  /**
   * Voucher code. Contains 10 numbers, unique and not duplicated with any other voucher. For some brands that do not use Got It code but use integerernal code (Big C, Mobile World), the system returns the integerernal code.
   * @return voucherCode
   */
  @javax.annotation.Nullable
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(@javax.annotation.Nullable String voucherCode) {
    this.voucherCode = voucherCode;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherLink(@javax.annotation.Nullable String voucherLink) {
    this.voucherLink = voucherLink;
    return this;
  }

  /**
   * Link of voucher
   * @return voucherLink
   */
  @javax.annotation.Nullable
  public String getVoucherLink() {
    return voucherLink;
  }

  public void setVoucherLink(@javax.annotation.Nullable String voucherLink) {
    this.voucherLink = voucherLink;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherCoverLink(@javax.annotation.Nullable String voucherCoverLink) {
    this.voucherCoverLink = voucherCoverLink;
    return this;
  }

  /**
   * Cover link of voucher.
   * @return voucherCoverLink
   */
  @javax.annotation.Nullable
  public String getVoucherCoverLink() {
    return voucherCoverLink;
  }

  public void setVoucherCoverLink(@javax.annotation.Nullable String voucherCoverLink) {
    this.voucherCoverLink = voucherCoverLink;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherSerial(@javax.annotation.Nullable String voucherSerial) {
    this.voucherSerial = voucherSerial;
    return this;
  }

  /**
   * Is a unique code to identify voucher link v and is not valid for use. For example: V1562342ET2
   * @return voucherSerial
   */
  @javax.annotation.Nullable
  public String getVoucherSerial() {
    return voucherSerial;
  }

  public void setVoucherSerial(@javax.annotation.Nullable String voucherSerial) {
    this.voucherSerial = voucherSerial;
  }


  public VOUCHERCHECKSCHEMADETAIL groupLink(@javax.annotation.Nullable String groupLink) {
    this.groupLink = groupLink;
    return this;
  }

  /**
   * https://e-stg.gotit.vn/gLsZaFRN
   * @return groupLink
   */
  @javax.annotation.Nullable
  public String getGroupLink() {
    return groupLink;
  }

  public void setGroupLink(@javax.annotation.Nullable String groupLink) {
    this.groupLink = groupLink;
  }


  public VOUCHERCHECKSCHEMADETAIL groupVoucherSerial(@javax.annotation.Nullable String groupVoucherSerial) {
    this.groupVoucherSerial = groupVoucherSerial;
    return this;
  }

  /**
   * E2V2RML6F52
   * @return groupVoucherSerial
   */
  @javax.annotation.Nullable
  public String getGroupVoucherSerial() {
    return groupVoucherSerial;
  }

  public void setGroupVoucherSerial(@javax.annotation.Nullable String groupVoucherSerial) {
    this.groupVoucherSerial = groupVoucherSerial;
  }


  public VOUCHERCHECKSCHEMADETAIL groupCoverLink(@javax.annotation.Nullable String groupCoverLink) {
    this.groupCoverLink = groupCoverLink;
    return this;
  }

  /**
   * https://e-stg.gotit.vn/gLsZaFRN
   * @return groupCoverLink
   */
  @javax.annotation.Nullable
  public String getGroupCoverLink() {
    return groupCoverLink;
  }

  public void setGroupCoverLink(@javax.annotation.Nullable String groupCoverLink) {
    this.groupCoverLink = groupCoverLink;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherLinkCode(@javax.annotation.Nullable String voucherLinkCode) {
    this.voucherLinkCode = voucherLinkCode;
    return this;
  }

  /**
   * Last 8 characters of voucher link
   * @return voucherLinkCode
   */
  @javax.annotation.Nullable
  public String getVoucherLinkCode() {
    return voucherLinkCode;
  }

  public void setVoucherLinkCode(@javax.annotation.Nullable String voucherLinkCode) {
    this.voucherLinkCode = voucherLinkCode;
  }


  public VOUCHERCHECKSCHEMADETAIL voucherImageLink(@javax.annotation.Nullable String voucherImageLink) {
    this.voucherImageLink = voucherImageLink;
    return this;
  }

  /**
   * Link of voucher image. To display vouchers as images
   * @return voucherImageLink
   */
  @javax.annotation.Nullable
  public String getVoucherImageLink() {
    return voucherImageLink;
  }

  public void setVoucherImageLink(@javax.annotation.Nullable String voucherImageLink) {
    this.voucherImageLink = voucherImageLink;
  }


  public VOUCHERCHECKSCHEMADETAIL expiryDate(@javax.annotation.Nullable String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Voucher expiration date
   * @return expiryDate
   */
  @javax.annotation.Nullable
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(@javax.annotation.Nullable String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public VOUCHERCHECKSCHEMADETAIL stateCode(@javax.annotation.Nullable Integer stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * State Code
   * @return stateCode
   */
  @javax.annotation.Nullable
  public Integer getStateCode() {
    return stateCode;
  }

  public void setStateCode(@javax.annotation.Nullable Integer stateCode) {
    this.stateCode = stateCode;
  }


  public VOUCHERCHECKSCHEMADETAIL stateText(@javax.annotation.Nullable String stateText) {
    this.stateText = stateText;
    return this;
  }

  /**
   * State Text
   * @return stateText
   */
  @javax.annotation.Nullable
  public String getStateText() {
    return stateText;
  }

  public void setStateText(@javax.annotation.Nullable String stateText) {
    this.stateText = stateText;
  }


  public VOUCHERCHECKSCHEMADETAIL usedStore(@javax.annotation.Nullable List<STORESSCHEMA> usedStore) {
    this.usedStore = usedStore;
    return this;
  }

  public VOUCHERCHECKSCHEMADETAIL addUsedStoreItem(STORESSCHEMA usedStoreItem) {
    if (this.usedStore == null) {
      this.usedStore = new ArrayList<>();
    }
    this.usedStore.add(usedStoreItem);
    return this;
  }

  /**
   * Get usedStore
   * @return usedStore
   */
  @javax.annotation.Nullable
  public List<STORESSCHEMA> getUsedStore() {
    return usedStore;
  }

  public void setUsedStore(@javax.annotation.Nullable List<STORESSCHEMA> usedStore) {
    this.usedStore = usedStore;
  }


  public VOUCHERCHECKSCHEMADETAIL usedTime(@javax.annotation.Nullable String usedTime) {
    this.usedTime = usedTime;
    return this;
  }

  /**
   * Used Time
   * @return usedTime
   */
  @javax.annotation.Nullable
  public String getUsedTime() {
    return usedTime;
  }

  public void setUsedTime(@javax.annotation.Nullable String usedTime) {
    this.usedTime = usedTime;
  }


  public VOUCHERCHECKSCHEMADETAIL usedBrand(@javax.annotation.Nullable String usedBrand) {
    this.usedBrand = usedBrand;
    return this;
  }

  /**
   * State Text
   * @return usedBrand
   */
  @javax.annotation.Nullable
  public String getUsedBrand() {
    return usedBrand;
  }

  public void setUsedBrand(@javax.annotation.Nullable String usedBrand) {
    this.usedBrand = usedBrand;
  }


  public VOUCHERCHECKSCHEMADETAIL product(@javax.annotation.Nullable PRODUCTV product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @javax.annotation.Nullable
  public PRODUCTV getProduct() {
    return product;
  }

  public void setProduct(@javax.annotation.Nullable PRODUCTV product) {
    this.product = product;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VOUCHERCHECKSCHEMADETAIL VOUCHER_CHECK_SCHEMA_DETAIL = (VOUCHERCHECKSCHEMADETAIL) o;
    return Objects.equals(this.transactionRefId, VOUCHER_CHECK_SCHEMA_DETAIL.transactionRefId) &&
        Objects.equals(this.voucherCode, VOUCHER_CHECK_SCHEMA_DETAIL.voucherCode) &&
        Objects.equals(this.voucherLink, VOUCHER_CHECK_SCHEMA_DETAIL.voucherLink) &&
        Objects.equals(this.voucherCoverLink, VOUCHER_CHECK_SCHEMA_DETAIL.voucherCoverLink) &&
        Objects.equals(this.voucherSerial, VOUCHER_CHECK_SCHEMA_DETAIL.voucherSerial) &&
        Objects.equals(this.groupLink, VOUCHER_CHECK_SCHEMA_DETAIL.groupLink) &&
        Objects.equals(this.groupVoucherSerial, VOUCHER_CHECK_SCHEMA_DETAIL.groupVoucherSerial) &&
        Objects.equals(this.groupCoverLink, VOUCHER_CHECK_SCHEMA_DETAIL.groupCoverLink) &&
        Objects.equals(this.voucherLinkCode, VOUCHER_CHECK_SCHEMA_DETAIL.voucherLinkCode) &&
        Objects.equals(this.voucherImageLink, VOUCHER_CHECK_SCHEMA_DETAIL.voucherImageLink) &&
        Objects.equals(this.expiryDate, VOUCHER_CHECK_SCHEMA_DETAIL.expiryDate) &&
        Objects.equals(this.stateCode, VOUCHER_CHECK_SCHEMA_DETAIL.stateCode) &&
        Objects.equals(this.stateText, VOUCHER_CHECK_SCHEMA_DETAIL.stateText) &&
        Objects.equals(this.usedStore, VOUCHER_CHECK_SCHEMA_DETAIL.usedStore) &&
        Objects.equals(this.usedTime, VOUCHER_CHECK_SCHEMA_DETAIL.usedTime) &&
        Objects.equals(this.usedBrand, VOUCHER_CHECK_SCHEMA_DETAIL.usedBrand) &&
        Objects.equals(this.product, VOUCHER_CHECK_SCHEMA_DETAIL.product);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRefId, voucherCode, voucherLink, voucherCoverLink, voucherSerial, groupLink, groupVoucherSerial, groupCoverLink, voucherLinkCode, voucherImageLink, expiryDate, stateCode, stateText, usedStore, usedTime, usedBrand, product);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOUCHERCHECKSCHEMADETAIL {\n");
    sb.append("    transactionRefId: ").append(toIndentedString(transactionRefId)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherLink: ").append(toIndentedString(voucherLink)).append("\n");
    sb.append("    voucherCoverLink: ").append(toIndentedString(voucherCoverLink)).append("\n");
    sb.append("    voucherSerial: ").append(toIndentedString(voucherSerial)).append("\n");
    sb.append("    groupLink: ").append(toIndentedString(groupLink)).append("\n");
    sb.append("    groupVoucherSerial: ").append(toIndentedString(groupVoucherSerial)).append("\n");
    sb.append("    groupCoverLink: ").append(toIndentedString(groupCoverLink)).append("\n");
    sb.append("    voucherLinkCode: ").append(toIndentedString(voucherLinkCode)).append("\n");
    sb.append("    voucherImageLink: ").append(toIndentedString(voucherImageLink)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateText: ").append(toIndentedString(stateText)).append("\n");
    sb.append("    usedStore: ").append(toIndentedString(usedStore)).append("\n");
    sb.append("    usedTime: ").append(toIndentedString(usedTime)).append("\n");
    sb.append("    usedBrand: ").append(toIndentedString(usedBrand)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("transactionRefId");
    openapiFields.add("voucherCode");
    openapiFields.add("voucherLink");
    openapiFields.add("voucherCoverLink");
    openapiFields.add("voucherSerial");
    openapiFields.add("groupLink");
    openapiFields.add("groupVoucherSerial");
    openapiFields.add("groupCoverLink");
    openapiFields.add("voucherLinkCode");
    openapiFields.add("voucherImageLink");
    openapiFields.add("expiryDate");
    openapiFields.add("stateCode");
    openapiFields.add("stateText");
    openapiFields.add("used_store");
    openapiFields.add("used_time");
    openapiFields.add("used_brand");
    openapiFields.add("product");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VOUCHERCHECKSCHEMADETAIL
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VOUCHERCHECKSCHEMADETAIL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOUCHERCHECKSCHEMADETAIL is not found in the empty JSON string", VOUCHERCHECKSCHEMADETAIL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VOUCHERCHECKSCHEMADETAIL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VOUCHERCHECKSCHEMADETAIL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transactionRefId") != null && !jsonObj.get("transactionRefId").isJsonNull()) && !jsonObj.get("transactionRefId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRefId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRefId").toString()));
      }
      if ((jsonObj.get("voucherCode") != null && !jsonObj.get("voucherCode").isJsonNull()) && !jsonObj.get("voucherCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherCode").toString()));
      }
      if ((jsonObj.get("voucherLink") != null && !jsonObj.get("voucherLink").isJsonNull()) && !jsonObj.get("voucherLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherLink").toString()));
      }
      if ((jsonObj.get("voucherCoverLink") != null && !jsonObj.get("voucherCoverLink").isJsonNull()) && !jsonObj.get("voucherCoverLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherCoverLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherCoverLink").toString()));
      }
      if ((jsonObj.get("voucherSerial") != null && !jsonObj.get("voucherSerial").isJsonNull()) && !jsonObj.get("voucherSerial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherSerial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherSerial").toString()));
      }
      if ((jsonObj.get("groupLink") != null && !jsonObj.get("groupLink").isJsonNull()) && !jsonObj.get("groupLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupLink").toString()));
      }
      if ((jsonObj.get("groupVoucherSerial") != null && !jsonObj.get("groupVoucherSerial").isJsonNull()) && !jsonObj.get("groupVoucherSerial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupVoucherSerial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupVoucherSerial").toString()));
      }
      if ((jsonObj.get("groupCoverLink") != null && !jsonObj.get("groupCoverLink").isJsonNull()) && !jsonObj.get("groupCoverLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupCoverLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupCoverLink").toString()));
      }
      if ((jsonObj.get("voucherLinkCode") != null && !jsonObj.get("voucherLinkCode").isJsonNull()) && !jsonObj.get("voucherLinkCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherLinkCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherLinkCode").toString()));
      }
      if ((jsonObj.get("voucherImageLink") != null && !jsonObj.get("voucherImageLink").isJsonNull()) && !jsonObj.get("voucherImageLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucherImageLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucherImageLink").toString()));
      }
      if ((jsonObj.get("expiryDate") != null && !jsonObj.get("expiryDate").isJsonNull()) && !jsonObj.get("expiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryDate").toString()));
      }
      if ((jsonObj.get("stateText") != null && !jsonObj.get("stateText").isJsonNull()) && !jsonObj.get("stateText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateText").toString()));
      }
      if (jsonObj.get("used_store") != null && !jsonObj.get("used_store").isJsonNull()) {
        JsonArray jsonArrayusedStore = jsonObj.getAsJsonArray("used_store");
        if (jsonArrayusedStore != null) {
          // ensure the json data is an array
          if (!jsonObj.get("used_store").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `used_store` to be an array in the JSON string but got `%s`", jsonObj.get("used_store").toString()));
          }

          // validate the optional field `used_store` (array)
          for (int i = 0; i < jsonArrayusedStore.size(); i++) {
            STORESSCHEMA.validateJsonElement(jsonArrayusedStore.get(i));
          };
        }
      }
      if ((jsonObj.get("used_time") != null && !jsonObj.get("used_time").isJsonNull()) && !jsonObj.get("used_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `used_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("used_time").toString()));
      }
      if ((jsonObj.get("used_brand") != null && !jsonObj.get("used_brand").isJsonNull()) && !jsonObj.get("used_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `used_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("used_brand").toString()));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        PRODUCTV.validateJsonElement(jsonObj.get("product"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VOUCHERCHECKSCHEMADETAIL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOUCHERCHECKSCHEMADETAIL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOUCHERCHECKSCHEMADETAIL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOUCHERCHECKSCHEMADETAIL.class));

       return (TypeAdapter<T>) new TypeAdapter<VOUCHERCHECKSCHEMADETAIL>() {
           @Override
           public void write(JsonWriter out, VOUCHERCHECKSCHEMADETAIL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VOUCHERCHECKSCHEMADETAIL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VOUCHERCHECKSCHEMADETAIL given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VOUCHERCHECKSCHEMADETAIL
   * @throws IOException if the JSON string is invalid with respect to VOUCHERCHECKSCHEMADETAIL
   */
  public static VOUCHERCHECKSCHEMADETAIL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOUCHERCHECKSCHEMADETAIL.class);
  }

  /**
   * Convert an instance of VOUCHERCHECKSCHEMADETAIL to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

