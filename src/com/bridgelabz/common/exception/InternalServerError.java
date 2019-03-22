package com.bridgelabz.common.exception;

public class InternalServerError extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InternalServerError() {
		super("OOPS! Something went wrong");
	}

	public InternalServerError(String errorMsg, Throwable e) {
		super(errorMsg, e);
	}

}
