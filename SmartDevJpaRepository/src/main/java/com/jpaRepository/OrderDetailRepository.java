package com.jpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer>{
	public List<OrderDetail> findAll();
}
