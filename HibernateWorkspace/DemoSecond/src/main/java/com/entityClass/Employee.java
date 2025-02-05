package com.entityClass;

import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(appliesTo ="empTableForSecond")
public class Employee {
     @Id
	 private Integer id;
	 private String name;
	 private String city;
	 private Integer age;
	 private Integer salary;
	 
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	public Employee(Integer id, String name, String city, Integer age, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}
	 
	 
	 
	 
	 
	 
}
