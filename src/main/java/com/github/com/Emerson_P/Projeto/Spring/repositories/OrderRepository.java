package com.github.com.Emerson_P.Projeto.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.com.Emerson_P.Projeto.Spring.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
