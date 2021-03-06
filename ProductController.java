package com.product.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Customer;
import com.product.service.productService;

@RestController
@RequestMapping("/api")
public class ProductController
{
 @Autowired
 productService productservice;
 
 @PostMapping("/addCustomer")
 public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer)
 {
	return new ResponseEntity<Customer>(this.productservice.addCustomer(customer),HttpStatus.OK);	
		}
 
}
