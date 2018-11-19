package com.app.core;

public class Emp {
	private int id;
	private String name;
	private double salary;

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Emp)
			return id == ((Emp) o).id;
		return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in emp's  hashCode");
		return id*23;
	}

}
