package com.oops;

public class Employee {
	
	private int empid;
	private String empname;
	private String empAdd;
	private int empsal;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
//	public int getEmpsal() {
//		return empsal;
//	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empAdd=" + empAdd + ", empsal=" + empsal + "]";
	}
	
	
	//2 methods getters and setters

	

}
