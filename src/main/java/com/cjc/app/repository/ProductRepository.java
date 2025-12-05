package com.cjc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
