package com.dev.collections.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.collections.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>{
	
	public Iterable<Person> findByLastNameOrFirstName(String lastname , String firstname);
	
	
	public Iterable<Person> findByLastNameAndFirstName(String lastName,String firstName);

	
	public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName);
	
	public List<Person> findByAgeLessThanEqual(Integer age);
	
	public List<Person> findByFirstNameLike(String firstName);
	
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,Integer age);
	
	public List<Person> findByCreatedDateBetween(Date startDate,Date EndDate);
	

}
