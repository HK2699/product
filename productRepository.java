package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.Product;

public interface productRepository  extends JpaRepository<Product,Integer>{

}
