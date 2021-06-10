package com.casestudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.dao.PetDao;
import com.casestudy.dao.UserDao;
import com.casestudy.model.Pet;

public class PetServiceImpl implements PetService{

	@Autowired
	private PetDao petdao;
	
	@Override
	public List<Pet> getAllPets() {
		return petdao.getAllPets();
	}

	@Override
	public void savePet(Pet pet) {
		petdao.savePet(pet);
	}
}
