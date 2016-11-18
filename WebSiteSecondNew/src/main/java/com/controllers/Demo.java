package com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.UserDao;
import com.entities.Category;
import com.entities.Product;
import com.entities.Users;
import com.services.CategoryServices;
import com.services.ProductServices;
import com.services.UserServices;


@Controller
public class Demo {
	
	@Autowired
	UserDao userServices;
//	UserServices userServices;
	@Autowired
	CategoryServices categoryServices;
	@Autowired
	ProductServices productServices;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String viewIndex(ModelMap mm)
	{
		System.out.println("bi cai gi day.................");
		System.out.println("Hello Nhat nGuyen");
		System.out.println("New Come ... Hahahah");
		List<Users> list = userServices.selectList();
		System.out.println("In ra "+list.get(0).getEmail());
		List<Category> listCategory = categoryServices.selectList();
		List<Product> listProduct = productServices.listProduct();
		
		mm.put("list", list);
		mm.put("listCategory", listCategory);
		mm.put("listProduct", listProduct);
		mm.put("message", "Hello world");
		System.out.println("xin chao moi nguoi...");
		System.out.println("hello world");
		return "home";
	}
	
//	 @RequestMapping(value = "/index", method = RequestMethod.GET)
//	    public ModelAndView getPage() {
//	        ModelAndView view = new ModelAndView("hello");
//	        return view;
//	    }
//	 
//	    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
//	    public @ResponseBody Map<String, Object> getSaved(Users users) {
//	        Map<String, Object> map = new HashMap<String, Object>();
//	 
//	        if (userServices.saveOrUpdate(users)) {
//	            map.put("status", "200");
//	            map.put("message", "Your record have been saved successfully");
//	        }
//	 
//	        return map;
//	    }
//	 
//	    @RequestMapping(value = "/list", method = RequestMethod.POST)
//	    public @ResponseBody Map<String, Object> getAll(Users users) {
//	        Map<String, Object> map = new HashMap<String, Object>();
//	 
//	        List<Users> list = userServices.selectList();
//	 
//	        if (list != null) {
//	            map.put("status", "200");
//	            map.put("message", "Data found");
//	            map.put("data", list);
//	        } else {
//	            map.put("status", "404");
//	            map.put("message", "Data not found");
//	 
//	        }
//	 
//	        return map;
//	    }
//	 
//	    @RequestMapping(value = "/delete", method = RequestMethod.POST)
//	    public @ResponseBody Map<String, Object> delete(Users users) {
//	        Map<String, Object> map = new HashMap<String, Object>();
//	 
//	        if (userServices.delete(users)) {
//	            map.put("status", "200");
//	            map.put("message", "Your record have been deleted successfully");
//	        }
//	 
//	        return map;
//	    }
	
}
