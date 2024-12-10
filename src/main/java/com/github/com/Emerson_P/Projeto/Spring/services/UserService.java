package com.github.com.Emerson_P.Projeto.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.com.Emerson_P.Projeto.Spring.entites.User;
import com.github.com.Emerson_P.Projeto.Spring.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repository;
		
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> objetoUser = repository.findById(id);
		return objetoUser.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	}
