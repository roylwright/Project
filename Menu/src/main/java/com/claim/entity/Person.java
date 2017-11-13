package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@Column(name="email")
	private String email;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="profile_pic")
	private String profilePic;
	@Column(name="protein")
	private int protein;
	@Column(name="carb")
	private int carb;
	@Column(name="fat")
	private int fat;
	@Column(name="calorie")
	private int calorie;

	public int getCalorie() {
		return calorie;
	}
	public int getCarb() {
		return carb;
	}
	public String getEmail() {
		return email;
	}
	public int getFat() {
		return fat;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public int getProtein() {
		return protein;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public void setCarb(int carb) {
		this.carb = carb;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	
}
