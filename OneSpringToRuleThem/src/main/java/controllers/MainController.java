package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Menu;
import repository.MenuRepository;

@Controller
public class MainController {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@RequestMapping("")
	public String index(ModelMap model)  {
		List<Menu> menus = menuRepository.findAll();
		
		model.put("theMenu", menus);
		
		return"index";
	}

}
