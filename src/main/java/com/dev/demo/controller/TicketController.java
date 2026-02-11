package com.dev.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.demo.model.Ticket;
import com.dev.demo.service.TicketService;

@RequestMapping(value="/ticket")
@RestController
public class TicketController {
	@Autowired
	private TicketService ticketservice;
	
	/*
	 * rest protocol = webservice call = heterogeneous communication(cross platform communication)
	 * by default every programming know the JSON format
	 */
	
	//for all tickets
	@GetMapping(value="/all")
	public Iterable<Ticket> getAllTickets(){
		return ticketservice.getAll();
	}
	
	//for one particular ticket
	@GetMapping(value="/{ticketId}")
	public Ticket getTicket(Integer ticketId) {
		return ticketservice.getTicket(ticketId);
	}
	
	
	//create ticket
	/*jackson library by defaultly converts the JSON to JAVA and JAVA to JAON
	 *every rest request has some body section it will read the json in the body section and convert
	 *java and the calls the below API
	 * 
	 * 
	 */
	@PostMapping(value="/create")
	public Ticket createTicket(@PathVariable("ticketId") Ticket ticketObj) {
		return ticketservice.createTicket(ticketObj);
	}
	
	@PutMapping(value= "/{ticketID}/{newEmail}")
	public Ticket updatTicket(@PathVariable("ticketID")Integer id,@PathVariable("newEmail")String email) {
		return ticketservice.updateTicket(id, email);
	}
	@DeleteMapping(value="/{ticketID}")
	public void delete(@PathVariable("ticketID") Integer Id) {
		ticketservice.deleteTicket(Id);
	}
	
}











































