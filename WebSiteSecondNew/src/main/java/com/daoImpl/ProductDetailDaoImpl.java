package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDetailDao;
import com.entities.ProductDetail;

@Repository
@Transactional
public class ProductDetailDaoImpl implements ProductDetailDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<ProductDetail> selectList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ProductDetail").list();
	}

	@Override
	public boolean delete(ProductDetail productDetail) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(productDetail);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	@Override
	public boolean saveOrUpdate(ProductDetail productDetail) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(productDetail);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
