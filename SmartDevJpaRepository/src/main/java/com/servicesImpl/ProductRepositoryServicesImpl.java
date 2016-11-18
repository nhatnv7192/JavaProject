package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Product;
import com.jpaRepository.ProductRepository;
import com.services.ProductRepositoryServices;

@Service
public class ProductRepositoryServicesImpl implements ProductRepositoryServices {

	@Autowired
	ProductRepository productRepository;
	
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
