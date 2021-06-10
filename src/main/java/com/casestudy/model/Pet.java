package com.casestudy.model;

import javax.persistence.Column;

public class Pet implements java.io.Serializable {

	private int petId;
	private User user;
	private String petName;
	private Integer petAge;
	private String petPlace;

	public Pet() {
	}

	public Pet(int petId, String petName) {
		this.petId = petId;
		this.petName = petName;
	}

	public Pet(int petId, User user, String petName, Integer petAge, String petPlace) {
		this.petId = petId;
		this.user = user;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
	}

	public int getpetId() {
		return this.petId;
	}

	public void setpetId(int petId) {
		this.petId = petId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getpetName() {
		return this.petName;
	}

	public void setpetName(String petName) {
		this.petName = petName;
	}

	@Column(name = "petAge")
	public Integer getpetAge() {
		return this.petAge;
	}

	public void setpetAge(Integer petAge) {
		this.petAge = petAge;
	}

	public String getpetPlace() {
		return this.petPlace;
	}

	public void setpetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
}
