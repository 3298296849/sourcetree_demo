package com.lsp.oct.exception;

public class BaseServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return super.getMessage();
	}

	public BaseServiceException() {
		super();
		
	}

	public BaseServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public BaseServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public BaseServiceException(String message) {
		super(message);
		
	}

	public BaseServiceException(Throwable cause) {
		super(cause);
		
	}
	
	

	
	
}
