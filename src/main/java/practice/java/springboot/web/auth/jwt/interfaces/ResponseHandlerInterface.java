package practice.java.springboot.web.auth.jwt.interfaces;

import org.springframework.http.ResponseEntity;

public interface ResponseHandlerInterface {
	public ResponseEntity<String> success(String body);
	public ResponseEntity<String> dataNotFound();
	public ResponseEntity<String> internalServerError();
	public ResponseEntity<String> nullPointer();
}
