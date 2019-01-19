package com.all.products.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.all.products.constant.ProjectConstant;
import com.all.products.controllers.PackageController;
import com.all.products.dto.ResponseObj;
import com.all.products.models.PackageOrganization;
import com.all.products.models.ProductPackage;
import com.all.products.services.SearchResultService;



@Component
public class PackageControllerImpl implements PackageController {
	
	@Autowired
	SearchResultService searchResultService;
	
	
	@Override
	public ResponseEntity getPackagesOfTheProduct(@PathVariable("productId") Long productId) {
		List<ProductPackage> searchList = this.searchResultService.findPackageByProductId(productId);
		return new ResponseEntity(searchList, HttpStatus.OK);
	}

	
	
	@Override
	public ResponseEntity getVendorList() {
		ResponseObj response =new ResponseObj();
		List<PackageOrganization> vendorList=this.searchResultService.getAllActiveVendor();
		response.setData(vendorList);
		response.setMsg("Total record found= "+vendorList.size());
		response.setStaus(100);
		return new  ResponseEntity(response,HttpStatus.OK);
	}



	@Override
	public ResponseEntity saveVendor(PackageOrganization vendor) {
		ResponseObj response =new ResponseObj();
		List<PackageOrganization> list=new ArrayList<PackageOrganization>();
		list.add(this.searchResultService.saveVendor(vendor));
		
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

}
