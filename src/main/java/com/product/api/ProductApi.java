package com.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductApi {

	@Autowired
	ProductService productService;
	
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		Product product = productService.findById(id);
		if (product != null) {
			return ResponseEntity.ok(product);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/product/")
	public ResponseEntity<?> getAll() {
		List<Product> products = productService.findAll();
		return ResponseEntity.ok(products);
	}
	
	@PostMapping("/product/")
	public ResponseEntity<?> getByName(@RequestBody String name) {
		List<Product> products = productService.findByName(name);
		return ResponseEntity.ok(products);
	}
}
