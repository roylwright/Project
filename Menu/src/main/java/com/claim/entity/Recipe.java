package com.claim.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Recipe { 
	@Override
	public String toString() {
		return recipeName + "Cal=" + totalCalories + ", Fat=" + totalFat
				+ ", Protein=" + totalProtein + ", Carbs=" + totalCarbs;
	}

	@Id
	@Column
	private String recipeName;
	@Column
	private double totalCalories;
	@Column
	private double totalFat;
	@Column
	private double totalProtein;
	@Column
	private double totalCarbs;
	@Column
	private double totalVolume;
	@Column 
	private String text;
	@Column
	private String email;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Etcetera> etceteras = new ArrayList<Etcetera>();
	
	public String getEmail() {
		return email;
	}
	
	public String getRecipeName() {
		return recipeName;
	}
	public String getText() {
		return text;
	}
	public double getTotalCalories() {
		
		return totalCalories;
	}
	public double getTotalCarbs() {
		return totalCarbs;
	}
	public double getTotalFat() {
		return totalFat;
	}
	public double getTotalProtein() {
		return totalProtein;
	}
	public double getTotalVolume() {
		return totalVolume;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	public void setTotalCarbs(double totalCarbs) {
		
		this.totalCarbs = totalCarbs;
	}
	
	public void setTotalFat(double totalFat) {
		
		this.totalFat = totalFat;
	}

	public void setTotalProtein(double totalProtein) {
		
		this.totalProtein = totalProtein;
	}
	
	public void setTotalVolume(double totalVolume) {
		this.totalVolume = totalVolume;
	}

	public List<Etcetera> getEtceteras() {
		return etceteras;
	}

	public void setEtceteras(List<Etcetera> etceteras) {
		this.etceteras = etceteras;
	}

	
}
