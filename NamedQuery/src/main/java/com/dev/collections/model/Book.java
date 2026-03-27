package com.dev.collections.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book {
	
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	/*cascade = update/circulate/pass the information.
	 * 
	 * CascadeType.All  => Any DML (SELECT, INSERT, UPDATE, DELETE) OPERATION I WILL CASCASDE TO PUBLISHER ALSO
	 *fetch = fetchtype.EAGER ==> both parent and child
	 *fetch = Fetchtype.LAZY ==> only parent , on demand child
	 *but default fetch tyoe is lazy only
	 * 
	 * joincolumn is the parent table primary key
	 * inversejoincloumn is child table primary key.
	 * 
	 */
	
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinTable(name = "book_publishers",
	joinColumns = @JoinColumn(name = "bookId",referencedColumnName = "book_id"),
	inverseJoinColumns = @JoinColumn(name = "publisherId",referencedColumnName = "publisher_id"))
	private Set<Publisher> publishers;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Set<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

	public Book(String bookName, Set<Publisher> publishers) {
		super();
		this.bookName = bookName;
		this.publishers = publishers;
	}
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	public Book() {
		
	}
		
	//different way to write tostring
	@Override
	public String toString() {

	    String result = String.format("Book Data [id=%d, name='%s']%n", bookId, bookName);

	    if (publishers != null) {
	        for (Publisher publisher : publishers) {
	            result+=String.format(
	                    "Publisher [id=%d, name='%s']%n",
	                    publisher.getPublisherId(),
	                    publisher.getPublisherName()
	            );
	        }
	    }

	    return result;
	}
	
	
	
	
}
