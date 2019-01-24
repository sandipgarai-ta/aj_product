package com.all.products.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.all.products.constant.ProjectConstant;
import com.all.products.controllers.VendorManagementController;
import com.all.products.dto.ResponseObj;
import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;
import com.all.products.services.VendorManagementService;



@Component
public class VendorManagementControllerImpl implements VendorManagementController {
	
	@Autowired
	VendorManagementService vendorManagementService;
	
	
	@Override
	public ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId) {
		List<ProductPackage> searchList = this.vendorManagementService.findPackageByProductId(productId);
		return new ResponseEntity(searchList, HttpStatus.OK);
	}

	
	
	@Override
	public ResponseEntity getVendorList() {
		ResponseObj response =new ResponseObj();
		List<PackageOrganization> vendorList=this.vendorManagementService.getAllActiveVendor();
		response.setData(vendorList);
		response.setMsg("Total record found= "+vendorList.size());
		response.setStaus(100);
		return new  ResponseEntity(response,HttpStatus.OK);
	}



	@Override
	public ResponseEntity saveVendor(PackageOrganization vendor) {
		ResponseObj response =new ResponseObj();
		List<PackageOrganization> list=new ArrayList<PackageOrganization>();
		list.add(this.vendorManagementService.saveVendor(vendor));
		
		if(list.size() > 0) {
			response.setMsg("Vendor Added");
			response.setStaus(ProjectConstant.HTTP_STATUS_NEW);
		}
		else {
			response.setMsg("Failed to add vendor");
			response.setStaus(ProjectConstant.HTTP_STATUS_NEW_FAILED);
		}
		
		return new ResponseEntity(response,HttpStatus.OK);
	}



	/**
	   * responsible to save a product of a vendor
	   * 
	   * @param vendorProduct 
	   * 
	   * @author Sandip
	 */
	@Override
	public ResponseEntity addVendorProduct(ProductPackage vendorProduct) {
		ResponseObj res=new ResponseObj();
		List<ProductPackage> list=new ArrayList<ProductPackage>();

		vendorProduct=this.vendorManagementService.saveVendorProduct(vendorProduct);
		list.add(vendorProduct);
		
		res.setData(list);
		if(list.size() == 0){
			res.setMsg("Failed to add product");
			res.setStaus(ProjectConstant.HTTP_STATUS_NEW_FAILED);
		}
		else {
			res.setMsg("Vendor Product Added");
			res.setStaus(ProjectConstant.HTTP_STATUS_NEW);
		}
		
		return new ResponseEntity(res, HttpStatus.CREATED);
	}

}
