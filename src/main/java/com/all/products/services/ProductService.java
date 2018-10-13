package com.all.products.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.products.models.Product;
import com.all.products.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	private HashMap<Integer,Product> all = null;
	private List<Product> finaltree = null;
	
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
	public List<Product> getTree() {
		for (Iterator iterator = getAll().iterator(); iterator.hasNext();) {
			Product p = (Product) iterator.next();			
			all.put(p.getId(), p);
		}
		//all = getAll();
		
		return getAll();
		//return getChildren(0);
	}
	
	public Product getTree1(int pid) {
		Product tree = all.get(pid);
		HashMap<Integer, Product> children = getChildren(pid);
		finaltree.add(tree);
		if(children.size()>0) {
			tree.setChildren(children);
		} else {
			
		}
		return tree;
	}
	
	public HashMap<Integer,Product> getChildren(int pid) {
		/*return all.stream()
	    .filter(s -> (pid == s.getPpid()))
	    .collect(Collectors.toList());*/
		HashMap<Integer,Product> children=null;
		Iterator it = all.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        children.putAll((Map<Integer,Product>) pair);
//	        it.remove(); // avoids a ConcurrentModificationException
	        all.remove(pair.getKey());
	    }
	    
	    return children;
	}
}
