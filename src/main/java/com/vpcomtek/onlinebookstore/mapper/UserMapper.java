package com.vpcomtek.onlinebookstore.mapper;

import com.vpcomtek.onlinebookstore.config.MapperConfig;
import com.vpcomtek.onlinebookstore.dto.UserRegistrationRequestDto;
import com.vpcomtek.onlinebookstore.dto.UserResponseDto;
import com.vpcomtek.onlinebookstore.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {

    UserResponseDto toDto(User user);

    User toModel(UserRegistrationRequestDto requestDto);
}
