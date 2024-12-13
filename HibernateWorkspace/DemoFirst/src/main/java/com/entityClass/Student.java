package com.entityClass;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {

	
	@Id
	private Integer sid;
	private String name;
	private String email;
	private Student_Address address;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student_Address getAddress() {
		return address;
	}
	public void setAddress(Student_Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	public Student(Integer sid, String name, String email, Student_Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}


