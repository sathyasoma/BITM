package com.oops;

public class Hacker {

	public static void main(String[] args) {
		
		
		Employee emp= new Employee();
				
				emp.setEmpid(123);
				emp.setEmpname("keerthi");
				emp.setEmpsal(100);
				
				System.out.println(emp.getEmpAdd()+" "+emp.getEmpid()+" "+emp.getEmpname());
				
				
				System.out.println(emp.toString());
	}
}
