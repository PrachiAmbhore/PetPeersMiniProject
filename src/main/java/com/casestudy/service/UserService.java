package com.casestudy.service;

import java.util.List;

import com.casestudy.model.User;

public interface UserService {
	public abstract User authenticateUser();
	public abstract void saveUser(User user);
	public abstract List<User> getMyPets(int id);
	public abstract void buyPet(int id, int a);
	
}
