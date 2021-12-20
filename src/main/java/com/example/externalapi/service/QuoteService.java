package com.example.externalapi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.externalapi.model.Quote;


public interface QuoteService {
	Page<Quote> getAllQuotes(Pageable pageable);
	List<Quote> getAllQuotesByQuote(String quote, Pageable pageable);
	void save(Quote quote);
}
