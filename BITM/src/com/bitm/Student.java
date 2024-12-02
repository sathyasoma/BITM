package com.bitm;

//with constructor
public class Student {

	int sid; // 1000
	String stname;// sathya

//	void assign() {
//		sid = 100;
//		stname = "kumar";
//	}

	Student() {
		sid = 100;
		stname = "sathya";

	}

	void dispaly() {
		System.out.println(sid + " " + stname);
	}

	public static void main(String[] args) {

		Student st = new Student(); // object createion

		// st.assign(); //explicitly calingt
		st.dispaly();

	}

}
