package practice.java.springboot.web.auth.jwt.models;

import java.io.Serializable;

public class GeneralResponseModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String workoutId;
	private long timeRequest;
	private String correspondenId;
	private String message;
	private String status;
	private int code;
	
	public String getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(String workoutId) {
		this.workoutId = workoutId;
	}
	public long getTimeRequest() {
		return timeRequest;
	}
	public void setTimeRequest(long timeRequest) {
		this.timeRequest = timeRequest;
	}
	public String getCorrespondenId() {
		return correspondenId;
	}
	public void setCorrespondenId(String correspondenId) {
		this.correspondenId = correspondenId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
}
