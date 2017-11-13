package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {
	@Query("Select I from Ingredient I")
	public ArrayList<Ingredient> getAllIngredient();
	
		
	
}
