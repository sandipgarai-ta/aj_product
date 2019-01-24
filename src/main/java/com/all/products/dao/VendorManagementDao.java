/**
 * 
 */
package com.all.products.dao;

import java.util.List;

import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;

/**
 * @author Sandip
 *
 */
public interface VendorManagementDao {
	public List<ProductPackage> findPackageByProductId(Long productId);
	
	
	public List<PackageOrganization> getAllActiveVendor();
	
	
	public PackageOrganization saveVendor(PackageOrganization vendor);
	
	public ProductPackage saveVendorProduct(ProductPackage vendorProduct);
}
