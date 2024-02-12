package com.autofranchieseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autofranchieseapi.domain.model.Person;
import com.autofranchieseapi.domain.repository.PersonRepository;

@RestController
@RequestMapping(path = "/v1/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/teste")
	public String teste() {
		return "Ok";
	}
	
	@GetMapping
	public List<Person> getPersons(){
		return personRepository.findAll();
	}
}
