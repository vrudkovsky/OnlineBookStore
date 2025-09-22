# BookManagementApi

All URIs are relative to *http://localhost:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**booksGet**](BookManagementApi.md#booksGet) | **GET** /books | Get all books |
| [**booksIdDelete**](BookManagementApi.md#booksIdDelete) | **DELETE** /books/{id} | Delete a book by id |
| [**booksIdGet**](BookManagementApi.md#booksIdGet) | **GET** /books/{id} | Get a book by id |
| [**booksIdPut**](BookManagementApi.md#booksIdPut) | **PUT** /books/{id} | Update a book by id |
| [**booksPost**](BookManagementApi.md#booksPost) | **POST** /books | Create a new book |
| [**booksSearchGet**](BookManagementApi.md#booksSearchGet) | **GET** /books/search | Searching books with parameters |


<a id="booksGet"></a>
# **booksGet**
> List&lt;BookDto&gt; booksGet(page, size, sort)

Get all books

API for getting list of all available books

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    Integer page = 56; // Integer | Page number (0-based)
    Integer size = 56; // Integer | Page size
    String sort = "sort_example"; // String | Sorting criteria (e.g. title,author)
    try {
      List<BookDto> result = apiInstance.booksGet(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksGet");
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
| **page** | **Integer**| Page number (0-based) | [optional] |
| **size** | **Integer**| Page size | [optional] |
| **sort** | **String**| Sorting criteria (e.g. title,author) | [optional] |

### Return type

[**List&lt;BookDto&gt;**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of books |  -  |

<a id="booksIdDelete"></a>
# **booksIdDelete**
> booksIdDelete(id)

Delete a book by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.booksIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksIdDelete");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Book deleted (no content) |  -  |

<a id="booksIdGet"></a>
# **booksIdGet**
> BookDto booksIdGet(id)

Get a book by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      BookDto result = apiInstance.booksIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksIdGet");
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
| **id** | **Integer**|  | |

### Return type

[**BookDto**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book found |  -  |
| **404** | Book not found |  -  |

<a id="booksIdPut"></a>
# **booksIdPut**
> BookDto booksIdPut(id, createBookRequestDto)

Update a book by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    Integer id = 56; // Integer | 
    CreateBookRequestDto createBookRequestDto = new CreateBookRequestDto(); // CreateBookRequestDto | 
    try {
      BookDto result = apiInstance.booksIdPut(id, createBookRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksIdPut");
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
| **id** | **Integer**|  | |
| **createBookRequestDto** | [**CreateBookRequestDto**](CreateBookRequestDto.md)|  | |

### Return type

[**BookDto**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated book |  -  |

<a id="booksPost"></a>
# **booksPost**
> BookDto booksPost(createBookRequestDto)

Create a new book

API for creating a new book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    CreateBookRequestDto createBookRequestDto = new CreateBookRequestDto(); // CreateBookRequestDto | 
    try {
      BookDto result = apiInstance.booksPost(createBookRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksPost");
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
| **createBookRequestDto** | [**CreateBookRequestDto**](CreateBookRequestDto.md)|  | |

### Return type

[**BookDto**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Book successfully created |  -  |

<a id="booksSearchGet"></a>
# **booksSearchGet**
> List&lt;BookDto&gt; booksSearchGet(title, author)

Searching books with parameters

API for searching books

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    BookManagementApi apiInstance = new BookManagementApi(defaultClient);
    String title = "title_example"; // String | 
    String author = "author_example"; // String | 
    try {
      List<BookDto> result = apiInstance.booksSearchGet(title, author);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookManagementApi#booksSearchGet");
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
| **title** | **String**|  | [optional] |
| **author** | **String**|  | [optional] |

### Return type

[**List&lt;BookDto&gt;**](BookDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of matching books |  -  |

