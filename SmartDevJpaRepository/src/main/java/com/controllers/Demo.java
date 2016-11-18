package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Category;
import com.entities.OrderDetail;
import com.entities.OrderProduct;
import com.entities.Product;
import com.entities.ProductDetail;
import com.entities.ProductImages;
import com.jpaRepository.CategoryRepository;
import com.jpaRepository.OrderDetailRepository;
import com.jpaRepository.OrderProductRepository;
import com.jpaRepository.ProductDetailRepository;
import com.jpaRepository.ProductImagesRepository;
import com.jpaRepository.ProductRepository;
import com.services.CategoryRepositoryServices;

@Controller
public class Demo {
	@Autowired
//	private CategoryRepository categoryRepository = null;
	private CategoryRepositoryServices categoryRepositoryServices;
	
	@Autowired
	private OrderDetailRepository orderDetailRepository = null;
	
	@Autowired
	private OrderProductRepository orderProductRepository = null;
	
	@Autowired
	private ProductRepository productRepository = null;
	
	@Autowired
	private ProductDetailRepository productDetailRepository = null;
	
	@Autowired
	private ProductImagesRepository productImagesRepository = null;
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String viewIndex(ModelMap modelMap)
	{
//		List<Category> listCategory = categoryRepository.findAll();
		List<Category> listCategory = categoryRepositoryServices.findAll();
		System.out.println("in ra ten :"+listCategory.get(0).getName());
		modelMap.put("listCategory", listCategory);
		
		List<OrderDetail> listOrderDetail = orderDetailRepository.findAll();
		System.out.println("In ra orderDetail :"+listOrderDetail.get(0).getPrice());
		modelMap.put("listOrderDetail", listOrderDetail);
		
		List<OrderProduct> listOrderProduct = orderProductRepository.findAll();
		modelMap.put("listOrderProduct",listOrderProduct);
		
		List<Product> listProduct = productRepository.findAll();
		modelMap.put("listProduct", listProduct);
		
		List<ProductDetail> listProductDetail = productDetailRepository.findAll();
		modelMap.put("listProductDetail",listProductDetail);
		
		List<ProductImages> listProductImages = productImagesRepository.findAll();
		modelMap.put("listProductImages", listProductImages);
		
		return "home";
	}
}
