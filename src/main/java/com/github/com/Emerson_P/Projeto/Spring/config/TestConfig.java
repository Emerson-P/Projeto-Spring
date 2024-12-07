package com.github.com.Emerson_P.Projeto.Spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.com.Emerson_P.Projeto.Spring.entites.User;
import com.github.com.Emerson_P.Projeto.Spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	@Autowired
	/* Resolve uma dependencia e associa a instancia */
	private UserRepository userRepository ;

	@Override
	/* Ao colocar algo dentro do metodo ele é executado ao iniciar a aplicacao */
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Maria teste", "teste01@gmail.com", "988888888", "senha123"); 
		User user2 = new User(null, "Alex Durex", "teste02@gmail.com", "000000000", "senha124"); 
		
		userRepository.saveAll(Arrays.asList(user1,user2));
	}
	
}
