package com.aileader.photobook.hangloophotobook;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PrintTestInReact {
	
	@GetMapping("/test")
	
	public ResponseEntity<String> hello() {
		
		ResponseEntity<String> result = ResponseEntity.ok("helloworld");
		
		return result;
	}
	
}
