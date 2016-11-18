package com.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productimages")
public class ProductImages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productimagesId")
	private int productimagesId;
	
	@Column(name="productId",insertable = false,updatable = false)
	private int productId;
	
	@Column(name="imageUrl")
	private String imageUrl;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name="productId")
	private Product product;

	public int getProductimagesId() {
		return productimagesId;
	}

	public void setProductimagesId(int productimagesId) {
		this.productimagesId = productimagesId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
