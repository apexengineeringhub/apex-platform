package com.apexengineeringhub.platform.repository;

import com.apexengineeringhub.platform.dto.request.CreateUserRequest;


import org.springframework.stereotype.Repository;


public interface UserRepository {
    void saveUser(CreateUserRequest request);

}
