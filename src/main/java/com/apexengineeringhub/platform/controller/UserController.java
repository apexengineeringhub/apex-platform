package com.apexengineeringhub.platform.controller;

import com.apexengineeringhub.platform.common.api.ApiResponse;
import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to create new user
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<ApiResponse<String>> addUser(@Valid @RequestBody  CreateUserRequest createUserRequest){
        return ResponseEntity.ok(ApiResponse.success("User created successfully."));
    }
}
