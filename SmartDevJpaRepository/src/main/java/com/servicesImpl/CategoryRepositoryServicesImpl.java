package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Category;
import com.jpaRepository.CategoryRepository;
import com.services.CategoryRepositoryServices;

@Service
public class CategoryRepositoryServicesImpl implements CategoryRepositoryServices {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Transactional
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
