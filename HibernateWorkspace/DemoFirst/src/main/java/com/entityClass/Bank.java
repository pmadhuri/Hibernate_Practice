package com.entityClass;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Bank {
	@Id
	private Integer bid;
	private String bname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="fktbl_bk_c",
	joinColumns = {@JoinColumn(name="b_fk")},
	inverseJoinColumns = {@JoinColumn(name="c_fk")})
	private List<Customer> customer;
	
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", customer=" + customer + "]";
	}
	public Bank(Integer bid, String bname, List<Customer> customer) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.customer = customer;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
