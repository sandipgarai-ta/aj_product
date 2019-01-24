package com.all.products.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.all.products.dao.VendorManagementDao;
import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;
import com.all.products.services.VendorManagementService;

@Component
public class VendorManagementServiceImpl implements VendorManagementService {
	
	@Autowired
	VendorManagementDao vendorMgmtDao;
	
	
	
	@Override
	public List<ProductPackage> findPackageByProductId(Long productId ){
		return this.vendorMgmtDao.findPackageByProductId(productId);
	}



	@Override
	public List<PackageOrganization> getAllActiveVendor() {
		return this.vendorMgmtDao.getAllActiveVendor();
	}


	//to save a vendor
	@Override
	public PackageOrganization saveVendor(PackageOrganization vendor) {
		return this.vendorMgmtDao.saveVendor(vendor);
	}


	//to save a vendor product
	@Override
	public ProductPackage saveVendorProduct(ProductPackage vendorProduct) {
		return vendorMgmtDao.saveVendorProduct(vendorProduct);
	}
}
