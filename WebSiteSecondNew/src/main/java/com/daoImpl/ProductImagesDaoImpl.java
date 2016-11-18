package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductImagesDao;
import com.entities.ProductImages;

@Repository
@Transactional
public class ProductImagesDaoImpl implements ProductImagesDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<ProductImages> selectList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ProductImages").list();
	}

	@Override
	public boolean delete(ProductImages productImages) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(productImages);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	@Override
	public boolean saveOrUpdate(ProductImages productImages) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(productImages);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
