package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.UserRegistrationRequestDto;
import com.vpcomtek.onlinebookstore.dto.UserResponseDto;

public interface UserService {
    UserResponseDto register(UserRegistrationRequestDto requestDto);
}
