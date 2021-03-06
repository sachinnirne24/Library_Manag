package com.barclays.librarymanagement.service;

import java.util.List;

import com.barclays.librarymanagement.entity.Book;

public interface BookService {

	List<Book> findAll();

	List<Book> findByName(String bookName);

	Book createBook(Book book);

}
