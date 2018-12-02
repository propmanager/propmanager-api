package com.propertymanager.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class Tenant {
	@JsonProperty("id")
	private String id;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("dateOfBirth")
	private LocalDate dateOfBirth;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDateOfBerth() {
		return dateOfBirth;
	}

	public void setDateOfBerth(LocalDate dateOfBerth) {
		this.dateOfBirth = dateOfBerth;
	}
}
