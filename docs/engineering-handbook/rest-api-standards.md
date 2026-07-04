# REST API Standards

## Purpose

This document defines the REST API development standards for Project APEX.

Use `@RequestMapping` at the controller level to define the base API path.

### Example

```java
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @GetMapping
    public String checkHealthStatus() {
        return "APEX Platform is running successfully.";
    }
}
```

## API Response Standard
All REST controllers should return `ResponseEntity<T>`.

Always use the explicit status builder.

### Example:

```java

return ResponseEntity.status(HttpStatus.OK).body(response);

```
Avoid mixing different response styles such as:
- ResponseEntity.ok(...)
- returning raw objects
- returning raw strings