package com.dao;

import java.util.List;

import com.entities.OrderDetail;

public interface OrderDetailDao {
	public List<OrderDetail> selectList();
	public boolean delete(OrderDetail orderDetail);
	public boolean saveOrUpdate(OrderDetail orderDetail);
}
