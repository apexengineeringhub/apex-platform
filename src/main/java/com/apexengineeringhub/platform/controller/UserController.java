package com.apexengineeringhub.platform.controller;


import com.apexengineeringhub.platform.common.api.ApiResponse;
import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * REST controller for user management operations.
 */
@Tag(
        name = "User Management API",
        description = "APIs for managing users."
  )
@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Operation(
            summary = "Create a new user",
            description = "Creates a new user after validating the request payload."
     )
    @ApiResponses(value = {
           @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "200",
                    description = "User created successfully.",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ApiResponse.class)
                    )
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "400",
                    description = "Validation failed."
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    responseCode = "500",
                    description = "An unexpected error occurred."
            )
    })

    @PostMapping
    public ResponseEntity<ApiResponse<String>> addUser(@Valid @RequestBody  CreateUserRequest createUserRequest){
        log.info("Received request to create a new user.");
        return ResponseEntity.ok(ApiResponse.success("User created successfully."));

    }
}
