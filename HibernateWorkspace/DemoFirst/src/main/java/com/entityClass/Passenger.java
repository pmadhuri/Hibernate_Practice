package com.entityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {
//declaring variable
	@Id
	private Integer pid;
	private String name;
	private String city;
	private Integer age;
	//getter and setter 
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	//toString method
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	//parameterized constructor
	public Passenger(Integer pid, String name, String city, Integer age) {
		super();
		this.pid = pid;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	//default constructor
	public Passenger() {
		super();
		
	}
	
}
