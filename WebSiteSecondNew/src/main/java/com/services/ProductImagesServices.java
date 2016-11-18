package com.services;

import java.util.List;

import com.entities.ProductImages;

public interface ProductImagesServices {
	public List<ProductImages> selectList();
	public boolean delete(ProductImages productImages);
	public boolean saveOrUpdate(ProductImages productImages);
}
