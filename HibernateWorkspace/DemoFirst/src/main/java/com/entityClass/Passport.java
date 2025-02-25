package com.entityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	private Integer ppId;
	private String ppName;
	@OneToOne(mappedBy = "passport")
	private Person person;
	
	
	public Integer getPpId() {
		return ppId;
	}
	public void setPpId(Integer ppId) {
		this.ppId = ppId;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [ppId=" + ppId + ", ppName=" + ppName + ", person=" + person + "]";
	}
	public Passport(Integer ppId, String ppName, Person person) {
		super();
		this.ppId = ppId;
		this.ppName = ppName;
		this.person = person;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
