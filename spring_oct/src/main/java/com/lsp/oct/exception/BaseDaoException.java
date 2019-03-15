package com.lsp.oct.exception;

public class BaseDaoException extends RuntimeException{

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	public BaseDaoException() {
		super();
	}

	public BaseDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseDaoException(String message) {
		super(message);
	}

	public BaseDaoException(Throwable cause) {
		super(cause);
	}

	
	
}
