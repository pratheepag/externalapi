package com.example.externalapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.externalapi.model.Quote;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {
	// 
}
