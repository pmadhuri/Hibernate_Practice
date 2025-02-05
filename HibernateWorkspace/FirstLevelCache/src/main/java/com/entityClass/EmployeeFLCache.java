package com.entityClass;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class EmployeeFLCache {
	@Id
	private Integer id;
	private String name;
	private String city;
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	public EmployeeFLCache(Integer id, String name, String city, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public EmployeeFLCache() {
		super();
		
	}
	
	
	
	

}
