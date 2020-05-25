package practice.java.springboot.web.auth.jwt.models;

import org.springframework.stereotype.Component;

@Component
public class ResponseLoginModel extends GeneralResponseModel{
	private String token;
	private String tokenRefresh;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTokenRefresh() {
		return tokenRefresh;
	}
	public void setTokenRefresh(String tokenRefresh) {
		this.tokenRefresh = tokenRefresh;
	}
}
