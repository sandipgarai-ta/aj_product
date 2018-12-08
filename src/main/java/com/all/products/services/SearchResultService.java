/**
 * 
 */
package com.all.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.all.products.models.ProductPackage;

/**
 * @author Sandip
 *
 */
@Service
public interface SearchResultService {
	
	public List<ProductPackage> findPackageByProductId(Long productId );

}
