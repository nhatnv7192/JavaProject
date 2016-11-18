package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderProductDao;
import com.entities.OrderProduct;
import com.services.OrderProductServices;

@Service
public class OrderProductServicesImpl implements OrderProductServices{

	@Autowired
	OrderProductDao orderProductDao;
	@Transactional
	public List<OrderProduct> selectList() {
		// TODO Auto-generated method stub
		return orderProductDao.selectList();
	}

	@Transactional
	public boolean delete(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		return orderProductDao.delete(orderProduct);
	}

	@Transactional
	public boolean saveOrUpdate(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		return orderProductDao.saveOrUpdate(orderProduct);
	}
	
}
