package com.dev.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.collections.dao.PersonDao;
import com.dev.collections.model.Person;
import com.dev.collections.service.PService;

@SpringBootApplication
public class DerivedMethodApplication implements CommandLineRunner{

    private final PersonDao personDao;

    
	@Autowired
	private PService service;


    DerivedMethodApplication(PersonDao personDao) {
        this.personDao = personDao;
    }

   
	
	public static void main(String[] args) {
		SpringApplication.run(DerivedMethodApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		try {
			
//			Iterable<Person> byLastNameAndFirstName_a = service.findByLastNameAndFirstName_a("teja","ravi");
//			for (Person person : byLastNameAndFirstName_a) {
//				System.out.println(person.toString());
//			}
//			
//			List<Person> byFirstNameLike = service.findByFirstNameLike("ravi");
//			for (Person person : byFirstNameLike) {
//				System.out.println(person.toString());
//			}
//			
//			List<Person> byLastNameAndAgeLessThanEqual = service.findByLastNameAndAgeLessThanEqual("teja", 21);
//			for (Person person : byLastNameAndAgeLessThanEqual) {
//				System.out.println(person.toString());
//			}
//			
			List<Person> byCreatedDateBetween = service.findByCreatedDateBetween(getDateWithTime("2026-02-16 17:39:42"), getDateWithTime("2026-02-16 17:41:44"));
			for (Person person : byCreatedDateBetween) {
				System.out.println(person.toString());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		

		
	}
	
	private Date getDateWithTime(String date){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		try {
			return simpleDateFormat.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e.getMessage());
		}
		
	
	}
	
	
	

}
