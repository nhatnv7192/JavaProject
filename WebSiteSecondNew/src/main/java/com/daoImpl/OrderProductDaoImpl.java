package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderProductDao;
import com.entities.OrderProduct;

@Repository
@Transactional
public class OrderProductDaoImpl implements OrderProductDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<OrderProduct> selectList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from OrderProduct").list();
	}

	@Override
	public boolean delete(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(orderProduct);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	@Override
	public boolean saveOrUpdate(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(orderProduct);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
