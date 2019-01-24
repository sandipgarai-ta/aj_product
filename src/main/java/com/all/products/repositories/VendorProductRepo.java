package com.all.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;


@Repository
public interface VendorProductRepo extends JpaRepository<ProductPackage, Long> {
	
	@Query("SELECT package FROM ProductPackage package WHERE package.productId = :productId ")
	List<ProductPackage> searchPackage(@Param("productId") Long productId);
	
	

}
