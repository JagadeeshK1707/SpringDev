package com.dev.collections.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_publisher")
public class Publisher {
	
	@Id
	@Column(name = "publisher_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer publisherId;
	
	@Column(name = "publisher_name")
	private String publisherName;
	
	/*
	 * CascadeType.All  => Any DML (SELECT, INSERT, UPDATE, DELETE) OPERATION I WILL CASCASDE TO PUBLISHER ALSO
	 *fetch = fetchtype.EAGER ==> both parent and child
	 *fetch = Fetchtype.LAZY ==> only parent , on demand child
	 * 
	 * 
	 */
	//already relationship exists and it will bridge the relation
	//this is also called as child
	@ManyToMany(mappedBy = "publishers")
	private Set<Book> books;

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Publisher(String publisherName, Set<Book> books) {
		super();
		this.publisherName = publisherName;
		this.books = books;
	}
	public Publisher(String publisherName) {
		super();
		this.publisherName = publisherName;
	}

	public Publisher() {
		
	}
	
	
	//different way to write to string method
	@Override
	public String toString() {

	    String format = String.format("Book Data [id=%d, name='%s']%n", publisherId, publisherName);

	    if (books != null) {
	    	try {
				
	    		for (Book book : books) {
	    			format+=String.format(
	    					"Book [id=%d, name='%s']%n",
	    					book.getBookId(),
	    					book.getBookName()
	    					);
	    		}
			} catch (Exception e) {
				// TODO: handle exception
			}
	    }

	    return format;
	}

}
