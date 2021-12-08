package com.example.externalapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuotesController {
	@RequestMapping("/getQuotes")
	public String getQuotes() {
		final String uri = "https://quoters.apps.pcfone.io/api/random";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
		return result;
	}
}
