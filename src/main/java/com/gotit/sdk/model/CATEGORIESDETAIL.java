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
import java.io.IOException;
import java.util.Arrays;
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
 * CATEGORIESDETAIL
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-05T09:04:05.866297444Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CATEGORIESDETAIL {
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

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  @javax.annotation.Nullable
  private String slug;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  @javax.annotation.Nullable
  private Integer order;

  public CATEGORIESDETAIL() {
  }

  public CATEGORIESDETAIL categoryId(@javax.annotation.Nullable Integer categoryId) {
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


  public CATEGORIESDETAIL categoryNm(@javax.annotation.Nullable String categoryNm) {
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


  public CATEGORIESDETAIL categoryImg(@javax.annotation.Nullable String categoryImg) {
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


  public CATEGORIESDETAIL slug(@javax.annotation.Nullable String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Category Slug
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(@javax.annotation.Nullable String slug) {
    this.slug = slug;
  }


  public CATEGORIESDETAIL order(@javax.annotation.Nullable Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Category Short
   * @return order
   */
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(@javax.annotation.Nullable Integer order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CATEGORIESDETAIL CATEGORIES_DETAIL = (CATEGORIESDETAIL) o;
    return Objects.equals(this.categoryId, CATEGORIES_DETAIL.categoryId) &&
        Objects.equals(this.categoryNm, CATEGORIES_DETAIL.categoryNm) &&
        Objects.equals(this.categoryImg, CATEGORIES_DETAIL.categoryImg) &&
        Objects.equals(this.slug, CATEGORIES_DETAIL.slug) &&
        Objects.equals(this.order, CATEGORIES_DETAIL.order);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryNm, categoryImg, slug, order);
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
    sb.append("class CATEGORIESDETAIL {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryNm: ").append(toIndentedString(categoryNm)).append("\n");
    sb.append("    categoryImg: ").append(toIndentedString(categoryImg)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("categoryId");
    openapiFields.add("categoryNm");
    openapiFields.add("categoryImg");
    openapiFields.add("slug");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CATEGORIESDETAIL
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CATEGORIESDETAIL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CATEGORIESDETAIL is not found in the empty JSON string", CATEGORIESDETAIL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CATEGORIESDETAIL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CATEGORIESDETAIL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("categoryNm") != null && !jsonObj.get("categoryNm").isJsonNull()) && !jsonObj.get("categoryNm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryNm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryNm").toString()));
      }
      if ((jsonObj.get("categoryImg") != null && !jsonObj.get("categoryImg").isJsonNull()) && !jsonObj.get("categoryImg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryImg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryImg").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CATEGORIESDETAIL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CATEGORIESDETAIL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CATEGORIESDETAIL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CATEGORIESDETAIL.class));

       return (TypeAdapter<T>) new TypeAdapter<CATEGORIESDETAIL>() {
           @Override
           public void write(JsonWriter out, CATEGORIESDETAIL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CATEGORIESDETAIL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CATEGORIESDETAIL given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CATEGORIESDETAIL
   * @throws IOException if the JSON string is invalid with respect to CATEGORIESDETAIL
   */
  public static CATEGORIESDETAIL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CATEGORIESDETAIL.class);
  }

  /**
   * Convert an instance of CATEGORIESDETAIL to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

