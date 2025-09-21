package com.vpcomtek.onlinebookstore.validation;

import com.vpcomtek.onlinebookstore.annotation.FieldMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class PasswordMatchValidator implements ConstraintValidator<FieldMatch, Object> {
    private String passwordField;
    private String repeatPasswordField;

    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        this.passwordField = constraintAnnotation.password();
        this.repeatPasswordField = constraintAnnotation.repeatPassword();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(value)
                .getPropertyValue(passwordField);
        Object repeatPasswordValue = new BeanWrapperImpl(value)
                .getPropertyValue(repeatPasswordField);

        if (passwordValue == null && repeatPasswordValue == null) {
            return true;
        }
        if (passwordValue == null || repeatPasswordValue == null) {
            return false;
        }
        return passwordValue.equals(repeatPasswordValue);
    }
}
