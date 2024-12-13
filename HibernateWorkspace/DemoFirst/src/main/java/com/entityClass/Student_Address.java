package com.entityClass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
@Embeddable
public class Student_Address {

	private String city;
	private String state;
	private String zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Student_Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	public Student_Address(String city, String state, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Student_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
