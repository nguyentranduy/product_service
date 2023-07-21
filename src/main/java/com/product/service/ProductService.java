package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	Product findById(Long id);
	List<Product> findAll();
	List<Product> findByName(String name);
}
