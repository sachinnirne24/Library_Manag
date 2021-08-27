package com.barclays.librarymanagement;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclays.librarymanagement.dao.BookDao;
import com.barclays.librarymanagement.entity.Book;

@SpringBootApplication
public class LibraryManagementApplication {

	@Autowired
	private BookDao bookDao;
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}
	
	@PostConstruct
	  private void initDb() {
		List<Book> books = Arrays.asList(new Book(101L, "MyBook", "Sachin Nirne",  "My Publication", "ISBN_001_001", 2001, 123.50),
				new Book(102L, "MyBook_A", "Amit Dhanorkar",  "My Publication_C", "ISBN_001_002", 2001, 153.50),
				new Book(103L, "MyBook_B", "Amol Patil",  "My Publication_B", "ISBN_001_003", 2003, 163.50),
				new Book(104L, "MyBook_B", "Sumit Joshi",  "My Publication_D", "ISBN_001_004", 2005, 173.50),
				new Book(105L, "MyBook", "Kapil Bhosale",  "My Publication_E", "ISBN_001_005", 2006, 183.50));
		bookDao.saveAll(books);
	    
	  }

}
