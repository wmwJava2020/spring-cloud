package com.shopping.ws.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class AppsExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest webRequest){
		
		String errMsg = ex.getLocalizedMessage();
		
		if(errMsg == null) errMsg = ex.getLocalizedMessage();
		
		AppException appExc = new AppException(new Date(), errMsg);
				
		return new ResponseEntity<Object>(appExc, new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);		
	}
}
