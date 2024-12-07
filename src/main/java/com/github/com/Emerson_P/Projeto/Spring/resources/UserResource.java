package com.github.com.Emerson_P.Projeto.Spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.com.Emerson_P.Projeto.Spring.entites.User;

@RestController
/* Adiciona /users como rota que pode ser acessada pela web  */
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		/* Cria users01 como teste  */ 
		User user01 = new User(1L, "Teste", "teste@gmail.com", "123456789", "senha123");
		/* Envia como resposta ao acessar /users */ 
		return ResponseEntity.ok().body(user01);
	}
}
