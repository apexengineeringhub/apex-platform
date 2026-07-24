package com.apexengineeringhub.platform.service;

import com.apexengineeringhub.platform.dto.request.CreateUserRequest;
import com.apexengineeringhub.platform.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    /**
     * Constructor Injection
     * @param userRepository
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public String createUser(CreateUserRequest userRequest){
        log.info("Starting user creation process for email={}", userRequest.getEmail());
        userRepository.saveUser(userRequest);

        log.info("User creation process completed successfully for email={}", userRequest.getEmail());
        return "User created successfully.";
    }
}
