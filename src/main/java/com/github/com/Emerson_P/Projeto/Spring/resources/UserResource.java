package com.github.com.Emerson_P.Projeto.Spring.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.com.Emerson_P.Projeto.Spring.entites.User;
import com.github.com.Emerson_P.Projeto.Spring.services.UserService;

@RestController
/* Adiciona /users como rota que pode ser acessada pela web  */
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity <List<User>> findAll(){
		
		List<User> lista = service.findAll();
		
		/* Envia como resposta ao acessar /users */ 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<User>> findById(@PathVariable Long id){
		Optional<User> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
