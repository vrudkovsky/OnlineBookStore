package com.vpcomtek.onlinebookstore.service;

import com.vpcomtek.onlinebookstore.dto.UserRegistrationRequestDto;
import com.vpcomtek.onlinebookstore.dto.UserResponseDto;
import com.vpcomtek.onlinebookstore.exception.RegistrationException;
import com.vpcomtek.onlinebookstore.mapper.UserMapper;
import com.vpcomtek.onlinebookstore.model.User;
import com.vpcomtek.onlinebookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Override
    public UserResponseDto register(
            UserRegistrationRequestDto requestDto
    ) {
        if (userRepository.existsByEmail(requestDto.getEmail())) {
            throw new RegistrationException(
                    "User already exists by email " + requestDto.getEmail());
        }

        User model = mapper.toModel(requestDto);
        userRepository.save(model);

        return mapper.toDto(model);
    }
}
