package com.gvace.hibernate.HibernatePractice.domain;

public class Employee {
	private int id;
	private String name;
	private String email;
	private java.util.Date hiredate;
	public Employee(){
		
	}
	public Employee(String name, String email, java.util.Date hiredate){
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(java.util.Date hiredate) {
		this.hiredate = hiredate;
	}
	
}
