package com.all.products.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.all.products.dao.SearchResultDao;
import com.all.products.models.ProductPackage;
import com.all.products.repositories.SearchResultRepository;

@Component
public class SearchResultDaoImpl implements SearchResultDao {
	
	@Autowired
	SearchResultRepository searchResultRepository;
	
	public List<ProductPackage> findPackageByProductId(Long productId){
		return this.searchResultRepository.searchPackage(productId);
	}
}
