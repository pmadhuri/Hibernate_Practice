package com.entityClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "EmployeeData")
public class EmployeeInheritenceEx extends UserInheitenceEx {
	private Integer salary;
	private String role;
	private String email;
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeInheritenceEx [salary=" + salary + ", role=" + role + ", email=" + email + "]";
	}
	public EmployeeInheritenceEx(Integer salary, String role, String email) {
		super();
		this.salary = salary;
		this.role = role;
		this.email = email;
	}
	public EmployeeInheritenceEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	

}
