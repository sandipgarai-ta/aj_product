/**
 * 
 */
package com.all.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.all.products.models.PackageOrganization;

/**
 * @author Sandip
 *
 */

@Repository
public interface VendorRepositories extends JpaRepository<PackageOrganization, Long> {
	
	@Query("select vendor from PackageOrganization vendor where vendor.isActive = 1")
	List<PackageOrganization> findAllActiveVendor();
	
	
	//PackageOrganization saveVendor(PackageOrganization vendor);

}
