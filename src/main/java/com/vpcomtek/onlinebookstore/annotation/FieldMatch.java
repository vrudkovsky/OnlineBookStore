package com.vpcomtek.onlinebookstore.annotation;

import com.vpcomtek.onlinebookstore.validation.PasswordMatchValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordMatchValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldMatch {
    String message() default "Passwords must match";
    String password();
    String repeatPassword();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
