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