package com.casestudy.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


public class GlobalEException {
	@ExceptionHandler(PetException.class)
	public ModelAndView processPetException (Exception exception)
	{
		ModelAndView modelAndView = new ModelAndView("homePage");
		modelAndView.addObject("petexception", exception.getMessage());
		return modelAndView;
	}
	
	@ExceptionHandler(UserException.class)
	public ModelAndView processUserException (Exception exception)
	{
		ModelAndView modelAndView = new ModelAndView("registrationPage");
		modelAndView.addObject("userexception", exception.getMessage());
		return modelAndView;
	}

}
