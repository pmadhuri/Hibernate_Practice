package com.entityClass;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	private Integer cid;
	private String cname;
	@ManyToMany(mappedBy = "customer")
	private List<Bank> bank;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Bank> getBank() {
		return bank;
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", bank=" + bank + "]";
	}
	public Customer(Integer cid, String cname, List<Bank> bank) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bank = bank;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
