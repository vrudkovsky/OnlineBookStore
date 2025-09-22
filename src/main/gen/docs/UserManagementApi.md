# UserManagementApi

All URIs are relative to *http://localhost:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authRegistrationPost**](UserManagementApi.md#authRegistrationPost) | **POST** /auth/registration | Register a new user |


<a id="authRegistrationPost"></a>
# **authRegistrationPost**
> UserResponseDto authRegistrationPost(userRegistrationRequestDto)

Register a new user

API endpoint for registering a new user account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    UserRegistrationRequestDto userRegistrationRequestDto = new UserRegistrationRequestDto(); // UserRegistrationRequestDto | 
    try {
      UserResponseDto result = apiInstance.authRegistrationPost(userRegistrationRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#authRegistrationPost");
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
| **userRegistrationRequestDto** | [**UserRegistrationRequestDto**](UserRegistrationRequestDto.md)|  | |

### Return type

[**UserResponseDto**](UserResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User successfully registered |  -  |
| **400** | Invalid input data |  -  |
| **409** | User with given email already exists |  -  |

