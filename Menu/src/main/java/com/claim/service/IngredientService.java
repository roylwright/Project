package com.claim.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Ingredient;
import com.claim.repository.IngredientRepository;

@Service
public class IngredientService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Transactional
	public ArrayList<Ingredient> getAllIngredient() {
		return this.ingredientRepository.getAllIngredient();
	}

	public Ingredient find(String value) {
		return this.ingredientRepository.findOne(value);
	}

}
