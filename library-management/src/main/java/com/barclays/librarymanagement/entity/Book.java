package com.barclays.librarymanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {

	private static final long serialVersionUID = 8595172847097209782L;

	@Id
	@Column(name= "book_id")
	private Long bookId;
	@Column(name= "book_name")
	private String bookName;
	@Column(name="book_author")
	private String bookAuthor;
	@Column(name="publication")
	private String publication;
	@Column(name="publication_number")
	private String publicationNumber;
	@Column(name="year_of_publication")
	private Integer yearOfPublication;
	@Column(name="price")
	private Double price;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPublicationNumber() {
		return publicationNumber;
	}

	public void setPublicationNumber(String publicationNumber) {
		this.publicationNumber = publicationNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", publication="
				+ publication + ", publicationNumber=" + publicationNumber + ", price=" + price + "]";
	}

}
