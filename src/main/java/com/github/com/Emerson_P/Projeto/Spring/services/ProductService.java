package com.github.com.Emerson_P.Projeto.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.com.Emerson_P.Projeto.Spring.entites.Product;
import com.github.com.Emerson_P.Projeto.Spring.repositories.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository repository;
		
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> objetoProduct = repository.findById(id);
		return objetoProduct.get();
	}
	
	}
