package com.example.externalapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.externalapi.model.Quote;
import com.example.externalapi.repository.QuoteRepository;

@ExtendWith(MockitoExtension.class)
public class QuoteServiceImplTest {
	
	@InjectMocks
	public QuoteServiceImpl quoteService;
	
	@Mock
	public QuoteRepository quoteRepository;
	
	@Test
	public void getAllQuotesTest() {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(0, 2, Sort.by("id").descending());
		when(quoteRepository.findAll(pageable)).thenReturn(getQuotesData());
		Page<Quote> quotesList = quoteService.getAllQuotes(pageable);
		verify(quoteRepository).findAll(pageable);
		assertEquals(2, quotesList.getSize());
	}
	
	public Page<Quote> getQuotesData(){
		List<Quote> quotesList = new ArrayList<>();
		Quote quote1 = new Quote(1, "Beautiful");
		Quote quote2 = new Quote(1, "Beautiful");
		quotesList.add(quote1);
		quotesList.add(quote2);
		Page<Quote> page = new PageImpl<>(quotesList);
		return page;
	}
	
	@Test
	public void saveTest() {
		Quote quote1 = new Quote(1, "Beautiful");
		when(quoteRepository.save(quote1)).thenReturn(quote1);
		quoteService.save(quote1);
		verify(quoteRepository).save(quote1);
	}
	
}
