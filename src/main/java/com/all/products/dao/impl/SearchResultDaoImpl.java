package com.all.products.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.all.products.dao.SearchResultDao;
import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;
import com.all.products.repositories.SearchResultRepository;
import com.all.products.repositories.VendorRepositories;

@Component
public class SearchResultDaoImpl implements SearchResultDao {
	
	@Autowired
	SearchResultRepository searchResultRepository;
	
	@Autowired
	VendorRepositories vendorRepo;
	
	public List<ProductPackage> findPackageByProductId(Long productId){
		return this.searchResultRepository.searchPackage(productId);
	}

	@Override
	public List<PackageOrganization> getAllActiveVendor() {
		return this.vendorRepo.findAllActiveVendor();
	}

	
	//to save a vendor
	@Override
	public PackageOrganization saveVendor(PackageOrganization vendor) {
		return vendorRepo.save(vendor);
	}
	
}
