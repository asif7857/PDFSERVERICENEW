package com.fissionlabs.coe.exception;

import org.springframework.security.core.AuthenticationException;

public class ForbiddenException extends AuthenticationException {
	
	private static final long serialVersionUID = 1L;
	public ForbiddenException(String msg) {
		super(msg);
	
	}
}
