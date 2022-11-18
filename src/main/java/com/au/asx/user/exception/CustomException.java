package com.au.asx.user.exception;

public class CustomException extends RuntimeException {
	
	/**
	 * The constant serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private final String errorMessage;
	
	public CustomException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}

}
