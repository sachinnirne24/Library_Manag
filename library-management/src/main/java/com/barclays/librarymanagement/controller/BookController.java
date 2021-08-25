package com.barclays.librarymanagement.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.librarymanagement.entity.Book;
import com.barclays.librarymanagement.service.BookService;

@RestController
@RequestMapping("/api/library")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book/{bookName}")
	public Book getByBookName(@PathParam("bookName") String bookName) {
		return bookService.findByName(bookName);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.findAll();
	}

	@GetMapping("/book}")
	public Book createBook(Book book) {
		return bookService.createBook(book);
	}
}