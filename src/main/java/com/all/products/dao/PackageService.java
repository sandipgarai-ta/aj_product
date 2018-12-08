package com.all.products.dao;

import java.util.List;

import com.all.products.models.ProductPackage;

public interface PackageService {
	
	public List<ProductPackage> findPackageByProductId(int productId);

}
