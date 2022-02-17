package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.Customer;
import com.product.entity.Product;

public interface customerRepository extends JpaRepository<Customer,Integer> {

	
}
