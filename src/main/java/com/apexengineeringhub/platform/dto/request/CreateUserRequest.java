package com.apexengineeringhub.platform.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


/**
 * Request object used to create a new user.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {
    @Schema(description = "User name", example = "Anjani Pathak")
    @NotBlank(message = "Name is required.")
    private String name;
    @Schema(description = "Email address", example = "anjani@example.com")
    @NotBlank(message = "Email is required." )
    @Email(message = "Email must be a valid email address.")
    private String email;
    @Schema(description = "Age of the user", example = "30")
    @NotNull(message = "Age is required.")
    @Min(value = 18,message = "Age must be at least 18 years.")
    private Integer age;
}
