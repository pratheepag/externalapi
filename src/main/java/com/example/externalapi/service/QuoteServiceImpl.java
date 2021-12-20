package com.example.externalapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.externalapi.model.Quote;
import com.example.externalapi.repository.QuoteRepository;

@Service
public class QuoteServiceImpl implements QuoteService{
	
	@Autowired
	QuoteRepository quoteRepository;

	@Override
	public Page<Quote> getAllQuotes(Pageable pageable) {
		// TODO Auto-generated method stub
		return quoteRepository.findAll(pageable);
	}

	@Override
	public void save(Quote quote) {
		// TODO Auto-generated method stub
		quoteRepository.save(quote);
	}

	@Override
	public List<Quote> getAllQuotesByQuote(String quote, Pageable pageable) {
		// TODO Auto-generated method stub
		return quoteRepository.findAllByQuoteContains(quote, pageable);
	}

}
