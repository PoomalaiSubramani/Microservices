package com.restAPI.ChenckRestAPICallA.vo.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Employee {
	
	private int empId;
	private String name;
	private int salary;
	private Date doj;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, int salary, Date doj) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
	
	
	

}
