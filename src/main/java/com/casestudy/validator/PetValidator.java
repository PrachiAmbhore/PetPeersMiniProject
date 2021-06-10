package com.casestudy.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.casestudy.model.Pet;

public class PetValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Pet.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "petid", "PetId is required");
		ValidationUtils.rejectIfEmpty(errors, "petname", "Petname is Required");
		ValidationUtils.rejectIfEmpty(errors, "petage", "Petage is Required");
		ValidationUtils.rejectIfEmpty(errors, "petplace", "Petplace is required");	
	}
}
