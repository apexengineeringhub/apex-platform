package com.apexengineeringhub.platform.dto.request;

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
    @NotBlank(message = "Name is required.")
    private String name;

    @NotBlank(message = "Email is required." )
    @Email(message = "Email must be a valid email address.")
    private String email;

    @NotNull(message = "Age is required.")
    @Min(value = 18,message = "Age must be at least 18 years.")
    private Integer age;
}
