package com.example.demo.validations;

import com.example.demo.annotations.PasswordMatches;
import com.example.demo.payload.request.SignUpRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public boolean isValid(Object s, ConstraintValidatorContext constraintValidatorContext) {
        SignUpRequest user = (SignUpRequest) s;
        return user.getPassword().equals(user.getConfirmPassword());

    }
}
