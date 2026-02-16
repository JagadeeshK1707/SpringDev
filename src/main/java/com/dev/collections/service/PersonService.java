package com.dev.collections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.collections.dao.PersonDao;
import com.dev.collections.model.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao persondao;
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList) {
		return persondao.saveAll(personList);

	}
	public Iterable<Person> getmultiplePersons(Iterable<Integer> personids) {
		return persondao.findAllById(personids);
		
	}
	
}
