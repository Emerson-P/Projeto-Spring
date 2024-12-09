package com.github.com.Emerson_P.Projeto.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.com.Emerson_P.Projeto.Spring.entites.Order;
import com.github.com.Emerson_P.Projeto.Spring.repositories.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository repository;
		
	public List<Order> findAll(){
		return  repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> objetoOrder = repository.findById(id);
		return objetoOrder.get();
	}
	
	}
