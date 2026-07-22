package com.apexengineeringhub.platform.service;

import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import com.apexengineeringhub.platform.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }
    @Test
    void shouldCreateUserSuccessfully() {
        // Arrange
        CreateUserRequest request = new CreateUserRequest();
        // Act
        request.setName("Anjani");
        request.setEmail("anjani@example.com");
        request.setAge(30);
        String result = userService.createUser(request);
        // Assert
        assertEquals("User created successfully.", result);

    }
}
