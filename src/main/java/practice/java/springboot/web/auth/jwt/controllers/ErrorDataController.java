package practice.java.springboot.web.auth.jwt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import practice.java.springboot.web.auth.jwt.exceptions.IncorrectFormatDataException;
import practice.java.springboot.web.auth.jwt.models.ErrorResponseModel;

@ControllerAdvice
public class ErrorDataController {
	@ExceptionHandler(value = IncorrectFormatDataException.class)
	public ResponseEntity<ErrorResponseModel> exception(IncorrectFormatDataException exception) {
		ErrorResponseModel resp = new ErrorResponseModel();
		resp.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.name());
		resp.setCorrelationID(exception.getCorrelationID());
		resp.setMessage(exception.getMessage());
		resp.setPath(exception.getPath());
		resp.setBody(exception.getBody());
		return new ResponseEntity<ErrorResponseModel>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
