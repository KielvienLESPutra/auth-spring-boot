package practice.java.springboot.web.auth.jwt.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

import practice.java.springboot.web.auth.jwt.exceptions.IncorrectFormatDataException;
import practice.java.springboot.web.auth.jwt.models.LoginRequestModel;
import practice.java.springboot.web.auth.jwt.models.LoginResponseModel;
import practice.java.springboot.web.auth.jwt.models.UserModel;
import practice.java.springboot.web.auth.jwt.services.UserManagementService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path="/api/V_0_1")
public class RestController {
	private Logger log = LoggerFactory.getLogger(RestController.class);
	private ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	private UserManagementService userMgmt;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<LoginResponseModel> loginController(@RequestBody LoginRequestModel request) {
		LoginResponseModel response = new LoginResponseModel();
		try {
			if(null == request) {
				throw new IncorrectFormatDataException("/login", request.toString());
			}
			
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}catch (Exception e) {
			log.error("Error Controller data: [" + request + "]", e);
			throw new IncorrectFormatDataException("/login", request.toString());
		}
	};
	
	@RequestMapping(value="create_account", method=RequestMethod.POST)
	public ResponseEntity<String> createAccount(){
		String resp = "Oke";
		try{
			UserModel user = new UserModel();
			user.setAddress("Jakarta");
			user.setEmail("for2university@gmail.com");
			user.setName("Kielvien");
			user.setPassword("kielvien");
			user.setUsername("kielvienPass");
			boolean flagSave = userMgmt.createNewUser(user);
			if(flagSave == true) {
				return ResponseEntity.status(HttpStatus.OK).body(resp);
			}
		}catch (Exception e) {
			log.error("Error Controller data ",e);
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp);
	}
}
