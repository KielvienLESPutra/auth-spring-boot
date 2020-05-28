package practice.java.springboot.web.auth.jwt.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import practice.java.springboot.web.auth.jwt.handlers.ResponseHandler;
import practice.java.springboot.web.auth.jwt.interfaces.RestAuthControllerInterface;
import practice.java.springboot.web.auth.jwt.models.RequestLoginModel;

@RestController
//@EnableAutoConfiguration
public class RestControllerJwt implements RestAuthControllerInterface{

	private Logger log = LoggerFactory.getLogger(RestControllerJwt.class);

	@Autowired(required = true)
	RequestLoginModel requestLogin;

//	@Autowired(required = true)
//	ResponseHandler respFail;
	
	@Override
	public void login(String request) {
		// TODO Auto-generated method stub
		try {
			log.info("--login operation - body: {}", request);
//			respFail.dataNotFound();
			requestLogin.setEmail(request);
			ResponseEntity.ok(requestLogin.toString());
		}catch (NullPointerException eNull) {
			// TODO: handle exception
			log.error("--Error login null pointer - body: "+ request, eNull);
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}catch (Exception ex) {
			// TODO: handle exception
			log.error("--Error login exception - body: "+ request, ex);
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Override
	public void checkAuth(String jwt) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logOut(String jwt) {
		// TODO Auto-generated method stub
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		ResponseEntity.ok("oke");
	}

}
