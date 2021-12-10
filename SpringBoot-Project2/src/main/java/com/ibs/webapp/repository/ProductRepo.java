package com.ibs.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.webapp.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
