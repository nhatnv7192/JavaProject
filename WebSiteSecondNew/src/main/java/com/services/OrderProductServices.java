package com.services;

import java.util.List;

import com.entities.OrderProduct;

public interface OrderProductServices {
	public List<OrderProduct> selectList();
	public boolean delete(OrderProduct orderProduct);
	public boolean saveOrUpdate(OrderProduct orderProduct);
}
