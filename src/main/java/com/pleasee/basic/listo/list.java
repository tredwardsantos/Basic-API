package com.pleasee.basic.listo;

public class list {

	private String id;
	private String firstname;
	private String middleini;
	private String lastname;
	private String mddress;
	private String mobile;
	

	

public list() {
	
}
	
public list(String id, String firstname, String middleini, String lastname, String mddress, String mobile) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.middleini = middleini;
	this.lastname = lastname;
	this.mddress = mddress;
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
	public String getDescription() {
		return middleini;
	}
	public void setDescription(String Middlename) {
		this.middleini = Middlename;
	}
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMddress() {
		return mddress;
	}

	public void setMddress(String mddress) {
		this.mddress = mddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
