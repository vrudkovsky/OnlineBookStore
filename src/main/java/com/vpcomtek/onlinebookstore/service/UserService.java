package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.UserRegistrationRequestDto;
import com.vpcomtek.onlinebookstore.dto.UserResponseDto;
import com.vpcomtek.onlinebookstore.exception.RegistrationException;

public interface UserService {
    UserResponseDto register(UserRegistrationRequestDto requestDto) throws RegistrationException;
}
