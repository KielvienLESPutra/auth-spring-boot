package practice.java.springboot.web.auth.jwt.models;

import java.io.Serializable;

import practice.java.springboot.web.auth.jwt.utils.ToolUtil;

public class GeneralRequestModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String workoutId;
	private long timeRequest;
	private String correspondenId;
	
	public GeneralRequestModel(){
		this.workoutId = ToolUtil.generatorUUIDGuid();
	}
	
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
}
