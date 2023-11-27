package com.example.userserviceapplication.service;

import com.example.userserviceapplication.dto.UserDto;
import com.example.userserviceapplication.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
