package practice.java.springboot.web.auth.jwt.models;

public class LoginResponseModel extends GeneralResponseModel {
	private String correlationID;
	private String jwt;
	public String getCorrelationID() {
		return correlationID;
	}
	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
}
