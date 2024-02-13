package com.autofranchieseapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autofranchieseapi.domain.model.Insured;
import com.autofranchieseapi.domain.repository.PersonRepository;

@RestController
@RequestMapping(path = "/v1/insured")
public class InsuredController {

	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/teste")
	public String teste() {
		return "Ok";
	}
	
	@GetMapping
	public List<Insured> getInsured(){
		return personRepository.findAll();
	}
}
