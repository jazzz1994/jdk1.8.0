package com.app.core;

public class Emp {
	private int id;
	private String name,dept;
	private double salary;
	public Emp(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

	
}
