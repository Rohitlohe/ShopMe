package com.application.MyApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.MyApp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public Product findProductById(Long id);


}

