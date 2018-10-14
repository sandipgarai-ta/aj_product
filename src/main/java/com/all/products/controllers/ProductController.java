package com.all.products.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.all.products.models.Product;
import com.all.products.services.ProductService;

@Controller("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public @ResponseBody Product getAll() {
		return productService.getTree();
	}
}
