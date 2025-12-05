package com.cjc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.model.Product;
import com.cjc.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
	private ProductRepository productRepository;
	@Override
	public void saveProduct(Product product) {
		System.out.println("In Service Layer:"+product);
		
		productRepository.save(product);
	}
	@Override
	public List<Product> getAllProduct() {
		List<Product> list = productRepository.findAll();
		return list;
	}
	@Override
	public List<Product> deleteProduct(int pid) {
		productRepository.deleteById(pid);
		List<Product> list = productRepository.findAll();
		return list;
	}
	@Override
	public Product getProduct(int pid) {
		Product product = productRepository.getById(pid);
		return product;
	}

}
