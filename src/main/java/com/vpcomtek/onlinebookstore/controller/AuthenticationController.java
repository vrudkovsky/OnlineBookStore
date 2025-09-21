package com.vpcomtek.onlinebookstore.controller;

import com.vpcomtek.onlinebookstore.dto.UserRegistrationRequestDto;
import com.vpcomtek.onlinebookstore.dto.UserResponseDto;
import com.vpcomtek.onlinebookstore.exception.RegistrationException;
import com.vpcomtek.onlinebookstore.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final UserService userService;

    @PostMapping("/registration")
    public UserResponseDto registerUser(
            @RequestBody @Valid UserRegistrationRequestDto requestDto
    ) throws RegistrationException {
        return userService.register(requestDto);
    }
}
