package com.dev.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dev.collections.dao.PersonDao;
import com.dev.collections.dao.PublisherDao;
import com.dev.collections.model.Book;
import com.dev.collections.model.Person;
import com.dev.collections.model.Publisher;
import com.dev.collections.service.PersonService;


@SpringBootApplication
public class CollectionsSbootApplication implements CommandLineRunner{

    private final PublisherDao publisherDao;

    private final PersonDao personDao;
	
	@Autowired
	private PersonService service;


    CollectionsSbootApplication(PersonDao personDao, PublisherDao publisherDao) {
        this.personDao = personDao;
        this.publisherDao = publisherDao;
    }


	public static void main(String[] args) {
		SpringApplication.run(CollectionsSbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		
//		Iterable<Person> saveAllPersons = service.saveAllPersons(personsData());
//		for (Person person : saveAllPersons) {
//			System.out.println(person.toString());
//		}
		
//		Iterable<Person> getmultiplePersons = service.getmultiplePersons(personIds());
//		for (Person person : getmultiplePersons) {
//			System.out.println(person.toString());
//		}
//		
		
//		Iterable<Person> byLastNameOrFirstName = service.findByLastNameOrFirstName("teja","ravi");
//		for (Person person : byLastNameOrFirstName) {
//			System.out.println(person.toString());
//		}
		
//		Person byLastNameAndFirstName = service.findByLastNameAndFirstName("teja", "ravi");
//		System.out.println(byLastNameOrFirstName.toString());
//		
//		List<Person> byLastNameOrderByCreatedDateDesc = service.findByLastNameOrderByCreatedDateDesc("john");
//		for (Person person : byLastNameOrderByCreatedDateDesc) {
//			System.out.println(person.toString());
//		}
//		
//		List<Person> byAgeLessThanEqual = service.findByAgeLessThanEqual(24);
//		for (Person person : byAgeLessThanEqual) {
//			System.out.println(person.toString());
//		}
//		
//		List<Person> byFirstNameLike = service.findByFirstNameLike("an");
//		for (Person person : byFirstNameLike) {
//			System.out.println(person.toString());
//		}
//		
//		List<Person> byLastNameAndAgeLessThanEqual = service.findByLastNameAndAgeLessThanEqual("ravi", 22);
//		for (Person person : byLastNameAndAgeLessThanEqual) {
//			System.out.println(person.toString());
//		}
//		
		
		//givenDataByLastName();
	
		savePublishers();
		
		
	}
	
	private void savePublishers() {
		Publisher publisher1 = new Publisher("AbdulKalam");
		Publisher publisher2 = new Publisher("modi");
		Publisher publisher3 = new Publisher("mama");
		Publisher publisher4 = new Publisher("alludu");
		Publisher publisher5 = new Publisher("atha");

		//one to one from book to publisher 
		Book book1 = new Book("parctice makes man perfect", new HashSet<>(Arrays.asList(publisher1)));
		Book book2 = new Book("sindhoor", new HashSet<>(Arrays.asList( publisher2)));
		Book book3 = new Book("loginLogout", new HashSet<>(Arrays.asList(publisher3)));
		
		//one to many from book to publisher
		Book book4 = new Book("book2", new HashSet<>(Arrays.asList(publisher4,publisher5)));
		
		//one to many publisher to book
		//check how the data structures are mapping
		Book book5 = new Book("book4", new HashSet<>(Arrays.asList(publisher5)));
		Book book6 = new Book("book5", new HashSet<>(Arrays.asList(publisher5)));
		//service.saveBooks(Arrays.asList(book1,book2,book3,book4,book5,book6));
		
		Iterable<Publisher> allBooks = service.findAllBooks();
		for (Publisher publisher : allBooks) {
			System.out.println(publisher.toString());
		}
		
	}
	
	
	
	
	private void givenDataByLastName() {
		List<Person> givenDataByLastName = service.givenDataByLastName("teja");
		for (Person person : givenDataByLastName) {
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
