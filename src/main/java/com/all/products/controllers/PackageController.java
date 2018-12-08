package com.all.products.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.fabric.Response;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/search")
public interface PackageController {
	
	@GetMapping("/data/{productId}")
	ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId);

}
