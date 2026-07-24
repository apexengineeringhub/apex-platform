package com.apexengineeringhub.platform.service;

import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import com.apexengineeringhub.platform.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;

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
        verify(userRepository).saveUser(request);



    }
}
