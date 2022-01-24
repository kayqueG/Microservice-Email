package com.ms.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {
	
	@NotBlank
	private String ownerRef;
	
	@Email
	@NotBlank
	private String emalFrom;
	
	@NotBlank
	@Email
	private String emailTo;
	
	@NotBlank
	private String subject;
	
	@NotBlank
	private String text;

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmalFrom() {
		return emalFrom;
	}

	public void setEmalFrom(String emalFrom) {
		this.emalFrom = emalFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}