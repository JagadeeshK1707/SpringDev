package com.dev.collections.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.collections.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>{
	/*
	 * 
	 * saveAll/findAllById= Automatically take care by CRUDRepository 
	 * 
	 */

}
