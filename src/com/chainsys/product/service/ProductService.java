package com.chainsys.product.service;

import java.time.LocalDate;
import java.util.Set;

import com.chainsys.product.exception.ProductNotFoundException;
import com.chainsys.product.model.Product;

public interface ProductService {
	Set<Product> findAll();

	Product findById(int id) throws ProductNotFoundException;

	Product findByName(String name) throws ProductNotFoundException;

	Product findByDate(LocalDate expiryDate) throws ProductNotFoundException;

	void save(Product Product);

	void update(Product Product) throws ProductNotFoundException;

	void update_expire(Product Product) throws ProductNotFoundException;

	void delete(int id) throws ProductNotFoundException;
	
	void delete_date(LocalDate expiryDate) throws ProductNotFoundException;


}
