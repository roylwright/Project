package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table
public class Etcetera {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int EId;
	
	@Column
	private String ingredientName;
	@Column
	private double ingredientCalories=0.0;
	@Column
	private double ingredientFat=0.0;
	@Column
	private double ingredientProtein=0.0;
	@Column
	private double ingredientCarbs=0.0;
	@Column
	private double ingredientGrams=0.0;
	@Column
	private double ingredientVolume=0.0;
		
	
	@Column
	private String recipeName;
	private String volume = ""; //setter only for display toString
	
	public double getIngredientCalories() {
		return ingredientCalories;
	}
	public double getIngredientCarbs() {
		return ingredientCarbs;
	}
	public double getIngredientFat() {
		return ingredientFat;
	}
	public double getIngredientGrams() {
		return ingredientGrams;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public double getIngredientProtein() {
		return ingredientProtein;
	}
	public double getIngredientVolume() {
		return ingredientVolume;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setIngredientCalories(int ingredientCalories) {
		this.ingredientCalories = ingredientCalories;
	}
	public void setIngredientCarbs(int ingredientCarbs) {
		this.ingredientCarbs = ingredientCarbs;
	}
	public void setIngredientFat(int ingredientFat) {
		this.ingredientFat = ingredientFat;
	}
	public void setIngredientGrams(int ingredientGrams) {
		this.ingredientGrams = ingredientGrams;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public void setIngredientProtein(int ingredientProtein) {
		this.ingredientProtein = ingredientProtein;
	}
	public void setIngredientVolume(int ingredientVolume) {
		this.ingredientVolume = ingredientVolume;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public void setIngredientCalories(double ingredientCalories) {
		this.ingredientCalories = ingredientCalories;
	}
	public void setIngredientFat(double ingredientFat) {
		this.ingredientFat = ingredientFat;
	}
	public void setIngredientProtein(double ingredientProtein) {
		this.ingredientProtein = ingredientProtein;
	}
	public void setIngredientCarbs(double ingredientCarbs) {
		this.ingredientCarbs = ingredientCarbs;
	}
	public void setIngredientGrams(double ingredientGrams) {
		this.ingredientGrams = ingredientGrams;
	}
	public void setIngredientVolume(double ingredientVolume) {
		this.ingredientVolume = ingredientVolume;
	}
	
	
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	@Override
	public String toString() {
		
			return ingredientName + ingredientVolume;
	}
	
}
