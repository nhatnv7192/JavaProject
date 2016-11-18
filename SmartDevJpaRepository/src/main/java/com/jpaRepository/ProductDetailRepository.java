package com.jpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer>{
	public List<ProductDetail> findAll();
}
