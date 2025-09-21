package com.vpcomtek.onlinebookstore.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String shippingAddress;
}
