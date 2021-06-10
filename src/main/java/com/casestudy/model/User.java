package com.casestudy.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;*/
import org.springframework.beans.factory.annotation.Autowired;

public class User implements java.io.Serializable {

	@Autowired
	private Pet pet;

	private int userId;
	private String userName;
	private String userPassword;
	private String confirmPassword;
	private Set pets = new HashSet();

	public User() {

	}

	public User(int userd, String userName, String userPassword, String confirmPassword) {
		this.userId = userd;
		this.userName = userName;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
	}

	public User(int userId, String userName, String userPassword, String confirmPassword, Set pets) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.pets = pets;
		this.confirmPassword = confirmPassword;
	}

	public int getUserid() {
		return this.userId;
	}

	public void setUserid(int userId) {
		this.userId = userId;
	}

	public String getuserName() {
		return this.userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getuserPassword() {
		return this.userPassword;
	}

	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmuserPassword() {
		return this.confirmPassword;
	}

	public void setConfirmuserPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set getPets() {
		return this.pets;
	}

	public void setPets(Set pets) {
		this.pets = pets;
	}
}
