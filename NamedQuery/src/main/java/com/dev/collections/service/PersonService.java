package com.dev.collections.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.collections.dao.BookDao;
import com.dev.collections.dao.PersonDao;
import com.dev.collections.dao.PublisherDao;
import com.dev.collections.model.Book;
import com.dev.collections.model.Person;
import com.dev.collections.model.Publisher;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao persondao;
	
	@Autowired
	private BookDao bookdao;
	
	@Autowired
	private PublisherDao publisherdao;	
	
	
	public Iterable<Book> saveBooks(Iterable<Book> booksList){
		return bookdao.saveAll(booksList);
	}
	public Iterable<Publisher> findAllBooks(){
		return publisherdao.findAll();
	}
	
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList) {
		return persondao.saveAll(personList);

	}
//	public Iterable<Person> getmultiplePersons(Iterable<Integer> personids) {
//		return persondao.findAllById(personids);
//		
//	}
//	
//	public Iterable<Person> findByLastNameOrFirstName(String LastName,String FirstName){
//		return persondao.findByLastNameOrFirstName(LastName, FirstName);
//	}
//	public Person findByLastNameAndFirstName(String LastName,String FirstName){
//		return persondao.findByLastNameAndFirstName(LastName, FirstName);
//	}
//	public List<Person> findByLastNameOrderByCreatedDateDesc(String LastName){
//		return persondao.findByLastNameOrderByCreatedDateDesc(LastName);
//	}
//	public List<Person> findByAgeLessThanEqual(Integer age){
//		return persondao.findByAgeLessThanEqual(age);
//	}
//	public List<Person> findByFirstNameLike(String firstName){
//		return persondao.findByFirstNameLike(firstName);
//	}
//	public List<Person> findByLastNameAndAgeLessThanEqual(String firstName,Integer age){
//		return persondao.findByLastNameAndAgeLessThanEqual(firstName,age);
//	}
//	public List<Person> findByCreatedDateBetween(Date startdate,Date enddate){
//		return persondao.findByCreatedDateBetween(startdate,enddate);
//	}
//	
//	
	
	public List<Person> givenDataByLastName(String lastname){
		return persondao.givenDataByLastName(lastname);
	}
	
	
	
	
}
