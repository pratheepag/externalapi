package com.example.externalapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotelist")
public class Quote {
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer id;
	  
	  private String quote;

	  public Quote() {

		}

	public Quote(Integer id, String quote) {
		super();
		this.id = id;
		this.quote = quote;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
