package com.fissionlabs.coe.exception;

import org.springframework.security.core.AuthenticationException;

public class NotFoundException extends AuthenticationException{

	private static final long serialVersionUID = 1L;
	public NotFoundException(String msg) {
		super(msg);
	}
}
