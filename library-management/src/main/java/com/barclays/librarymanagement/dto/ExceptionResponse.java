package com.barclays.librarymanagement.dto;

public class ExceptionResponse {

	private Integer errorCode;
	private String errorMessage;

	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionResponse(Integer errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}