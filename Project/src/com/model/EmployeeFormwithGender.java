package com.model;

public class EmployeeFormwithGender {
	
	private String id;
	private String name;
	private String gender;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public EmployeeFormwithGender() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeFormwithGender(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	
	
	
}
