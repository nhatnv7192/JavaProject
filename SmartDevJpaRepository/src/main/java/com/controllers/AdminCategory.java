package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Category;
import com.services.CategoryRepositoryServices;

@Controller
public class AdminCategory {
	
	@Autowired
	private CategoryRepositoryServices categoryRepositoryServices;
	
	@RequestMapping(value="/viewCategory",method =RequestMethod.GET)
	public String viewCategory(ModelMap modelMap)
	{
		List<Category> listCategory = categoryRepositoryServices.findAll();
		modelMap.put("listCategory", listCategory);
		return "viewCategory";
	}
	
	@RequestMapping(value="/createCategory",method= RequestMethod.GET)
	public String createCategory()
	{
		return "createCategory";
	}
	
	@RequestMapping(value="/postCreateCategory",method= RequestMethod.POST)
	public String postCreateCategory()
	{
		return "";
	}
	
}
