package com.abhishek.spring.boot.exceptions;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse {

	//The message that we want to display to the end user.
	private String message;
	private String details;
	//Time when an exception is thrown
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh-mm-ss")
	private LocalDateTime timestamp;

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
