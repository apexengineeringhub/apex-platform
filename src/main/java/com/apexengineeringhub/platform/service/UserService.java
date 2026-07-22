package com.apexengineeringhub.platform.service;

import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {
    public void createUser(CreateUserRequest userRequest){
        log.info("Starting user creation process for email={}", userRequest.getEmail());

        log.info("User creation process completed successfully for email={}", userRequest.getEmail());
    }
}
