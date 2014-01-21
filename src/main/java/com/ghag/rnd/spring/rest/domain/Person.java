package com.ghag.rnd.spring.rest.domain;

import java.util.UUID;

public class Person {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private String designation;
	private String voice;
	private String email;
	private String pincode;
	
	public Person(){
		id = UUID.randomUUID();
	}
	
	public Person(String seed){
		id = UUID.randomUUID();
		firstName = "Ganesh Ghag "+seed;
		lastName = "Ghag"+seed;
		designation = "Architect"+seed;
		voice = "9930330330"+seed;
		email = "ganya@hotmail.com"+seed;
		pincode = "400701"+seed;
		
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", designation=" + designation + ", voice="
				+ voice + ", email=" + email + ", pincode=" + pincode + "]";
	}
	
	

}
