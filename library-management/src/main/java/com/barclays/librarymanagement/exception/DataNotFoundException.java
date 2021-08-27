package com.barclays.librarymanagement.exception;

import java.io.Serializable;

public class DataNotFoundException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1222483670470290700L;


	public DataNotFoundException(String message, String resourceId) {
		super(String.format("%s%s", message, resourceId));
	}

	public DataNotFoundException(String message) {
		super(message);
	}

	public DataNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public DataNotFoundException(Throwable throwable) {
		super(throwable);
	}
}
