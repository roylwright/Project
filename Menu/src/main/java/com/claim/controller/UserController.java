package com.claim.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Etcetera;
import com.claim.entity.Ingredient;
import com.claim.entity.Person;
import com.claim.entity.Recipe;
import com.claim.service.EtceteraService;
import com.claim.service.IngredientService;
import com.claim.service.PersonService;
import com.claim.service.RecipeService;
import com.claim.service.SendMail;

@Controller
public class UserController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private RecipeService recipeService;
	
	@Autowired
	private EtceteraService etceteraService;
	
	@Autowired
	private IngredientService ingredientService;
	
	@Autowired
	private SendMail sendMail;
	
	@RequestMapping(value="/addrecipe", method = RequestMethod.GET) 
	public ModelAndView addrecipe(HttpSession session) {
		List<Ingredient> ingredients = ingredientService.getAllIngredient();
		session.setAttribute("ingredients", ingredients);
		return new ModelAndView("addRecipe", "recipe", new Recipe());
	}
	
	@RequestMapping(value="/addingredient", method = RequestMethod.GET) 
	public ModelAndView addingredient(HttpSession session) {
		List<Ingredient> ingredients = ingredientService.getAllIngredient();
		session.setAttribute("ingredients", ingredients);
		return new ModelAndView("addIngredient", "ingredient", new Ingredient());
	}
	
	@RequestMapping(value="/createRecipe", method = RequestMethod.POST) 
	public ModelAndView createRecipe(Model model, @ModelAttribute("recipe")Recipe recipe, HttpSession session) {
		session.setAttribute("added", "New Recipe ADDED!!!!");
		recipeService.addRecipe(recipe);
		
		
		
		/*Code to send to home page*/
		List<Recipe> recipes = recipeService.getAllRecipes();
		session.setAttribute("recipies",recipes);
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/saveRecipe", method = RequestMethod.POST)
	public ModelAndView addrecipe(Model model, @RequestParam("newI") String value, HttpSession session) {
		String rname = (String) session.getAttribute("rname");	
		System.out.println("Adding Ingredient: "+value+" to recipe "+ rname);
		Recipe recipe = recipeService.getRecipe(rname);
		
		Ingredient ingredient = ingredientService.find(value);
		Etcetera etc = new Etcetera();
		etc.setIngredientName(ingredient.getIngredientName());
		etc.setIngredientCalories(ingredient.getCalorie());
		etc.setIngredientCarbs(ingredient.getCarb());
		etc.setIngredientFat(ingredient.getFat());
		etc.setIngredientProtein(ingredient.getProtein());
		etc.setIngredientGrams(ingredient.getGrams());
		etc.setIngredientVolume(4);
		recipe.getEtceteras().add(etc);
		
		double totalCarbs =0;
		for (Etcetera etcetra : recipe.getEtceteras()) {
			totalCarbs += etcetra.getIngredientCarbs();
		}
		recipe.setTotalCarbs(totalCarbs);
		
		double totalCal =0;
		for (Etcetera etcetra : recipe.getEtceteras()) {
			totalCal += etcetra.getIngredientCalories();
		}
		recipe.setTotalCalories(totalCal);
		
		double totalFat =0;
		for (Etcetera etcetra : recipe.getEtceteras()) {
			totalFat += etcetra.getIngredientFat();
		}
		recipe.setTotalFat(totalFat);
		
		double totalPro =0;
		for (Etcetera etcetra : recipe.getEtceteras()) {
			totalPro += etcetra.getIngredientProtein();
		}
		
		recipe.setTotalProtein(totalPro);
		
		recipeService.addRecipe(recipe);
		List<Recipe> recipes = recipeService.getAllRecipes();
		session.setAttribute("recipies",recipes);
					
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/editRecipe", method = RequestMethod.GET)
	public ModelAndView editRecipe(Model model, @RequestParam("rname")String rname, HttpSession session) {
			Recipe recipe = recipeService.getRecipe(rname);
			session.setAttribute("rname", rname);
			ArrayList<Ingredient> ingredients = ingredientService.getAllIngredient();
			session.setAttribute("ingredients", ingredients);
			System.out.println("List of ingredients: "+ingredients.size());
			return new ModelAndView("editRecipe",  "recipe", recipe);
	}
	/*	this.etceteraService.saveEtcetera(newEtcetera);
			Recipe myRecipe  = new Recipe();
			myRecipe.setRecipeName(newEtcetera.getRecipeName());
			myRecipe.setEmail("");
			recipeService.addRecipe(myRecipe);
			List<Ingredient> ingredients = ingredientService.getAllIngredient();
			session.setAttribute("ingredients", ingredients);
			List<Recipe> recipes = recipeService.getAllRecipes();
			session.setAttribute("recipes", recipes);
			return new ModelAndView("index",  "makerecipe", new Recipe()); */
	
	@RequestMapping(value="/addingredient", method = RequestMethod.POST)
	public ModelAndView addrecipe(Model model, @ModelAttribute("ingredient") Etcetera newEtcetera, HttpSession session) {
			etceteraService.saveEtcetera(newEtcetera);
			session.setAttribute("ingredientName", newEtcetera.getIngredientName());
			return new ModelAndView("addIngredient",  "ingredient", new Etcetera());
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST) 
	public ModelAndView handel(Model model, @ModelAttribute("userLogin") Person userLogin, 
			HttpSession session) {
	
		Person p = this.personService.login(userLogin.getEmail(), userLogin.getPassword());
		if(p !=null) {
			session.setAttribute("loggedInUser", p);
			List<Recipe> recipes = recipeService.getAllRecipes();
			session.setAttribute("recipies",recipes);
						
			return new ModelAndView("home");
		}else {
			model.addAttribute("Login error", "username or password invalid");
			return new ModelAndView("login");
			}
		}
	@RequestMapping("/")
	public ModelAndView index(HttpSession session) {
		//
		List<Ingredient> ingredients = ingredientService.getAllIngredient();
		session.setAttribute("ingredients", ingredients);
		
		return new ModelAndView("index","makerecipe", new Recipe()); //tell spring to find and display index
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET) 
	public ModelAndView login(Model model) {
	//public String login() {
		return new ModelAndView("login", "userLogin", new Person());
	}
	
	
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public ModelAndView post(Model model, @ModelAttribute("post") Recipe recipe, HttpSession session) {
		ArrayList<String> recipeList = new ArrayList<String>();
		ArrayList<String> etceteraList = new ArrayList<String>(); ///etc
		recipeList.add(recipe.getEmail());
		etceteraList.add(recipe.getRecipeName());//etc
		
		List<Recipe> recipes = recipeService.getAllRecipes();
		List<Etcetera> ect = etceteraService.findAllEtcetera(etceteraList); //etc
		
		
		
		System.out.println("Length of list: "+recipeList.size());
		System.out.println("Length of etc list: "+etceteraList.size());
		session.setAttribute("etceteraList", etceteraList);
		//this.addUserPost(model,  post.getEmail());
		return new ModelAndView("home", "recipies", recipes ); 
				//new ModelAndView("home", "ect", ect); //maybe duplication	
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET) 
	public ModelAndView signup() {
		return new ModelAndView("signup", "userSignup", new Person());
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST) 
	public ModelAndView signup(Model model, @ModelAttribute("userSignup") Person newUser) {
		this.personService.signUp(newUser);
		this.sendMail.sendMail(newUser.getEmail(), "Welcome", "You are now signed up for Diet Destricter, "
				+ "if you wish to contact me, my email address is RoyLWright@gmail.com");
		return login(model); 			
	}

	@RequestMapping(value="/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, HttpSession session, Model model) {
		
		Person p = (Person) session.getAttribute("loggedInUser");
				try {
					String name = file.getOriginalFilename();
					String basepath = "src\\main\\resources\\static\\img\\";
					String path = basepath + p.getEmail()+"\\"+name;
					String userPath = "\\img\\"+p.getEmail()+"\\"+name;
					
					
					p.setProfilePic(userPath);
					personService.signUp(p);
					
				}catch(Exception e){	
			}
			
			return "home";
	}
	@RequestMapping(value="/menu", method = RequestMethod.GET) 
	public ModelAndView menu() {
			
		return new ModelAndView();
	}
	
}
