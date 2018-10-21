package com.all.products.services;

import java.util.ArrayList;
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
	
	private HashMap<Integer,Product> all = new HashMap<>();
	List<Product> finaltree = new ArrayList<>();
	
	private HashMap<Integer,Product> finalall = new HashMap<>();
	
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
	public Product getTree() {
		for (Iterator iterator = getAll().iterator(); iterator.hasNext();) {
			Product p = (Product) iterator.next();			
			all.put(p.getId(), p);
		}
		//all = getAll();
		
		//return getAll();
		return createTree(0).get(0);
	}
	
	public HashMap<Integer, Product> createTree(int pid) {
//		Product tree = all.get(pid);
		HashMap<Integer, Product> children = getChildren(pid);
		List<Product> childrenlst=new ArrayList<>();
		finalall.put(pid, all.get(pid));
		if(children.size()>0) {
//			tree.setChildren(children);
			Iterator it = children.entrySet().iterator();
		    while (it.hasNext()) {
		    	HashMap.Entry pair = (HashMap.Entry)it.next();
		    	childrenlst.add((Product) pair.getValue());
		    	createTree((int)pair.getKey());
		    }
		    
//		    tree.setChildren(childrenlst);
		    //finaltree.add(tree);
		    finalall.get(pid).setChildren(childrenlst);
		    
		}
		return finalall;
	}
	
	public HashMap<Integer,Product> getChildren(int pid) {
		/*return all.stream()
	    .filter(s -> (pid == s.getPpid()))
	    .collect(Collectors.toList());*/
		Product p = null;
		HashMap<Integer,Product> children=new HashMap<>();
		Iterator it = all.entrySet().iterator();
	    while (it.hasNext()) {
	    	HashMap.Entry pair = (HashMap.Entry)it.next();
	        //System.out.println(pair.getKey() + " = " + pair.getValue());
	    	p = (Product)pair.getValue();
	    	if(p.getPpid()==pid)
	    		children.put((int)pair.getKey(),(Product)pair.getValue());
//	        it.remove(); // avoids a ConcurrentModificationException
	        //all.remove(pair.getKey());
	    }
	    
	    return children;
	}

	public List<Product> getSpecialized() {
		// TODO Auto-generated method stub
		return productRepository.getSpecilaized();
	}
}
