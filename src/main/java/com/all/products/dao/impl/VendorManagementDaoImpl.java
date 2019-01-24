package com.all.products.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.all.products.dao.VendorManagementDao;
import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;
import com.all.products.repositories.VendorProductRepo;
import com.all.products.repositories.VendorRepositories;

@Component
public class VendorManagementDaoImpl implements VendorManagementDao {
	
	@Autowired
	VendorProductRepo vendorProductRepo;
	
	@Autowired
	VendorRepositories vendorRepo;
	
	public List<ProductPackage> findPackageByProductId(Long productId){
		return this.vendorProductRepo.searchPackage(productId);
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

	
	//to save a vendor product
	@Override
	public ProductPackage saveVendorProduct(ProductPackage vendorProduct) {
		return this.vendorProductRepo.save(vendorProduct);
		//return null;
	}
	
}
