package com.github.com.Emerson_P.Projeto.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.com.Emerson_P.Projeto.Spring.entites.OrderItem;
import com.github.com.Emerson_P.Projeto.Spring.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
