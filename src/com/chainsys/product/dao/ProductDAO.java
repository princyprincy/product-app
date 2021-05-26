package com.chainsys.product.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.chainsys.product.model.Product;

public interface ProductDAO {
	Set<Product> findAll();

	List<String> findAllName();
	List<Integer> findAllId();
	
	Product findById(int id);

	Product findByName(String name);

	Product findByDate(LocalDate expiryDate);

	void save(Product product);

	void update(Product product);

	void update_expire(Product product);

	void delete(int id);

	void delete_name(String name);

	void delete_date(LocalDate expiryDate);
	
}

