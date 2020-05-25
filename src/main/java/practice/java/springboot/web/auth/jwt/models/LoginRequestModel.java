package practice.java.springboot.web.auth.jwt.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import practice.java.springboot.web.auth.jwt.utils.CommonUtil;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LoginRequestModel extends GeneralRequestModel {
	private String username;
	private String password;
	public LoginRequestModel() {
		super.setCorrelationID(CommonUtil.generateUUID());
		super.setTimeStamp(System.currentTimeMillis());
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "correlationID: "+ super.getCorrelationID() + " " +
				"username: "+ username + " " +
				"password: "+ CommonUtil.maskPass(password) + " " +
				"timestamp: " + super.getTimeStamp();
	}
}
