package com.github.com.Emerson_P.Projeto.Spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.com.Emerson_P.Projeto.Spring.entites.Product;
import com.github.com.Emerson_P.Projeto.Spring.services.ProductService;

@RestController
/* Adiciona /users como rota que pode ser acessada pela web  */
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		
		List<Product> lista = service.findAll();
		
		/* Envia como resposta ao acessar /users */ 
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
