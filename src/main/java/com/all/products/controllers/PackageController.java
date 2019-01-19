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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vendor-management")
public interface PackageController {
	
	@GetMapping("/products/{productId}")
	ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId);
	
	@GetMapping("/getallactivevendor")
	ResponseEntity getVendorList();
	
	@PostMapping("/save-vendor")
	ResponseEntity saveVendor(@RequestBody PackageOrganization vendor);

}
