package com.dao;

import java.util.List;

import com.entities.ProductImages;

public interface ProductImagesDao {
	public List<ProductImages> selectList();
	public boolean delete(ProductImages productImages);
	public boolean saveOrUpdate(ProductImages productImages);
}
