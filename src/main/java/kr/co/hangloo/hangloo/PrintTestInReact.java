package kr.co.hangloo.hangloo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PrintTestInReact {

	@GetMapping("/testBack")
	public ResponseEntity<String> testFunc(){
		
		ResponseEntity<String> result = ResponseEntity.ok("hello world");
		
		return result;
	}
	
}
