package com.claim.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
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
import com.claim.entity.Post;
import com.claim.entity.Recipe;
import com.claim.service.EtceteraService;
import com.claim.service.PersonService;
import com.claim.service.PostService;
import com.claim.service.RecipeService;
import com.claim.service.SendMail;

@Controller
public class UserController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private RecipeService recipeService;
	
	@Autowired
	private EtceteraService ecteteraService;
	
	@Autowired
	private SendMail sendMail;
	
	@RequestMapping("/")
	public String index() {
		return "index"; //tell spring to find and display index
	}
	@RequestMapping(value="/login", method = RequestMethod.GET) 
	public ModelAndView login(Model model) {
	//public String login() {
		return new ModelAndView("login", "userLogin", new Person());
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST) 
	public ModelAndView handel(Model model, @ModelAttribute("userLogin") Person userLogin, 
			HttpSession session) {
	
		Person p = this.personService.login(userLogin.getEmail(), userLogin.getPassword());
		if(p !=null) {
			session.setAttribute("loggedInUser", p);
			ArrayList<String> recipeList = new ArrayList<String>();
			recipeList.add(p.getEmail());
			List<Recipe> recipes = recipeService.getAllRecipe(recipeList);
			ArrayList<String> etceteraList = new ArrayList<String>(); ///etc
			
			for (Recipe rec : recipes) {
				etceteraList.add(rec.getRecipeName());//etc
			}
			
			List<Etcetera> ect = null;
			if(etceteraList!= null) {
				 ect = ecteteraService.findAllEtcetera(etceteraList); //etc
				 session.setAttribute("etceteraList", ect);
			}
			
			System.out.println("Length of list: "+recipeList.size());
			session.setAttribute("recipies", recipes);
			
			
			return new ModelAndView("home", "recipie", new Recipe());
		}else {
			model.addAttribute("Login error", "username or password invalid");
			return new ModelAndView("login");
			}
		}
	@RequestMapping(value="/post", method = RequestMethod.POST)
	public ModelAndView post(Model model, @ModelAttribute("post") Recipe recipe, HttpSession session) {
		ArrayList<String> recipeList = new ArrayList<String>();
		ArrayList<String> etceteraList = new ArrayList<String>(); ///etc
		recipeList.add(recipe.getEmail());
		etceteraList.add(recipe.getRecipeName());//etc
		
		List<Recipe> recipes = recipeService.getAllRecipe(recipeList);
		List<Etcetera> ect = ecteteraService.findAllEtcetera(etceteraList); //etc
		
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
	
	@RequestMapping(value="/recipe", method = RequestMethod.GET) 
	public String getAddRecipeForm(Model model) {
		model.addAttribute("ingredient", new Ingredient());
		return "recipe";
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
					File fileToUpload = new File(path);
					String userPath = "\\img\\"+p.getEmail()+"\\"+name;
					
					FileUtils.writeByteArrayToFile(fileToUpload, file.getBytes());
					
					p.setProfilePic(userPath);
					personService.signUp(p);
					
				}catch(Exception e){	
			}
			this.addUserPost(model, p.getEmail());
			return "home";
	}
	private void addUserRecipe(Model model, String recipeName) {
		model.addAttribute("etcetera", new Etcetera());
		//model.addAttribute("ect", etceteraService.saveEtcetera(recipeName));
	}
	
	private void addUserPost(Model model, String email) {
		model.addAttribute("post", new Post());
		model.addAttribute("posts", postService.findMyPost(email));
	}
	
}
