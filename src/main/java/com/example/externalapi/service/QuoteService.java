package com.example.externalapi.service;

import java.util.List;

import com.example.externalapi.model.Quote;


public interface QuoteService {
	List<Quote> getAllQuotes();
	void save(Quote quote);
}
