package com.github.com.Emerson_P.Projeto.Spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.com.Emerson_P.Projeto.Spring.entites.Order;
import com.github.com.Emerson_P.Projeto.Spring.services.OrderService;

@RestController
/* Adiciona /users como rota que pode ser acessada pela web  */
@RequestMapping(value = "/Orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity <List<Order>> findAll(){
		
		List<Order> lista = service.findAll();
		
		/* Envia como resposta ao acessar /users */ 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
