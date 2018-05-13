package com.example.webdevjavaserver.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevjavaserver.models.Hello;

public interface HelloRepository extends CrudRepository<Hello, Integer> {
	
}

