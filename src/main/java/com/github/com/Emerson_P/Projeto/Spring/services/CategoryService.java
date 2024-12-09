package com.github.com.Emerson_P.Projeto.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.com.Emerson_P.Projeto.Spring.entites.Category;
import com.github.com.Emerson_P.Projeto.Spring.repositories.CategoryRepository;

@Service
public class CategoryService {

	
	@Autowired
	private CategoryRepository repository;
		
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> objeto = repository.findById(id);
		return objeto.get();
	}
	
	}
