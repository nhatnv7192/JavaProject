package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductImagesDao;
import com.entities.ProductImages;
import com.services.ProductImagesServices;

@Service
public class ProductImagesServicesImpl implements ProductImagesServices {
	
	@Autowired
	ProductImagesDao productImagesDao;
	
	@Transactional
	public List<ProductImages> selectList() {
		// TODO Auto-generated method stub
		return productImagesDao.selectList();
	}

	@Transactional
	public boolean delete(ProductImages productImages) {
		// TODO Auto-generated method stub
		return productImagesDao.delete(productImages);
	}

	@Transactional
	public boolean saveOrUpdate(ProductImages productImages) {
		// TODO Auto-generated method stub
		return productImagesDao.saveOrUpdate(productImages);
	}

}
