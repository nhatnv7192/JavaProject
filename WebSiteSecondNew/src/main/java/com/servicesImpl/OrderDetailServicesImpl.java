package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDetailDao;
import com.entities.OrderDetail;
import com.services.OrderDetailServices;

@Service
public class OrderDetailServicesImpl implements OrderDetailServices {

	@Autowired
	OrderDetailDao orderDetailDao;
	
	@Transactional
	public List<OrderDetail> selectList() {
		// TODO Auto-generated method stub
		return orderDetailDao.selectList();
	}

	@Transactional
	public boolean delete(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return orderDetailDao.delete(orderDetail);
	}

	@Transactional
	public boolean saveOrUpdate(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return orderDetailDao.saveOrUpdate(orderDetail);
	}

}
