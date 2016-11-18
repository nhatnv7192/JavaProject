package com.dao;

import java.util.List;

import com.entities.ProductDetail;

public interface ProductDetailDao {
	public List<ProductDetail> selectList();
	public boolean delete(ProductDetail productDetail);
	public boolean saveOrUpdate(ProductDetail productDetail);
}
