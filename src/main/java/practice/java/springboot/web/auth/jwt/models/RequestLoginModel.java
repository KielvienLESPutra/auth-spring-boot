package practice.java.springboot.web.auth.jwt.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RequestLoginModel extends GeneralRequestModel{
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(RequestLoginModel.class);
	
	private String email;
	private String credential;
	
	public RequestLoginModel() {
		log.info("--constractor--");
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCredential() {
		return credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}
}