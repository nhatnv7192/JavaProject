package com.jpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.ProductImages;

public interface ProductImagesRepository extends JpaRepository<ProductImages,Integer>{
	public List<ProductImages> findAll();
}
