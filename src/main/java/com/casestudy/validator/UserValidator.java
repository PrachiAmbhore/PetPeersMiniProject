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
		ValidationUtils.rejectIfEmpty(errors, "userid", "UserId is required");
		ValidationUtils.rejectIfEmpty(errors, "username", "Username is Required");
		ValidationUtils.rejectIfEmpty(errors, "userpassword", "Password is Required");
		ValidationUtils.rejectIfEmpty(errors, "confirmpassword", "Confirm Password is Required");
	}
}
