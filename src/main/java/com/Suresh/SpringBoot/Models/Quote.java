package com.Suresh.SpringBoot.Models;

public class Quote {

	private String type;
	private Value value;
	
	public Quote() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote [type=" + type + ", value=" + value + "]";
	}
	
	
}
