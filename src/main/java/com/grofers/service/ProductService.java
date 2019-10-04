package com.grofers.service;

import java.util.Map;

import com.grofers.exception.DataNotFoundException;
import com.grofers.model.Product;
import com.grofers.repository.ProductRepository;

public class ProductService {
	private Map<Integer, Product> products = ProductRepository.getProducts();

	public ProductService() {
		products.put(1, new Product(1, "product1"));
		products.put(2, new Product(2, "product2"));
	}

	public Product getProduct(int id) {
		Product product = products.get(id);
		if (product == null) {
			throw new DataNotFoundException("Product does not exists");
		}
		return product;
	}

	public Product addOrUpdateProduct(Product product) {
		products.put(products.size() + 1, product);
		return product;
	}
}
