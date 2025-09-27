package com.vpcomtek.onlinebookstore.dto;

import com.vpcomtek.onlinebookstore.annotation.FieldMatch;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@FieldMatch(password = "password", repeatPassword = "repeatPassword")
public class UserRegistrationRequestDto {
    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Length(min = 8, max = 25)
    private String password;

    @NotBlank
    @Length(min = 8, max = 25)
    private String repeatPassword;

    @Length(max = 25)
    @NotBlank
    private String firstName;

    @Length(max = 25)
    @NotBlank
    private String lastName;

    @Length(min = 5, max = 100)
    private String shippingAddress;
}
