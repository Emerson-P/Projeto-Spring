package com.github.com.Emerson_P.Projeto.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.com.Emerson_P.Projeto.Spring.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
