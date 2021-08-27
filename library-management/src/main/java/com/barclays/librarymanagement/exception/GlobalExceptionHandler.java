package com.barclays.librarymanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.barclays.librarymanagement.dto.ExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DataNotFoundException.class)
	protected ResponseEntity<ExceptionResponse> handleResourceNotFound(WebRequest webRequest, Exception exception ){
		
		ExceptionResponse response = new ExceptionResponse(HttpStatus.NOT_FOUND.value(),exception.getLocalizedMessage());
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	protected ResponseEntity<ExceptionResponse> handleIllegalArgument(WebRequest webRequest, Exception exception ){
		
		ExceptionResponse response = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(),exception.getLocalizedMessage());
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(EntityAlreadyExistsException.class)
	protected ResponseEntity<ExceptionResponse> handleResourceAlreadyExists(WebRequest webRequest, Exception exception ){
		
		ExceptionResponse response = new ExceptionResponse(HttpStatus.CONFLICT.value(),exception.getLocalizedMessage());
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.CONFLICT);
	}
}
