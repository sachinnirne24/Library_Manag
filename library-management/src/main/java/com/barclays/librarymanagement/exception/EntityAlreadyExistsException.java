package com.barclays.librarymanagement.exception;

import java.io.Serializable;

public class EntityAlreadyExistsException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = -4974229270567418904L;

	public EntityAlreadyExistsException(String message) {
		super(message);
	}

	public EntityAlreadyExistsException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public EntityAlreadyExistsException(Throwable throwable) {
		super(throwable);
	}
}
