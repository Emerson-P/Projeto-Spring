package com.github.com.Emerson_P.Projeto.Spring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.com.Emerson_P.Projeto.Spring.entites.Category;
import com.github.com.Emerson_P.Projeto.Spring.entites.Order;
import com.github.com.Emerson_P.Projeto.Spring.entites.User;
import com.github.com.Emerson_P.Projeto.Spring.entites.enums.OrderStatus;
import com.github.com.Emerson_P.Projeto.Spring.repositories.CategoryRepository;
import com.github.com.Emerson_P.Projeto.Spring.repositories.OrderRepository;
import com.github.com.Emerson_P.Projeto.Spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	@Autowired
	/* Resolve uma dependencia e associa a instancia */
	private UserRepository userRepository ;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	/* Ao colocar algo dentro do metodo ele é executado ao iniciar a aplicacao */
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria teste", "teste01@gmail.com", "988888888", "senha123"); 
		User u2 = new User(null, "Alex Durex", "teste02@gmail.com", "000000000", "senha124"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID ,u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),  OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),  OrderStatus.WAITING_PAYMENT ,  u1); 

		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}
