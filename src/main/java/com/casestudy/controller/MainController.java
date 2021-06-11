package com.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.exception.PetException;
import com.casestudy.exception.UserException;
import com.casestudy.model.Pet;
import com.casestudy.model.User;
import com.casestudy.service.PetService;
import com.casestudy.service.UserService;
import com.casestudy.validator.PetValidator;
import com.casestudy.validator.UserValidator;

@Controller
public class MainController{
	@Autowired
	private UserValidator uerValidator;
	
	@Autowired
	private PetValidator petValidator;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private PetService petservice;
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	@ExceptionHandler({UserException.class})
	public ModelAndView saveUser(@ModelAttribute("user") User user , BindingResult bindingResult) throws UserException {
		ModelAndView modelAndView = new ModelAndView("loginPage");
		if(user.getuserName().length() <= 4) {
			throw new UserException("Given name is too short");
		}
		if(user.getuserPassword().length() <= 8) {
			throw new UserException("Given paasword is too short");
		}
		
		uerValidator.validate(modelAndView,bindingResult);
		userservice.saveUser(user);
		modelAndView.addObject("save", user.getuserName());
		return modelAndView;
	}
	
	@RequestMapping(value = "/authenticateUser", method=RequestMethod.GET)
	public ModelAndView authenticateUser(HttpRequest request, @ModelAttribute("user") User user) {
		ModelAndView modelAndView = null;
		if(user != null) {
			if(userservice.authenticateUser()) {
				modelAndView = new ModelAndView("homePage");
				modelAndView.addObject("authenticateUser", user.getuserName());
			}
		} else {
			modelAndView = new ModelAndView("loginPage");
			modelAndView.addObject("message", "Username or Password is wrong!!");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView("homePage");
		modelAndView.addObject(userservice.getMyPets(0));
		return modelAndView;
	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.GET)
	public ModelAndView userLogout(HttpRequest request) {
		ModelAndView modelAndView = new ModelAndView("loginPage");
		return modelAndView;
	}
	
	@RequestMapping(value = "/myPets", method=RequestMethod.GET)
	public ModelAndView myPets(HttpRequest request){
		ModelAndView modelAndView = new ModelAndView("mypetsPage");
		modelAndView.addObject(userservice.getMyPets(0));
		return modelAndView;
	}
	
	@RequestMapping(value = "/savePet", method=RequestMethod.POST)
	@ExceptionHandler({PetException.class})
	public ModelAndView savePet(@ModelAttribute("pet") Pet pet, BindingResult bindingResult ) throws PetException {
		ModelAndView modelAndView = new ModelAndView("addPage");
		if(pet.getpetName().length() <= 4) {
			throw new PetException("Given name is too short");
		}
		if(pet.getpetAge() <= 2) {
			throw new PetException("Given age is too short");
		} 
		petValidator.validate(modelAndView,bindingResult);
		petservice.savePet(pet);
		return modelAndView;
	}
	
	@RequestMapping(value = "/buyPet", method=RequestMethod.PUT)
	public ModelAndView buyPet(HttpRequest request){
		ModelAndView modelAndView = new ModelAndView("myPetsPage");
		userservice.buyPet(0);
		modelAndView.addObject("buy","deletion done");
		return modelAndView;
	}
}
