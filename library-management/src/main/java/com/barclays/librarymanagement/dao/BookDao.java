package com.barclays.librarymanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.librarymanagement.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long>  {

	List<Book> findByBookName(String bookName);
	
}
