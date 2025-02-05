package com.entityClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "StudentData")
public class StudentInheritenceEx extends UserInheitenceEx {
	private Integer marks;
	private String dept;
	private String school;
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "StudentInheritenceEx [marks=" + marks + ", dept=" + dept + ", school=" + school + "]";
	}
	public StudentInheritenceEx(Integer marks, String dept, String school) {
		super();
		this.marks = marks;
		this.dept = dept;
		this.school = school;
	}
	public StudentInheritenceEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInheritenceEx(Integer id, String name, String city, Integer age) {
		super(id, name, city, age);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
