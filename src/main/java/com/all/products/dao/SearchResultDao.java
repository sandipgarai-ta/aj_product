/**
 * 
 */
package com.all.products.dao;

import java.util.List;

import com.all.products.models.ProductPackage;

/**
 * @author Sandip
 *
 */
public interface SearchResultDao {
	public List<ProductPackage> findPackageByProductId(Long productId);
}
