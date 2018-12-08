package com.all.products.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.all.products.dao.SearchResultDao;
import com.all.products.models.ProductPackage;
import com.all.products.services.SearchResultService;

@Component
public class SearchResultServiceImpl implements SearchResultService {
	
	@Autowired
	SearchResultDao searchResultDao;
	
	
	
	@Override
	public List<ProductPackage> findPackageByProductId(Long productId ){
		return this.searchResultDao.findPackageByProductId(productId);
	}
}
