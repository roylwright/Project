package com.claim.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Recipe;
import com.claim.repository.RecipeRepository;



@Service
public class RecipeService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Transactional
	public Recipe pageset(Recipe recipe) {
		return this.recipeRepository.save(recipe);
	}
	
	@Transactional
	public ArrayList<Recipe> getAllRecipe(ArrayList<String> recipeList) {
		return this.recipeRepository.getAllRecipie(recipeList);
	}

}
