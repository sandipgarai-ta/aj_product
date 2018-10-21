package com.all.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.all.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("from Product order by position desc")
	public List<Product> findAll();

	@Query("from Product where specialized=1")
	public List<Product> getSpecilaized();
}
