package com.dev.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * every java class is a table
 * @Entity - it will create the sql statements with create table
 * 				java class name will the table name
 * @table- it is optional - it customises the table name
 * 
 *  @column is the optional - it customises the table name
 *  
 *  @Id - it creates the primary key
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */





// take the all the variables must be in the camel case otherwise it will throw error

@Entity
@Table(name="tbl_ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId; 
	
	@Column(name="passinger_name")
	private String passingerName;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_station")
	private String destinationStation;
	
	@Column(name="travel_date")
	private Date travelDate ;
	
	@Column(name="email")
	private String email;
	
	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getPassingerName() {
		return passingerName;
	}


	public void setPassingerName(String passingerName) {
		this.passingerName = passingerName;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestinationStation() {
		return destinationStation;
	}


	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket() {
		System.out.println("--->inside model no pararmeter constructor");
	}
	
	public Ticket( String passingerName, String sourceStation, String destinationStation,
			 String email) {
		super();
		this.passingerName = passingerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = new Date();
		this.email = email;
		System.out.println("--->inside model ,parameter constructor");
	}


	@Override
	public String toString() {
		System.out.println("inside model to string");
		return "Ticket [ticketId=" + ticketId + ", PassingerName=" + passingerName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", travelDate=" + travelDate + ", Email=" + email
				+ "]";
	}


	

}
