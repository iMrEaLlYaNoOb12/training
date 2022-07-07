package com.model;

public class Employee {
	private int empNo;
	private String empName;
	private char empGender;
	private float empSalary;
	public Employee() {
		super();
		
	}
	public Employee(int empNo, String empName, char empGender, float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
}
