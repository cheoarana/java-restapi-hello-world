package com.cheoarana.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cheoarana.domain.Response;

@RestController
public class HelloController {
	
	private static final String helloTemplate ="Hello, %s";
	
	@GetMapping("/saludar/{name}")
	public ResponseEntity<Response> greet(@PathVariable(value="name") String name) {
		Response response = new Response();		
		try {
			response.setMessage(String.format(helloTemplate, name));
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
