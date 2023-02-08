package com.axis.newsservice.exception;

public class NewsNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -465328L;

	public NewsNotFoundException() {
		super();
		
	}

	public NewsNotFoundException(String message) {
		super(message);
		
	}
	
	

}
