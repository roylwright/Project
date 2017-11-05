package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Etcetera {
	@Id
	@Column
	private String ingredientName;
	@Column
	private String ingredientId;
	@Column
	private int ingredientCalories;
	@Column
	private int ingredientFat;
	@Column
	private int ingredientProtein;
	@Column
	private int ingredientCarbs;
	@Column
	private int ingredientGrams;
	@Column
	private int ingredientVolume;
	@Column
	private String recipeName;
	private String volume = ""; //setter only for display toString
	
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public int getIngredientCalories() {
		return ingredientCalories;
	}
	public void setIngredientCalories(int ingredientCalories) {
		this.ingredientCalories = ingredientCalories;
	}
	public int getIngredientFat() {
		return ingredientFat;
	}
	public void setIngredientFat(int ingredientFat) {
		this.ingredientFat = ingredientFat;
	}
	public int getIngredientProtein() {
		return ingredientProtein;
	}
	public void setIngredientProtein(int ingredientProtein) {
		this.ingredientProtein = ingredientProtein;
	}
	public int getIngredientCarbs() {
		return ingredientCarbs;
	}
	public void setIngredientCarbs(int ingredientCarbs) {
		this.ingredientCarbs = ingredientCarbs;
	}
	public String getIngredientId() {
		return ingredientId;
	}
	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}
	public int getIngredientGrams() {
		return ingredientGrams;
	}
	public void setIngredientGrams(int ingredientGrams) {
		this.ingredientGrams = ingredientGrams;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public int getIngredientVolume() {
		return ingredientVolume;
	}
	public void setIngredientVolume(int ingredientVolume) {
		this.ingredientVolume = ingredientVolume;
	}
	@Override
	public String toString() {
		setVolume();
			return ingredientName + volume;
	}
	public void setVolume() {
		if (ingredientVolume >= 8) { 
			volume = " (" + Integer.toString(ingredientVolume/8)+" cup";
			if (ingredientVolume%8 > 1)	
				{volume =volume+"s ";}
				else {volume=volume+" ";} //add pural
			if (ingredientVolume%8 > 0)	{
				volume = volume + Integer.toString(ingredientVolume%8) + " oz ) "
						+ ingredientCalories + " calories ";
			} else {
				volume = volume + ")";
			}
		} else  {
			volume = " (" + Integer.toString(ingredientVolume) + " oz )";
		}
	}
}
