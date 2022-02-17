package com.product.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Customer;
import com.product.repository.customerRepository;
import com.product.repository.productRepository;

@Service
public class productimpl  implements productService
{

	
	@Autowired
	 private customerRepository customerrepository;
	 
	 @Autowired
	 private productRepository productrepository;


	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.customerrepository.save(customer);
	}

	
	 
	
}
