package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public class IngredientRepository {
	//@Query("Select I from Ingredient I where  IngredientId :ingredientlist order by createdDate DESC")
	//public List<Ingredient> findPost(@Param("ingredientlist") String[] ingredientList);
}
