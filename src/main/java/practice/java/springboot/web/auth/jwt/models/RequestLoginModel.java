package practice.java.springboot.web.auth.jwt.models;

import org.springframework.stereotype.Component;

@Component
public class RequestLoginModel extends GeneralRequestModel{
	private static final long serialVersionUID = 1L;
	private String email;
	private String credential;
	
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