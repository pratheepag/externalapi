package com.example.externalapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.externalapi.model.Quote;
import com.example.externalapi.repository.QuoteRepository;

@Service
public class QuoteServiceImpl implements QuoteService{
	
	@Autowired
	QuoteRepository quoteRepository;

	@Override
	public List<Quote> getAllQuotes() {
		// TODO Auto-generated method stub
		return (List<Quote>) quoteRepository.findAll();
	}

	@Override
	public void save(Quote quote) {
		// TODO Auto-generated method stub
		quoteRepository.save(quote);
	}

}
