package com.example.externalapi.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.externalapi.model.Quote;

@Repository
public interface QuoteRepository extends PagingAndSortingRepository<Quote, Integer> {
	Page<Quote> findAll(Pageable pageable);
	List<Quote> findAllByQuoteContains(String quote, Pageable pageable);
}
