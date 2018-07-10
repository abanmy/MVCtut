package com.aziz.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countries;
	private String language;
	private LinkedHashMap<String,String> languages;
	private String fruit;
	private LinkedHashMap<String,String> fruits;
	
	public Student() {
		countries = new LinkedHashMap<>();
		
		countries.put("KSA", "Saudi Arabia");
		countries.put("UAE", "United Arab Emirates");
		countries.put("FR", "France");
		
		languages = new LinkedHashMap<>();
		languages.put("Java", "Java");
		languages.put("PHP", "PHP");
		languages.put("Ruby", "Ruby");
		
		fruits = new LinkedHashMap<>();
		fruits.put("Apple", "Apple");
		fruits.put("Orange", "Orange");
		fruits.put("Date", "Date");
	}
	
	

	public String getFruit() {
		return fruit;
	}



	public void setFruit(String fruit) {
		this.fruit = fruit;
	}



	public LinkedHashMap<String, String> getFruits() {
		return fruits;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}



	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
