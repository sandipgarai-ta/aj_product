package com.all.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.all.products.models.Product;
import com.all.products.services.ProductService;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public @ResponseBody Product getAll() {
		return productService.getTree();
	}
	
	@RequestMapping(value="/specialized",method=RequestMethod.GET)
	public @ResponseBody List<Product> getSpecialized() {
		return productService.getSpecialized();
	}
	
	@RequestMapping(value="/parent/{id}",method=RequestMethod.GET)
	public @ResponseBody List<Product> getChildren(@PathVariable(name="id") int id) {
		return productService.getChildrenByPid(id);
	}
}
