package practice.java.springboot.web.auth.jwt.models;

import practice.java.springboot.web.auth.jwt.utils.DateUtil;

public class GeneralResponseModel {
	private String correlationID;
	private String status;
	private int code;
	private String message;
	private long timeStamp;
	
	public GeneralResponseModel() {
		this.timeStamp = DateUtil.DateMilis();
	}
	
	public String getCorrelationID() {
		return correlationID;
	}
	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
