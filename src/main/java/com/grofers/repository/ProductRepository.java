package com.grofers.repository;

import java.util.HashMap;
import java.util.Map;

import com.grofers.model.Product;

public class ProductRepository {
	private static Map<Integer, Product> products = new HashMap<Integer, Product>();
	private ProductRepository() {
		
	}
	
	public static Map<Integer, Product> getProducts() {
		return products;
	}
}
