package com.dev.collections.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.collections.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>{
	/*
	 * 
	 * saveAll/findAllById= Automatically take care by CRUDRepository 
	 * 
	 * 
	 * 
	 * we are going to write abstract methods in this layer and implementation is given by framework
	 * 
	 * 
	 */
//	public Iterable<Person> findByLastNameOrFirstName(String LastName , String FirstName);
//	
//	
//	public Person findByLastNameAndFirstName(String LastName,String FirstName);
//
//	
//	public List<Person> findByLastNameOrderByCreatedDateDesc(String LastName);
//	
//	public List<Person> findByAgeLessThanEqual(Integer age);
//	
//	public List<Person> findByFirstNameLike(String firstName);
//	
//	public List<Person> findByLastNameAndAgeLessThanEqual(String LastName,Integer age);
//	
//	public List<Person> findByCreatedDateBetween(Date startDate,Date EndDate);
//	
	
	
	/*
	 * Named Query section 
	 * abstracts methods in the interface layer => any name no frame work rules 
	 * Implementations at model/Domain/Entity layer 
	 * 
	 *
	 * 
	 */
	
	
	public List<Person> givenDataByLastName(String lastName);
	
	
	
	
}
