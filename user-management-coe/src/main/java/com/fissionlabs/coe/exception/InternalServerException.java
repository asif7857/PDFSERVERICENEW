package com.fissionlabs.coe.exception;

import org.springframework.security.core.AuthenticationException;

public class InternalServerException extends AuthenticationException{

	private static final long serialVersionUID = 1L;
	public InternalServerException(String msg) {
		super(msg);
		
	}	
}
