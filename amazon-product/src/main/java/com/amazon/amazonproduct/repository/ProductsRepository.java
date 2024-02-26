package com.amazon.amazonproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.amazonproduct.entity.Products;


public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
