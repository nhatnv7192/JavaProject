package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDetailDao;
import com.entities.ProductDetail;

@Service
public class ProductDetailServicesImpl implements com.services.ProductDetailServices {

	@Autowired
	ProductDetailDao productDetailDao;
	@Transactional
	public List<ProductDetail> selectList() {
		// TODO Auto-generated method stub
		return productDetailDao.selectList();
	}

	@Transactional
	public boolean delete(ProductDetail productDetail) {
		// TODO Auto-generated method stub
		return productDetailDao.delete(productDetail);
	}

	@Transactional
	public boolean saveOrUpdate(ProductDetail productDetail) {
		// TODO Auto-generated method stub
		return productDetailDao.saveOrUpdate(productDetail);
	}

}
