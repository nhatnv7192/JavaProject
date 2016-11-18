package com.controllers;

import static org.mockito.Matchers.anyList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Category;
import com.entities.Product;
import com.mysql.jdbc.ResultSetMetaData;
import com.services.CategoryRepositoryServices;
import com.services.ProductRepositoryServices;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import sun.security.action.GetBooleanAction;

@Controller
public class AdminProduct {
	@Autowired
	private ProductRepositoryServices productRepositoryServices;
	@Autowired
	private CategoryRepositoryServices categoryRepositoryServices;
	
	
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public String viewAdminProduct()
	{
		return "admin";
	}
	@RequestMapping(value="/viewProduct",method = RequestMethod.GET)
	public String viewProduct(ModelMap modelMap)
	{
		//get lisProduct
		List<Product> listProduct = productRepositoryServices.findAll();
		modelMap.put("listProduct", listProduct);
		return "viewProduct";
	}
	@RequestMapping(value="/createProduct",method=RequestMethod.GET)
	public String createProduct(ModelMap modelMap)
	{
		List<Category> listCategory = categoryRepositoryServices.findAll();
		modelMap.put("listCategory", listCategory);
		return "createProduct";
	}
	@RequestMapping(value="/postCreateProduct",method=RequestMethod.POST)
	public String postCreateProduct(@RequestParam("categoryId") String categoryId,@RequestParam("name") String name,@RequestParam("price") float price,@RequestParam("discount") float discount,@RequestParam("status") String status,@RequestParam("imageUrl") String imageUrl,@RequestParam("description") String description)
	{
		
		return "";
	}
	
}
