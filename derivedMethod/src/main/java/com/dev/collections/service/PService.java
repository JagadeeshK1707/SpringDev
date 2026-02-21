package com.dev.collections.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.collections.dao.PersonDao;
import com.dev.collections.model.Person;


@Service
public class PService {


	@Autowired
	public PersonDao persondao;

   
	
	public Iterable<Person> findByLastNameAndFirstName_a(String lastname, String firstname) {
		// TODO Auto-generated method stub
		try {
			return persondao.findByLastNameAndFirstName(lastname, firstname);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return null;
	}
	
	
	public Iterable<Person> findByLastNameOrFirstName(String LastName,String FirstName){
		return persondao.findByLastNameOrFirstName(LastName, FirstName);
	}
	
	public List<Person> findByLastNameOrderByCreatedDateDesc(String LastName){
		return persondao.findByLastNameOrderByCreatedDateDesc(LastName);
	}
	public List<Person> findByAgeLessThanEqual(Integer age){
		return persondao.findByAgeLessThanEqual(age);
	}
	public List<Person> findByFirstNameLike(String firstName){
		return persondao.findByFirstNameLike(firstName);
	}
	public List<Person> findByLastNameAndAgeLessThanEqual(String firstName,Integer age){
		return persondao.findByLastNameAndAgeLessThanEqual(firstName,age);
	}
	public List<Person> findByCreatedDateBetween(Date startdate,Date enddate){
		return persondao.findByCreatedDateBetween(startdate,enddate);
	}
	

}
