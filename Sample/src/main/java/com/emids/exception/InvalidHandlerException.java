package com.emids.exception;

public class InvalidHandlerException extends RuntimeException{

		
	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidHandlerException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
