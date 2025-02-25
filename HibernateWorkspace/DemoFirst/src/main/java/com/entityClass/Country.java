package com.entityClass;

import java.util.List;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Country {
	@Id
	private Integer countryId;
	private String countryName;

	@OneToMany(mappedBy = "country" ,cascade = CascadeType.ALL)
	private List<City> city;
	
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", city=" + city + "]";
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<City> getCity() {
		return city;
	}
	public void setCity(List<City> city) {
		this.city = city;
	}
	public Country(Integer countryId, String countryName, List<City> city) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.city = city;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
