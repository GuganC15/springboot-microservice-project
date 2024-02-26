package com.amazon.amazonproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.amazonproduct.entity.Products;
import com.amazon.amazonproduct.repository.ProductsRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public Products saveProducts(Products products) {
		return productsRepository.save(products);
	}
	
	@Override
	public Products getProductsById(int productId) {
	 return productsRepository.findById(productId).get();
	}
	
}
