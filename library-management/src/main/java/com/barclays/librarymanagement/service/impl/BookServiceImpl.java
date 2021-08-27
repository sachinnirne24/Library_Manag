package com.barclays.librarymanagement.service.impl;

import java.util.List;
import java.util.Objects;

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
		return bookDao.findAll();
	}

	@Override
	public List<Book> findByName(String bookName) {
		if(Objects.isNull(bookName))
			throw new IllegalArgumentException("Book name wasn't found");
		return bookDao.findByBookName(bookName);
	}

	@Override
	public Book createBook(Book book) {
		if(Objects.isNull(book))
			throw new IllegalArgumentException("Book object wasn't found");
		return bookDao.save(book);
	}

}
