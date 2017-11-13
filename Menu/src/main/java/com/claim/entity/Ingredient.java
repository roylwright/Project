package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ingredient {
	@Id
	@Column
	private String ingredientName;
	@Column
	private double calorie;
	@Column
	private double fat;
	@Column
	private double protein;
	@Column
	private double carb;
	@Column
	private double grams;
	@Column
	private double volume;
	public double getCalorie() {
		return calorie;
	}
	public double getCarb() {
		return carb;
	}
	public double getFat() {
		return fat;
	}
	public double getGrams() {
		return grams;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public double getProtein() {
		return protein;
	}
	public double getVolume() {
		return volume;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public void setCarb(int carb) {
		this.carb = carb;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public void setGrams(int grams) {
		this.grams = grams;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
