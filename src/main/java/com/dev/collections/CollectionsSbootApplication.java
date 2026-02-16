package com.dev.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.collections.model.Person;
import com.dev.collections.service.PersonService;
import com.dev.collections.service.PersonService;

@SpringBootApplication
public class CollectionsSbootApplication implements CommandLineRunner{
	@Autowired
	private PersonService service;

	public static void main(String[] args) {
		SpringApplication.run(CollectionsSbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Iterable<Person> saveAllPersons = service.saveAllPersons(personsData());
//		for (Person person : saveAllPersons) {
//			System.out.println(person.toString());
//		}
//		
		Iterable<Person> getmultiplePersons = service.getmultiplePersons(personIds());
		for (Person person : getmultiplePersons) {
			System.out.println(person.toString());
		}
		
	}
	
	private List<Integer> personIds() {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(10);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(12);
		arrayList.add(20);
		arrayList.add(9);
		arrayList.add(11);
		return arrayList;
	}

	private List<Person> personsData() {
		List<Person> asList = Arrays.asList(
				new Person("ravi","teja","raviteja@gmail.com",21),
				new Person("lok","teja","lokteja@gmail.com",22),
				new Person("vish","teja","vishteja@gmail.com",23),
				new Person("push","teja","pushteja@gmail.com",24),
				new Person("john","teja","johnteja@gmail.com",25),
				new Person("veera","teja","veerateja@gmail.com",26),
				new Person("ratan","teja","ratanteja@gmail.com",27),
				new Person("ambani","teja","ambaniteja@gmail.com",28),
				new Person("mama","teja","raviteja@gmail.com",29)
	
				);
		return asList;
		
		
	}

}
