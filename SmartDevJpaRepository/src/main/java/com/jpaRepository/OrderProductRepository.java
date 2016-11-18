package com.jpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer>{
	public List<OrderProduct> findAll();
}
