package com.Suresh.SpringBoot.Models;

public class Value {

	private long id;
	private String quote;
	
	public Value() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}
	
	
}
