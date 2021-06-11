package com.casestudy.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.casestudy.model.User;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "userId", "UserId is required");
		ValidationUtils.rejectIfEmpty(errors, "userName", "Username is Required");
		ValidationUtils.rejectIfEmpty(errors, "userPassword", "Password is Required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "Confirm Password is Required");
	}
}
