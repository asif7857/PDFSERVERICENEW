package com.fissionlabs.coe.dto;

public class ResponseDTO<String> {

	private String message;
	
	public ResponseDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
