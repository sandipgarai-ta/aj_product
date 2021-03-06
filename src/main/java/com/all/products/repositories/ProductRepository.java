package com.all.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.all.products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("from Product where isDeleted=0 order by position desc")
	public List<Product> findAll();

	@Query("from Product where specialized=1")
	public List<Product> getSpecilaized();

	@Query("select p from Product p where p.ppid=?1 order by position desc")
	public List<Product> getChildren(int id);
}
