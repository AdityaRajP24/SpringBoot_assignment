package com.productapp.service;

import java.util.*;

import com.productapp.repository.Product;


public interface ProductService {
	public List<Product> findAll();
	public Product getById(int id);
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
	public Product deleteProduct(int id);

}
