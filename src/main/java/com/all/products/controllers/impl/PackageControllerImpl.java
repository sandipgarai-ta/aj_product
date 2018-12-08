package com.all.products.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.all.products.controllers.PackageController;
import com.all.products.models.ProductPackage;
import com.all.products.services.SearchResultService;
import com.mysql.fabric.Response;

@Component
public class PackageControllerImpl implements PackageController {
	
	@Autowired
	SearchResultService searchResultService;
	
	@Override
	public ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId) {
		List<ProductPackage> searchList = this.searchResultService.findPackageByProductId(productId);
		return new ResponseEntity(searchList, HttpStatus.OK);
	}

}
