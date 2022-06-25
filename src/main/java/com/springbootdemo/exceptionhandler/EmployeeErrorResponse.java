package com.springbootdemo.exceptionhandler;

public class EmployeeErrorResponse {
	private int Status;
	private String message;
	private Long timeStamp;
	public EmployeeErrorResponse(int status, String message, Long timeStamp) {
		super();
		Status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public EmployeeErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
