package com.services;

import java.util.List;

import com.entities.OrderDetail;

public interface OrderDetailServices {
	public List<OrderDetail> selectList();
	public boolean delete(OrderDetail orderDetail);
	public boolean saveOrUpdate(OrderDetail orderDetail);
}
