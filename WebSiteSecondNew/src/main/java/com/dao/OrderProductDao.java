package com.dao;

import java.util.List;

import com.entities.OrderProduct;

public interface OrderProductDao {
	public List<OrderProduct> selectList();
	public boolean delete(OrderProduct orderProduct);
	public boolean saveOrUpdate(OrderProduct orderProduct);
}
