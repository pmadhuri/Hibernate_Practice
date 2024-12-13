package com.entityClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
	@Id
	private Integer cityId;
	private String cityName;
	@ManyToOne
	private Country country;
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(Integer cityId, String cityName, Country country) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.country = country;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", country=" + country + "]";
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
	

}
