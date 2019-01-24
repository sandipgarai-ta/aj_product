package com.all.products.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vendor-management")
public interface VendorManagementController {
	
	@GetMapping("/products/{productId}")
	ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId);
	
	@GetMapping("/getallactivevendor")
	ResponseEntity getVendorList();
	
	@PostMapping("/save-vendor")
	ResponseEntity saveVendor(@RequestBody PackageOrganization vendor);
	
	
	
	  /**
	   * responsible to save a product of a vendor
	   * 
	   * @param vendorProduct 
	   * 
	   * @author Sandip
	  */
	@PostMapping("/add-vendor-product")
	ResponseEntity addVendorProduct(@RequestBody ProductPackage vendorProduct) ;

}
