package com.ResumeAnalyzer;

public class ResumeData {
	private String email;
	private String phoneNumber;

	public ResumeData(String email, String phoneNumber) {

		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public ResumeData() {
		// TODO Auto-generated constructor stub
	}
		
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "ResumeData [email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	
}
