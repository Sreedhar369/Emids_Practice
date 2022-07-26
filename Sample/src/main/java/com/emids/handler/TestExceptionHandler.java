package com.emids.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.emids.exception.InvalidHandlerException;

@RestControllerAdvice
public class TestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<String> handleInvalidHeaderFieldException(InvalidHandlerException exception) {
		
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
	}
}
