package com.entityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
	@Id
	private Integer pId;
	private String pName;
	@OneToOne
	@JoinColumn(name="fk_pp")
	private Passport passport;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", passport=" + passport + "]";
	}
	public Person(Integer pId, String pName, Passport passport) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.passport = passport;
	}
	public Person() {
		super();
		
	}
	
	
	

}
