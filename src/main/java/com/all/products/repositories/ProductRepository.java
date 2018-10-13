package com.all.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.all.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	public List<Product> findAll();
}
