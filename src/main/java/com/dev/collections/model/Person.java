package com.dev.collections.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_person")
public class Person {
	
	/*
	 * Auto -  means jpa creates the sequence here every thing will take by JPA
	 * identity  - means take care by Database
	 * 
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private Integer personId;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="create_date")
	private Date createddate;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="age")
	private Integer age;


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Date getCreateddate() {
		return createddate;
	}


	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Person( String firstname, String lastname, String email, Integer age) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.createddate = new Date();
		this.email = email;
		this.age = age;
	}
	
	
	public Person() {
		
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstname=" + firstname + ", lastname=" + lastname + ", createddate="
				+ createddate + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
}
