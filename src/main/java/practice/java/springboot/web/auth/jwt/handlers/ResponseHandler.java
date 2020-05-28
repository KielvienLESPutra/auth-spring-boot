package practice.java.springboot.web.auth.jwt.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import practice.java.springboot.web.auth.jwt.interfaces.ResponseHandlerInterface;

@Service
public class ResponseHandler implements ResponseHandlerInterface{
	
	@Override
	public ResponseEntity<String> success(String body) {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK).body(body);
	}
	
	@Override
	public ResponseEntity<String> dataNotFound() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@Override
	public ResponseEntity<String> internalServerError() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@Override
	public ResponseEntity<String> nullPointer() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

}
