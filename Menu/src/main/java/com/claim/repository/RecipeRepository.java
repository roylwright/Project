package com.claim.repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, String> {
		
		@Query("Select R from Recipe R")
		public  ArrayList<Recipe> getAllRecipe();

		/*@Query("Select R from Recipe R where R.email IN :recipelist OR R.email=''")
		public ArrayList<Recipe> getAllRecipe(@Param("recipelist") ArrayList<String> recipeList);
*/}

	
	

