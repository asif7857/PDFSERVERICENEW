package com.fissionlabs.coe.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fissionlabs.coe.dto.ResponseDTO;

@ControllerAdvice
@EnableWebMvc
@ComponentScan(basePackageClasses = CustomExceptionHandler.class)
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ResponseDTO<String>> handleBadRequestException(BadRequestException ex){

		ResponseDTO<String> response = new ResponseDTO<String>(ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ResponseDTO<String>> handleUserNotFoundException(UserNotFoundException ex){

		ResponseDTO<String> response = new ResponseDTO<String>(ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ForbiddenException.class)
	public ResponseEntity<ResponseDTO<String>> handleForbiddenException(ForbiddenException ex){

		ResponseDTO<String> response = new ResponseDTO<String>(ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(InternalServerException.class)
	public ResponseEntity<ResponseDTO<String>> handleInternalServerException(InternalServerException ex){

		ResponseDTO<String> response = new ResponseDTO<String>(ex.getMessage());
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
