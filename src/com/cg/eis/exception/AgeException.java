package com.cg.eis.exception;

public class AgeException extends Exception{

	private String message;

	public AgeException() {

	}

	public AgeException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
