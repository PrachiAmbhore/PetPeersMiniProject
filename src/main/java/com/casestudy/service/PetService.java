package com.casestudy.service;

import java.util.List;

import com.casestudy.model.Pet;

public interface PetService {
	public abstract List<Pet> getAllPets();
	public abstract void savePet(Pet pet);
}
