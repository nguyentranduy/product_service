package com.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product findById(Long id) {
		return productRepository.findByIdAndIsDeleted(id, Boolean.FALSE);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAllByIsDeleted(Boolean.FALSE);
	}

	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByNameContainsAndIsDeleted(name, Boolean.FALSE);
	}
}
