package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException 
{
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFound(ProductNotFoundException pf)
	{
		return new ResponseEntity<>(pf.getMessage(),HttpStatus.NOT_FOUND);
		
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllProductNotFound(Exception pf)
	{
		return new ResponseEntity<>("Something went wrong"+pf.getMessage() ,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
