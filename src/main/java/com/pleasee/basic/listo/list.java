package com.pleasee.basic.listo;

public class list {

	private String id;
	private String firstname;
	private String middleini;
	private String lastname;
	private String address;
	private String mobile;
	
public list() {
	
}
	
public list(String id, String firstname, String middleini, String lastname, String Address, String mobile) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.middleini = middleini;
	this.lastname = lastname;
	this.address = Address;
	this.mobile = mobile;
}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return firstname;
	}
	public void setName(String name) {
		this.firstname = name;
	}
	public String getMiddleini() {
		return middleini;
	}
	public void setMiddleini(String middleini) {
		this.middleini = middleini;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
