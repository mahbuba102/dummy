package com.talentech.hr;

public class Location {
	
	private int LocId;
	private String StAdd;
	private String ZipCode;
	private String City;
	private String State;
	private String Country;
	
	
	

	public Location(int locId, String stAdd, String zipCode, String city, String state, String country) {
		
		this.LocId = locId;
		this.StAdd = stAdd;
		this.ZipCode = zipCode;
		this.City = city;
		this.State = state;
		this.Country = country;
	}
	
	public int getLocId() {
		return this.LocId;
	}
	public void setLocId(int locId) {
		this.LocId = locId;
	}
	public String getStAdd() {
		return StAdd;
	}
	public void setStAdd(String stAdd) {
		this.StAdd = stAdd;
	}
	public String getZipCod() {
		return this.ZipCode;
	}
	public void setZipCod(String Zipcode) {
		this.ZipCode = Zipcode;
	}
	public String getCity() {
		return this.City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getState() {
		return this.State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCountry() {
		return this.Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}

    
}
