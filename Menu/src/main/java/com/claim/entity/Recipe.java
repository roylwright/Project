package com.claim.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Recipe { 
	@Id
	@Column
	private String recipeName;
	@Column
	private int totalCalories;
	@Column
	private int totalFat;
	@Column
	private int totalProtein;
	@Column
	private int totalCarbs;
	@Column
	private int totalVolume;
	@Column 
	private String text;
	@Column
	private String email;
	
	
	@OneToMany
	@JoinColumn(name="email", insertable=false, updatable=false)
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public int getTotalCalories() {
		return totalCalories;
	}
	public void setTotalCalories(int totalCalories) {
		this.totalCalories = totalCalories;
	}
	public int getTotalFat() {
		return totalFat;
	}
	public void setTotalFat(int totalFat) {
		this.totalFat = totalFat;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotalProtein() {
		return totalProtein;
	}
	public void setTotalProtein(int totalProtein) {
		this.totalProtein = totalProtein;
	}
	public int getTotalCarbs() {
		return totalCarbs;
	}
	public void setTotalCarbs(int totalCarbs) {
		this.totalCarbs = totalCarbs;
	}
	public int getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(int volume) {
		this.totalVolume = volume;
	}

}
