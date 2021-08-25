package com.barclays.librarymanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.librarymanagement.dao.BookDao;
import com.barclays.librarymanagement.entity.Book;
import com.barclays.librarymanagement.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> findAll() {
		return null;
	}

	@Override
	public Book findByName(String bookName) {
		return null;
	}

	@Override
	public Book createBook(Book book) {
		return null;
	}

}
