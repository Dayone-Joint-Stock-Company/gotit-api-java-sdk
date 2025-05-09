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
import com.gotit.sdk.model.BRANDREEDEMSCHEMA;
import com.gotit.sdk.model.PRODUCTPRICESCHEMA;
import com.gotit.sdk.model.STORESSCHEMA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PRODUCTDETAIL
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-05T09:04:05.866297444Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class PRODUCTDETAIL {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  @javax.annotation.Nullable
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NM = "productNm";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NM)
  @javax.annotation.Nullable
  private String productNm;

  public static final String SERIALIZED_NAME_PRODUCT_IMG = "productImg";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMG)
  @javax.annotation.Nullable
  private String productImg;

  public static final String SERIALIZED_NAME_PRODUCT_SUB_IMG = "productSubImg";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SUB_IMG)
  @javax.annotation.Nullable
  private List<Object> productSubImg = new ArrayList<>();

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  @javax.annotation.Nullable
  private Integer brandId;

  public static final String SERIALIZED_NAME_BRAND_NM = "brandNm";
  @SerializedName(SERIALIZED_NAME_BRAND_NM)
  @javax.annotation.Nullable
  private String brandNm;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "productType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  @javax.annotation.Nullable
  private String productType;

  public static final String SERIALIZED_NAME_BRAND_NAME_SLUG = "brandNameSlug";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_SLUG)
  @javax.annotation.Nullable
  private String brandNameSlug;

  public static final String SERIALIZED_NAME_BRAND_PHONE = "brandPhone";
  @SerializedName(SERIALIZED_NAME_BRAND_PHONE)
  @javax.annotation.Nullable
  private String brandPhone;

  public static final String SERIALIZED_NAME_BRAND_ADDRESS = "brandAddress";
  @SerializedName(SERIALIZED_NAME_BRAND_ADDRESS)
  @javax.annotation.Nullable
  private String brandAddress;

  public static final String SERIALIZED_NAME_BRAND_DESC = "brandDesc";
  @SerializedName(SERIALIZED_NAME_BRAND_DESC)
  @javax.annotation.Nullable
  private String brandDesc;

  public static final String SERIALIZED_NAME_BRAND_SERVICE_GUIDE = "brandServiceGuide";
  @SerializedName(SERIALIZED_NAME_BRAND_SERVICE_GUIDE)
  @javax.annotation.Nullable
  private String brandServiceGuide;

  public static final String SERIALIZED_NAME_SERVICE_GUIDE = "serviceGuide";
  @SerializedName(SERIALIZED_NAME_SERVICE_GUIDE)
  @javax.annotation.Nullable
  private String serviceGuide;

  public static final String SERIALIZED_NAME_BRAND_LOGO = "brandLogo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  @javax.annotation.Nullable
  private String brandLogo;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  @javax.annotation.Nullable
  private String link;

  public static final String SERIALIZED_NAME_PRICES = "prices";
  @SerializedName(SERIALIZED_NAME_PRICES)
  @javax.annotation.Nullable
  private List<PRODUCTPRICESCHEMA> prices = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME_SLUG = "nameSlug";
  @SerializedName(SERIALIZED_NAME_NAME_SLUG)
  @javax.annotation.Nullable
  private String nameSlug;

  public static final String SERIALIZED_NAME_PRODUCT_DESC = "productDesc";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESC)
  @javax.annotation.Nullable
  private String productDesc;

  public static final String SERIALIZED_NAME_PRODUCT_SHORT_DESC = "productShortDesc";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SHORT_DESC)
  @javax.annotation.Nullable
  private String productShortDesc;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  @javax.annotation.Nullable
  private String terms;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  @javax.annotation.Nullable
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NM = "categoryNm";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NM)
  @javax.annotation.Nullable
  private String categoryNm;

  public static final String SERIALIZED_NAME_CATEGORY_IMG = "categoryImg";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IMG)
  @javax.annotation.Nullable
  private String categoryImg;

  public static final String SERIALIZED_NAME_BRAND_REDEEM = "brandRedeem";
  @SerializedName(SERIALIZED_NAME_BRAND_REDEEM)
  @javax.annotation.Nullable
  private List<BRANDREEDEMSCHEMA> brandRedeem = new ArrayList<>();

  public static final String SERIALIZED_NAME_STORE_LIST = "storeList";
  @SerializedName(SERIALIZED_NAME_STORE_LIST)
  @javax.annotation.Nullable
  private List<STORESSCHEMA> storeList = new ArrayList<>();

  public PRODUCTDETAIL() {
  }

  public PRODUCTDETAIL productId(@javax.annotation.Nullable Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product Id
   * @return productId
   */
  @javax.annotation.Nullable
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(@javax.annotation.Nullable Integer productId) {
    this.productId = productId;
  }


  public PRODUCTDETAIL productNm(@javax.annotation.Nullable String productNm) {
    this.productNm = productNm;
    return this;
  }

  /**
   * Product Name
   * @return productNm
   */
  @javax.annotation.Nullable
  public String getProductNm() {
    return productNm;
  }

  public void setProductNm(@javax.annotation.Nullable String productNm) {
    this.productNm = productNm;
  }


  public PRODUCTDETAIL productImg(@javax.annotation.Nullable String productImg) {
    this.productImg = productImg;
    return this;
  }

  /**
   * Link product image
   * @return productImg
   */
  @javax.annotation.Nullable
  public String getProductImg() {
    return productImg;
  }

  public void setProductImg(@javax.annotation.Nullable String productImg) {
    this.productImg = productImg;
  }


  public PRODUCTDETAIL productSubImg(@javax.annotation.Nullable List<Object> productSubImg) {
    this.productSubImg = productSubImg;
    return this;
  }

  public PRODUCTDETAIL addProductSubImgItem(Object productSubImgItem) {
    if (this.productSubImg == null) {
      this.productSubImg = new ArrayList<>();
    }
    this.productSubImg.add(productSubImgItem);
    return this;
  }

  /**
   * Array of link image
   * @return productSubImg
   */
  @javax.annotation.Nullable
  public List<Object> getProductSubImg() {
    return productSubImg;
  }

  public void setProductSubImg(@javax.annotation.Nullable List<Object> productSubImg) {
    this.productSubImg = productSubImg;
  }


  public PRODUCTDETAIL brandId(@javax.annotation.Nullable Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Brand id
   * @return brandId
   */
  @javax.annotation.Nullable
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(@javax.annotation.Nullable Integer brandId) {
    this.brandId = brandId;
  }


  public PRODUCTDETAIL brandNm(@javax.annotation.Nullable String brandNm) {
    this.brandNm = brandNm;
    return this;
  }

  /**
   * Brand name
   * @return brandNm
   */
  @javax.annotation.Nullable
  public String getBrandNm() {
    return brandNm;
  }

  public void setBrandNm(@javax.annotation.Nullable String brandNm) {
    this.brandNm = brandNm;
  }


  public PRODUCTDETAIL productType(@javax.annotation.Nullable String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * c (cash) hoặc i (item)
   * @return productType
   */
  @javax.annotation.Nullable
  public String getProductType() {
    return productType;
  }

  public void setProductType(@javax.annotation.Nullable String productType) {
    this.productType = productType;
  }


  public PRODUCTDETAIL brandNameSlug(@javax.annotation.Nullable String brandNameSlug) {
    this.brandNameSlug = brandNameSlug;
    return this;
  }

  /**
   * Slug of brand
   * @return brandNameSlug
   */
  @javax.annotation.Nullable
  public String getBrandNameSlug() {
    return brandNameSlug;
  }

  public void setBrandNameSlug(@javax.annotation.Nullable String brandNameSlug) {
    this.brandNameSlug = brandNameSlug;
  }


  public PRODUCTDETAIL brandPhone(@javax.annotation.Nullable String brandPhone) {
    this.brandPhone = brandPhone;
    return this;
  }

  /**
   * Phone of brand
   * @return brandPhone
   */
  @javax.annotation.Nullable
  public String getBrandPhone() {
    return brandPhone;
  }

  public void setBrandPhone(@javax.annotation.Nullable String brandPhone) {
    this.brandPhone = brandPhone;
  }


  public PRODUCTDETAIL brandAddress(@javax.annotation.Nullable String brandAddress) {
    this.brandAddress = brandAddress;
    return this;
  }

  /**
   * Address of brand
   * @return brandAddress
   */
  @javax.annotation.Nullable
  public String getBrandAddress() {
    return brandAddress;
  }

  public void setBrandAddress(@javax.annotation.Nullable String brandAddress) {
    this.brandAddress = brandAddress;
  }


  public PRODUCTDETAIL brandDesc(@javax.annotation.Nullable String brandDesc) {
    this.brandDesc = brandDesc;
    return this;
  }

  /**
   * Description of brand
   * @return brandDesc
   */
  @javax.annotation.Nullable
  public String getBrandDesc() {
    return brandDesc;
  }

  public void setBrandDesc(@javax.annotation.Nullable String brandDesc) {
    this.brandDesc = brandDesc;
  }


  public PRODUCTDETAIL brandServiceGuide(@javax.annotation.Nullable String brandServiceGuide) {
    this.brandServiceGuide = brandServiceGuide;
    return this;
  }

  /**
   * T&amp;C of brand
   * @return brandServiceGuide
   */
  @javax.annotation.Nullable
  public String getBrandServiceGuide() {
    return brandServiceGuide;
  }

  public void setBrandServiceGuide(@javax.annotation.Nullable String brandServiceGuide) {
    this.brandServiceGuide = brandServiceGuide;
  }


  public PRODUCTDETAIL serviceGuide(@javax.annotation.Nullable String serviceGuide) {
    this.serviceGuide = serviceGuide;
    return this;
  }

  /**
   * T&amp;C of product
   * @return serviceGuide
   */
  @javax.annotation.Nullable
  public String getServiceGuide() {
    return serviceGuide;
  }

  public void setServiceGuide(@javax.annotation.Nullable String serviceGuide) {
    this.serviceGuide = serviceGuide;
  }


  public PRODUCTDETAIL brandLogo(@javax.annotation.Nullable String brandLogo) {
    this.brandLogo = brandLogo;
    return this;
  }

  /**
   * Link to brand logo image
   * @return brandLogo
   */
  @javax.annotation.Nullable
  public String getBrandLogo() {
    return brandLogo;
  }

  public void setBrandLogo(@javax.annotation.Nullable String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public PRODUCTDETAIL link(@javax.annotation.Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(@javax.annotation.Nullable String link) {
    this.link = link;
  }


  public PRODUCTDETAIL prices(@javax.annotation.Nullable List<PRODUCTPRICESCHEMA> prices) {
    this.prices = prices;
    return this;
  }

  public PRODUCTDETAIL addPricesItem(PRODUCTPRICESCHEMA pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Get prices
   * @return prices
   */
  @javax.annotation.Nullable
  public List<PRODUCTPRICESCHEMA> getPrices() {
    return prices;
  }

  public void setPrices(@javax.annotation.Nullable List<PRODUCTPRICESCHEMA> prices) {
    this.prices = prices;
  }


  public PRODUCTDETAIL nameSlug(@javax.annotation.Nullable String nameSlug) {
    this.nameSlug = nameSlug;
    return this;
  }

  /**
   * Slug of product
   * @return nameSlug
   */
  @javax.annotation.Nullable
  public String getNameSlug() {
    return nameSlug;
  }

  public void setNameSlug(@javax.annotation.Nullable String nameSlug) {
    this.nameSlug = nameSlug;
  }


  public PRODUCTDETAIL productDesc(@javax.annotation.Nullable String productDesc) {
    this.productDesc = productDesc;
    return this;
  }

  /**
   * Product Description
   * @return productDesc
   */
  @javax.annotation.Nullable
  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(@javax.annotation.Nullable String productDesc) {
    this.productDesc = productDesc;
  }


  public PRODUCTDETAIL productShortDesc(@javax.annotation.Nullable String productShortDesc) {
    this.productShortDesc = productShortDesc;
    return this;
  }

  /**
   * Product Short Description
   * @return productShortDesc
   */
  @javax.annotation.Nullable
  public String getProductShortDesc() {
    return productShortDesc;
  }

  public void setProductShortDesc(@javax.annotation.Nullable String productShortDesc) {
    this.productShortDesc = productShortDesc;
  }


  public PRODUCTDETAIL terms(@javax.annotation.Nullable String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Terms of use
   * @return terms
   */
  @javax.annotation.Nullable
  public String getTerms() {
    return terms;
  }

  public void setTerms(@javax.annotation.Nullable String terms) {
    this.terms = terms;
  }


  public PRODUCTDETAIL categoryId(@javax.annotation.Nullable Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Category Id
   * @return categoryId
   */
  @javax.annotation.Nullable
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(@javax.annotation.Nullable Integer categoryId) {
    this.categoryId = categoryId;
  }


  public PRODUCTDETAIL categoryNm(@javax.annotation.Nullable String categoryNm) {
    this.categoryNm = categoryNm;
    return this;
  }

  /**
   * Category Name
   * @return categoryNm
   */
  @javax.annotation.Nullable
  public String getCategoryNm() {
    return categoryNm;
  }

  public void setCategoryNm(@javax.annotation.Nullable String categoryNm) {
    this.categoryNm = categoryNm;
  }


  public PRODUCTDETAIL categoryImg(@javax.annotation.Nullable String categoryImg) {
    this.categoryImg = categoryImg;
    return this;
  }

  /**
   * Category Image
   * @return categoryImg
   */
  @javax.annotation.Nullable
  public String getCategoryImg() {
    return categoryImg;
  }

  public void setCategoryImg(@javax.annotation.Nullable String categoryImg) {
    this.categoryImg = categoryImg;
  }


  public PRODUCTDETAIL brandRedeem(@javax.annotation.Nullable List<BRANDREEDEMSCHEMA> brandRedeem) {
    this.brandRedeem = brandRedeem;
    return this;
  }

  public PRODUCTDETAIL addBrandRedeemItem(BRANDREEDEMSCHEMA brandRedeemItem) {
    if (this.brandRedeem == null) {
      this.brandRedeem = new ArrayList<>();
    }
    this.brandRedeem.add(brandRedeemItem);
    return this;
  }

  /**
   * Get brandRedeem
   * @return brandRedeem
   */
  @javax.annotation.Nullable
  public List<BRANDREEDEMSCHEMA> getBrandRedeem() {
    return brandRedeem;
  }

  public void setBrandRedeem(@javax.annotation.Nullable List<BRANDREEDEMSCHEMA> brandRedeem) {
    this.brandRedeem = brandRedeem;
  }


  public PRODUCTDETAIL storeList(@javax.annotation.Nullable List<STORESSCHEMA> storeList) {
    this.storeList = storeList;
    return this;
  }

  public PRODUCTDETAIL addStoreListItem(STORESSCHEMA storeListItem) {
    if (this.storeList == null) {
      this.storeList = new ArrayList<>();
    }
    this.storeList.add(storeListItem);
    return this;
  }

  /**
   * Get storeList
   * @return storeList
   */
  @javax.annotation.Nullable
  public List<STORESSCHEMA> getStoreList() {
    return storeList;
  }

  public void setStoreList(@javax.annotation.Nullable List<STORESSCHEMA> storeList) {
    this.storeList = storeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRODUCTDETAIL PRODUCT_DETAIL = (PRODUCTDETAIL) o;
    return Objects.equals(this.productId, PRODUCT_DETAIL.productId) &&
        Objects.equals(this.productNm, PRODUCT_DETAIL.productNm) &&
        Objects.equals(this.productImg, PRODUCT_DETAIL.productImg) &&
        Objects.equals(this.productSubImg, PRODUCT_DETAIL.productSubImg) &&
        Objects.equals(this.brandId, PRODUCT_DETAIL.brandId) &&
        Objects.equals(this.brandNm, PRODUCT_DETAIL.brandNm) &&
        Objects.equals(this.productType, PRODUCT_DETAIL.productType) &&
        Objects.equals(this.brandNameSlug, PRODUCT_DETAIL.brandNameSlug) &&
        Objects.equals(this.brandPhone, PRODUCT_DETAIL.brandPhone) &&
        Objects.equals(this.brandAddress, PRODUCT_DETAIL.brandAddress) &&
        Objects.equals(this.brandDesc, PRODUCT_DETAIL.brandDesc) &&
        Objects.equals(this.brandServiceGuide, PRODUCT_DETAIL.brandServiceGuide) &&
        Objects.equals(this.serviceGuide, PRODUCT_DETAIL.serviceGuide) &&
        Objects.equals(this.brandLogo, PRODUCT_DETAIL.brandLogo) &&
        Objects.equals(this.link, PRODUCT_DETAIL.link) &&
        Objects.equals(this.prices, PRODUCT_DETAIL.prices) &&
        Objects.equals(this.nameSlug, PRODUCT_DETAIL.nameSlug) &&
        Objects.equals(this.productDesc, PRODUCT_DETAIL.productDesc) &&
        Objects.equals(this.productShortDesc, PRODUCT_DETAIL.productShortDesc) &&
        Objects.equals(this.terms, PRODUCT_DETAIL.terms) &&
        Objects.equals(this.categoryId, PRODUCT_DETAIL.categoryId) &&
        Objects.equals(this.categoryNm, PRODUCT_DETAIL.categoryNm) &&
        Objects.equals(this.categoryImg, PRODUCT_DETAIL.categoryImg) &&
        Objects.equals(this.brandRedeem, PRODUCT_DETAIL.brandRedeem) &&
        Objects.equals(this.storeList, PRODUCT_DETAIL.storeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productNm, productImg, productSubImg, brandId, brandNm, productType, brandNameSlug, brandPhone, brandAddress, brandDesc, brandServiceGuide, serviceGuide, brandLogo, link, prices, nameSlug, productDesc, productShortDesc, terms, categoryId, categoryNm, categoryImg, brandRedeem, storeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRODUCTDETAIL {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productNm: ").append(toIndentedString(productNm)).append("\n");
    sb.append("    productImg: ").append(toIndentedString(productImg)).append("\n");
    sb.append("    productSubImg: ").append(toIndentedString(productSubImg)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandNm: ").append(toIndentedString(brandNm)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    brandNameSlug: ").append(toIndentedString(brandNameSlug)).append("\n");
    sb.append("    brandPhone: ").append(toIndentedString(brandPhone)).append("\n");
    sb.append("    brandAddress: ").append(toIndentedString(brandAddress)).append("\n");
    sb.append("    brandDesc: ").append(toIndentedString(brandDesc)).append("\n");
    sb.append("    brandServiceGuide: ").append(toIndentedString(brandServiceGuide)).append("\n");
    sb.append("    serviceGuide: ").append(toIndentedString(serviceGuide)).append("\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    nameSlug: ").append(toIndentedString(nameSlug)).append("\n");
    sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
    sb.append("    productShortDesc: ").append(toIndentedString(productShortDesc)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryNm: ").append(toIndentedString(categoryNm)).append("\n");
    sb.append("    categoryImg: ").append(toIndentedString(categoryImg)).append("\n");
    sb.append("    brandRedeem: ").append(toIndentedString(brandRedeem)).append("\n");
    sb.append("    storeList: ").append(toIndentedString(storeList)).append("\n");
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
    openapiFields.add("productId");
    openapiFields.add("productNm");
    openapiFields.add("productImg");
    openapiFields.add("productSubImg");
    openapiFields.add("brandId");
    openapiFields.add("brandNm");
    openapiFields.add("productType");
    openapiFields.add("brandNameSlug");
    openapiFields.add("brandPhone");
    openapiFields.add("brandAddress");
    openapiFields.add("brandDesc");
    openapiFields.add("brandServiceGuide");
    openapiFields.add("serviceGuide");
    openapiFields.add("brandLogo");
    openapiFields.add("link");
    openapiFields.add("prices");
    openapiFields.add("nameSlug");
    openapiFields.add("productDesc");
    openapiFields.add("productShortDesc");
    openapiFields.add("terms");
    openapiFields.add("categoryId");
    openapiFields.add("categoryNm");
    openapiFields.add("categoryImg");
    openapiFields.add("brandRedeem");
    openapiFields.add("storeList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PRODUCTDETAIL
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PRODUCTDETAIL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PRODUCTDETAIL is not found in the empty JSON string", PRODUCTDETAIL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PRODUCTDETAIL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PRODUCTDETAIL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("productNm") != null && !jsonObj.get("productNm").isJsonNull()) && !jsonObj.get("productNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productNm").toString()));
      }
      if ((jsonObj.get("productImg") != null && !jsonObj.get("productImg").isJsonNull()) && !jsonObj.get("productImg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productImg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productImg").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("productSubImg") != null && !jsonObj.get("productSubImg").isJsonNull() && !jsonObj.get("productSubImg").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productSubImg` to be an array in the JSON string but got `%s`", jsonObj.get("productSubImg").toString()));
      }
      if ((jsonObj.get("brandNm") != null && !jsonObj.get("brandNm").isJsonNull()) && !jsonObj.get("brandNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandNm").toString()));
      }
      if ((jsonObj.get("productType") != null && !jsonObj.get("productType").isJsonNull()) && !jsonObj.get("productType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productType").toString()));
      }
      if ((jsonObj.get("brandNameSlug") != null && !jsonObj.get("brandNameSlug").isJsonNull()) && !jsonObj.get("brandNameSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandNameSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandNameSlug").toString()));
      }
      if ((jsonObj.get("brandPhone") != null && !jsonObj.get("brandPhone").isJsonNull()) && !jsonObj.get("brandPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandPhone").toString()));
      }
      if ((jsonObj.get("brandAddress") != null && !jsonObj.get("brandAddress").isJsonNull()) && !jsonObj.get("brandAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandAddress").toString()));
      }
      if ((jsonObj.get("brandDesc") != null && !jsonObj.get("brandDesc").isJsonNull()) && !jsonObj.get("brandDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandDesc").toString()));
      }
      if ((jsonObj.get("brandServiceGuide") != null && !jsonObj.get("brandServiceGuide").isJsonNull()) && !jsonObj.get("brandServiceGuide").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandServiceGuide` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandServiceGuide").toString()));
      }
      if ((jsonObj.get("serviceGuide") != null && !jsonObj.get("serviceGuide").isJsonNull()) && !jsonObj.get("serviceGuide").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceGuide` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceGuide").toString()));
      }
      if ((jsonObj.get("brandLogo") != null && !jsonObj.get("brandLogo").isJsonNull()) && !jsonObj.get("brandLogo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandLogo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandLogo").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("prices") != null && !jsonObj.get("prices").isJsonNull()) {
        JsonArray jsonArrayprices = jsonObj.getAsJsonArray("prices");
        if (jsonArrayprices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("prices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `prices` to be an array in the JSON string but got `%s`", jsonObj.get("prices").toString()));
          }

          // validate the optional field `prices` (array)
          for (int i = 0; i < jsonArrayprices.size(); i++) {
            PRODUCTPRICESCHEMA.validateJsonElement(jsonArrayprices.get(i));
          };
        }
      }
      if ((jsonObj.get("nameSlug") != null && !jsonObj.get("nameSlug").isJsonNull()) && !jsonObj.get("nameSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameSlug").toString()));
      }
      if ((jsonObj.get("productDesc") != null && !jsonObj.get("productDesc").isJsonNull()) && !jsonObj.get("productDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productDesc").toString()));
      }
      if ((jsonObj.get("productShortDesc") != null && !jsonObj.get("productShortDesc").isJsonNull()) && !jsonObj.get("productShortDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productShortDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productShortDesc").toString()));
      }
      if ((jsonObj.get("terms") != null && !jsonObj.get("terms").isJsonNull()) && !jsonObj.get("terms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms").toString()));
      }
      if ((jsonObj.get("categoryNm") != null && !jsonObj.get("categoryNm").isJsonNull()) && !jsonObj.get("categoryNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryNm").toString()));
      }
      if ((jsonObj.get("categoryImg") != null && !jsonObj.get("categoryImg").isJsonNull()) && !jsonObj.get("categoryImg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryImg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryImg").toString()));
      }
      if (jsonObj.get("brandRedeem") != null && !jsonObj.get("brandRedeem").isJsonNull()) {
        JsonArray jsonArraybrandRedeem = jsonObj.getAsJsonArray("brandRedeem");
        if (jsonArraybrandRedeem != null) {
          // ensure the json data is an array
          if (!jsonObj.get("brandRedeem").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `brandRedeem` to be an array in the JSON string but got `%s`", jsonObj.get("brandRedeem").toString()));
          }

          // validate the optional field `brandRedeem` (array)
          for (int i = 0; i < jsonArraybrandRedeem.size(); i++) {
            BRANDREEDEMSCHEMA.validateJsonElement(jsonArraybrandRedeem.get(i));
          };
        }
      }
      if (jsonObj.get("storeList") != null && !jsonObj.get("storeList").isJsonNull()) {
        JsonArray jsonArraystoreList = jsonObj.getAsJsonArray("storeList");
        if (jsonArraystoreList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("storeList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `storeList` to be an array in the JSON string but got `%s`", jsonObj.get("storeList").toString()));
          }

          // validate the optional field `storeList` (array)
          for (int i = 0; i < jsonArraystoreList.size(); i++) {
            STORESSCHEMA.validateJsonElement(jsonArraystoreList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PRODUCTDETAIL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PRODUCTDETAIL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PRODUCTDETAIL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PRODUCTDETAIL.class));

       return (TypeAdapter<T>) new TypeAdapter<PRODUCTDETAIL>() {
           @Override
           public void write(JsonWriter out, PRODUCTDETAIL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PRODUCTDETAIL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PRODUCTDETAIL given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PRODUCTDETAIL
   * @throws IOException if the JSON string is invalid with respect to PRODUCTDETAIL
   */
  public static PRODUCTDETAIL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PRODUCTDETAIL.class);
  }

  /**
   * Convert an instance of PRODUCTDETAIL to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

