package com.amazon.amazonproduct.service;

import com.amazon.amazonproduct.entity.Products;

public interface ProductService {
	
	public Products saveProducts(Products products);
	
	public Products getProductsById(int productId);

}
