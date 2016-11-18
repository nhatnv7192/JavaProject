package com.services;

import java.util.List;

import com.entities.ProductDetail;

public interface ProductDetailServices {
	public List<ProductDetail> selectList();
	public boolean delete(ProductDetail productDetail);
	public boolean saveOrUpdate(ProductDetail productDetail);
}
