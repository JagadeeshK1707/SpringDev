package com.dev.demo.model;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId; 
	
	@Column(name="passinger_name")
	private String PassingerName;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_station")
	private String destinationStation;
	
	@Column(name="travel_date")
	private Date travelDate ;
	
	private String Email;
	
	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getPassingerName() {
		return PassingerName;
	}


	public void setPassingerName(String passingerName) {
		PassingerName = passingerName;
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
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}

	public Ticket() {
		
	}
	
	public Ticket( String passingerName, String sourceStation, String destinationStation,
			 String email) {
		super();
		PassingerName = passingerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = new Date();
		Email = email;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", PassingerName=" + PassingerName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", travelDate=" + travelDate + ", Email=" + Email
				+ "]";
	}


	

}
