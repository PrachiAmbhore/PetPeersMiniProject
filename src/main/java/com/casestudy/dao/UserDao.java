package com.casestudy.dao;

import java.util.List;

import com.casestudy.model.User;

public interface UserDao {
	public abstract User authenticateUser();
	public abstract void saveUser(User user);
	public abstract List<User> getMyPets(int id);
	public abstract void buyPet(int id, int a);
}
