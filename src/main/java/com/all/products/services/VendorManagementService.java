/**
 * 
 */
package com.all.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;

/**
 * @author Sandip
 *
 */
@Service
public interface VendorManagementService {
	
	public List<ProductPackage> findPackageByProductId(Long productId );
	
	
	public List<PackageOrganization> getAllActiveVendor();
	public PackageOrganization saveVendor(PackageOrganization vendor);
	public ProductPackage saveVendorProduct(ProductPackage vendorProduct);
	

}
