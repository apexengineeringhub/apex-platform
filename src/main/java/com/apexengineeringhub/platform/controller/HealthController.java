package com.apexengineeringhub.platform.controller;

import com.apexengineeringhub.platform.common.api.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
@Tag(name = "Health API")
public class HealthController {

    @GetMapping
    public ResponseEntity<ApiResponse<String>> health(){

        return ResponseEntity.ok(ApiResponse.success("Health check successful.", "UP"));

    }
}
