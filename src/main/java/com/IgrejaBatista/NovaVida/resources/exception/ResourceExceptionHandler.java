package com.IgrejaBatista.NovaVida.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Date;    

import com.IgrejaBatista.NovaVida.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
     
	@ExceptionHandler(ObjectNotFoundException.class)
	 public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request){
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), df.format(new Date(System.currentTimeMillis())));
	 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	 }
}
