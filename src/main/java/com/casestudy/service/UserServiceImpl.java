package com.casestudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.dao.UserDao;
import com.casestudy.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;

	@Override
	public User authenticateUser() {
		return userdao.authenticateUser();
	}

	@Override
	public void saveUser(User user) {
		userdao.saveUser(user);
	}

	@Override
	public List<User> getMyPets(int id) {
		return userdao.getMyPets(id);		
	}

	@Override
	public void buyPet(int id, int a) {
		userdao.buyPet(id, a);
	}
	

}
