package com.org.emplo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salary {
	@Id
	private int id;
	
	private long salary;
	
	private int empId;
	
	
	private String crDate;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getCrDate() {
		return crDate;
	}


	public void setCrDate(String crDate) {
		this.crDate = crDate;
	}
	

	
}
