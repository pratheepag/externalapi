package com.example.externalapi.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteMapping {
	private String type;
	private QuoteValue value;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public QuoteValue getValue() {
		return value;
	}
	public void setValue(QuoteValue value) {
		this.value = value;
	}
}
