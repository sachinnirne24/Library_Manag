package com.barclays.librarymanagement.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.barclays.librarymanagement.service.BookService;


@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BookService bookService;
	
	//wen test
		@Test
		public void dummyItem_basic() throws Exception {
			RequestBuilder request = MockMvcRequestBuilders
					.get("/api/library/books")
					.accept(MediaType.APPLICATION_JSON);
			
			mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json("{\"bookId\":101,\"bookName\":\"MyBook\",\"bookAuthor\":\"Sachin Nirne\",\"publication\":\"My Publication\",\"publicationNumber\":\"ISBN_001_001\",\"price\":123.5}"))
			.andReturn();
			
		}
		
		@Test
		public void itemFromBusinessService_basic() throws Exception {
			
			//when(bookService.findByName("MyBook").thenReturn(Arrays.asList(new Book(101L, "MyBook", "Sachin Nirne",  "My Publication", "ISBN_001_001", 2001, 123.50))));
			
			RequestBuilder request = MockMvcRequestBuilders
					.get("/api/library/books")
					.accept(MediaType.APPLICATION_JSON);
			
			mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json(""))
			.andReturn();
			
		}
		
}
