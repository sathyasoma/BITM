package com.oops;

class SuperEx {

	int salary = 65000;

	void getAmount(int salary) {
		salary = 75000;

		System.out.println(salary);
	}
}
public class ThisEx extends SuperEx {

	int salary = 35000;

	void getSalary(int salary) {
		salary = 45000;
		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(this);
		super.getAmount(89000);
		System.out.println(super.salary);
	}

	public static void main(String[] args) {

		ThisEx obj = new ThisEx();
		obj.getSalary(55000);
	}
}
