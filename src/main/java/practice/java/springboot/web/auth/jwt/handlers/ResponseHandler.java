package practice.java.springboot.web.auth.jwt.handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import practice.java.springboot.web.auth.jwt.interfaces.ResponseHandlerInterface;

@Configuration
public class ResponseHandler implements ResponseHandlerInterface{
	
	@Bean
	@Override
	public ResponseEntity<String> success(String body) {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK).body(body);
	}
	
	@Bean
	@Override
	public ResponseEntity<String> dataNotFound() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Bean
	@Override
	public ResponseEntity<String> internalServerError() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@Bean
	@Override
	public ResponseEntity<String> nullPointer() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

}
