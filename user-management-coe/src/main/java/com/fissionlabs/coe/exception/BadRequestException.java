package com.fissionlabs.coe.exception;

import org.springframework.security.core.AuthenticationException;

public class BadRequestException extends AuthenticationException{

	private static final long serialVersionUID = 1L;
	public BadRequestException(String msg) {
		super(msg);
		
	}
}
