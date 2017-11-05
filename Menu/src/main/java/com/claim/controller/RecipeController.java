package com.claim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addRecipeForm")
public class RecipeController {
	    @RequestMapping(method=RequestMethod.POST)
	    public String addRecipe() {
	        

	       
	        return "recipe";
	    }
		
}
