package com.apexengineeringhub.platform.controller;

import com.apexengineeringhub.platform.common.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {
    @GetMapping
    public ResponseEntity<ApiResponse<String>> health(){

        return ResponseEntity.ok(ApiResponse.success("Health check successful.", "UP"));

    }
}
