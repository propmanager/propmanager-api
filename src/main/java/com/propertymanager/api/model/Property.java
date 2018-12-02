package com.propertymanager.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
	@JsonProperty("id")
	private String id;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("street")
	private String street;
	@JsonProperty("unitNumber")
	private long unitNumber;
	@JsonProperty("houseNumber")
	private long houseNumber;
	@JsonProperty("numMaxTenants")
	private int numMaxTenants;
	@JsonProperty("numCurrTenants")
	private int numCurrTenants;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(long unitNumber) {
		this.unitNumber = unitNumber;
	}

	public long getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(long houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getNumMaxTenants() {
		return numMaxTenants;
	}

	public void setNumMaxTenants(int numMaxTenants) {
		this.numMaxTenants = numMaxTenants;
	}

	public int getNumCurrTenants() {
		return numCurrTenants;
	}

	public void setNumCurrTenants(int numCurrTenants) {
		this.numCurrTenants = numCurrTenants;
	}
}
