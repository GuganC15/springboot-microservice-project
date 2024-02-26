package com.amazon.amazonproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.amazonproduct.entity.Products;
import com.amazon.amazonproduct.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/products")
public class ProductsController {

	@Autowired
	public ProductService productService;
	
	@PostMapping("/productInsert")
	public ResponseEntity<Products> saveProducts(@RequestBody Products products){
		Products saveProducts=productService.saveProducts(products);
		return new ResponseEntity<>(saveProducts,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable("id") int productId){
	   Products products=productService.getProductsById(productId);
	   return ResponseEntity.ok(products);
	}
}
