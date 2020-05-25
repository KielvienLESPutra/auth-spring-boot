package practice.java.springboot.web.auth.jwt.exceptions;

import practice.java.springboot.web.auth.jwt.constants.Constanst;
import practice.java.springboot.web.auth.jwt.utils.CommonUtil;

public class IncorrectFormatDataException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public IncorrectFormatDataException(String path, String body){
		super();
		this.setCorrelationID(CommonUtil.generateUUID());
		this.setPath(path);
		this.setBody(body);
		this.setMessage(Constanst.INVALID_FORMAT_MESSAGE);
	}
	
	public IncorrectFormatDataException(Throwable err, String correlationID, String path, String body) {
		super(err);
		this.setPath(path);
		this.setCorrelationID(correlationID);
		this.setBody(body);
		this.setMessage(Constanst.INVALID_FORMAT_MESSAGE + "\n [" + err + "]");
	}
	
	private String path;
	private String message;
	private String correlationID;
	private String body;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
