#Spring boot Knowledge

## Lesson learned

## What is @RestController?
```text
It is a Spring annotation used to create REST APIs. It combines @Controller and @ResponseBody, so all methods return data directly in the HTTP response body.


## What is the difference between @Controller and @RestController?

|@Controller|	@RestController|
|---|---|
|Returns a view (HTML/JSP/Thymeleaf) by default|	Returns data (JSON/XML/Text) by default|
|Used for MVC applications|	Used for REST APIs|
|Requires @ResponseBody to return JSON|	@ResponseBody is included automatically|


## How Spring Processes a Request
```text
Client
   |
HTTP Request
   |
DispatcherServlet
   |
@RestController
   |
Business Logic (Service)
   |
Repository
   |
Database
   |
Object Returned
   |
Jackson converts Object -> JSON
   |
HTTP Response

```

##  Don't abstract until you have at least two or three real use cases.

## What is @RestControllerAdvice ? 

```text
@RestControllerAdvice is a Spring Boot annotation used to handle exceptions globally for all REST controllers. Instead of writing exception handling logic in every controller, 
it centralizes the error handling in one place.
```
### Why do we use it?
- Eliminates duplicate exception handling code.
- Provides a consistent error response format.
- Improves maintainability and readability.
- Keeps controllers focused only on business logic.

### Key Point 
- Applies to all @RestController classes.
- Works together with @ExceptionHandler.
- Helps build standardized REST APIs.
- Supports handling multiple exception types.

## What is @ExceptionHandler
```text
@ExceptionHandler is used to catch specific exceptions and define how they should be handled.

```

Example:
```java
@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorResponse> handleException(...) {
    ...
}
```

### Why do we use it?
- Converts exceptions into meaningful API responses.
- Prevents exposing internal server errors to clients.
- Returns appropriate HTTP status codes.
- Improves API consistency.
### Key Points
- Can handle one or more exception types.
- Spring selects the most specific handler if multiple handlers match.
- Commonly used with @RestControllerAdvice.