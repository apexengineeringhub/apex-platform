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