package com.dev.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.demo.dao.TicketDao;
import com.dev.demo.model.Ticket;

/*
 * which is interacting with DAO layer.
 * 
 * 
 */

@Service
public class TicketService {
	
	/*
	 * TicketDao actually it is an interface but the spring dont't care any thing it create the object
	 * 
	 */
	
	@Autowired
	private TicketDao ticketDao;
	
	
	//retrive all tickts
	public Iterable<Ticket> getAll(){
		System.out.println("--->inside service getAll");
		return ticketDao.findAll();
	}
	
	
	
	
	//retrive individual tickets
	public Ticket getTicket(Integer tickId) {
		System.out.println("--->inside service getticket");
		return ticketDao.findById(tickId).orElse(new Ticket());
		
	}
	
	
	
	
	//create ticket
	public Ticket createTicket(Ticket ticketObj) {
		System.out.println("--->inside service createticket");
		return ticketDao.save(ticketObj);
	}
	
	
	
	//update ticket
	public Ticket updateTicket(Integer id , String newemail) {
		System.out.println("--->inside service update ticket");
		Ticket gettiTicket = getTicket(id);
		gettiTicket.setEmail(newemail);
		return ticketDao.save(gettiTicket);
		
	}
	
	//delete ticket
	public void deleteTicket(Integer id) {
		System.out.println("--->inside delete ticket");
		ticketDao.deleteById(id);
	}
	

}
