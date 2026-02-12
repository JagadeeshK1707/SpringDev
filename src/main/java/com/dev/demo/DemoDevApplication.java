package com.dev.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dev.demo.controller.TicketController;
import com.dev.demo.model.Ticket;
import com.dev.demo.service.TicketService;

@SpringBootApplication
public class DemoDevApplication implements CommandLineRunner{

  

	@Autowired
	private TicketService ticketService ;

  
	public static void main(String[] args) {
		SpringApplication.run(DemoDevApplication.class, args);
		System.out.println("--->inside main method");
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("--->inside run method");
		Ticket ticket = new Ticket();
		ticket.setPassingerName("Revi");
		ticket.setDestinationStation("Bengalore");
		ticket.setSourceStation("Hyderabad");
		ticket.setTravelDate(new Date());
		ticket.setEmail("Dev.@gmail.com");
		ticketService.createTicket(ticket);
	}

}
