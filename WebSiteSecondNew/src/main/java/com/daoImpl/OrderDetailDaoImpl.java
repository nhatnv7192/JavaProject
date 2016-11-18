package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDetailDao;
import com.entities.OrderDetail;

@Repository
@Transactional
public class OrderDetailDaoImpl implements OrderDetailDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<OrderDetail> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdate(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
