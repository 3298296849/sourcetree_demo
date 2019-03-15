package com.lsp.oct.exception;

public class BaseControllerException extends RuntimeException{

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	public BaseControllerException() {
		super();
	}

	public BaseControllerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseControllerException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseControllerException(String message) {
		super(message);
	}

	public BaseControllerException(Throwable cause) {
		super(cause);
	}

	
}
