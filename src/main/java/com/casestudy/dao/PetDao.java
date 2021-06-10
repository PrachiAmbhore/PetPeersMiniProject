package com.casestudy.dao;

import java.util.List;

import com.casestudy.model.Pet;

public interface PetDao {
	public abstract List<Pet> getAllPets();
	public abstract void savePet(Pet pet);

}
