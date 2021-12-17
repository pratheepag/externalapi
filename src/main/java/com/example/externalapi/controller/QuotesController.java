package com.example.externalapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.externalapi.domain.QuoteMapping;
import com.example.externalapi.model.Quote;
import com.example.externalapi.repository.QuoteRepository;
import com.example.externalapi.service.QuoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.example.externalapi.domain.QuoteMapping;

//import com.example.externalapi.repository.QuoteRepository;

@RestController
public class QuotesController {
	
	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping("/getQuote")
	public QuoteMapping getQuotes() throws JsonMappingException, JsonProcessingException {
		/*final String uri = "https://quoters.apps.pcfone.io/api/random";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class); */
		String jsonString = "{\"type\": \"success\", \"value\":{\"id\": \"123\",\"quote\": \"Beautiful\"}}";
        ObjectMapper mapper = new ObjectMapper();
        QuoteMapping map = mapper.readValue(jsonString, QuoteMapping.class);
        Quote quote = new Quote(null, map.getValue().getQuote());
        quoteService.save(quote);
		return map;
	}
	@RequestMapping("/getAllQuotes")
	public List<Quote> getAllQuotes()  {
		return quoteService.getAllQuotes();
	}
}
