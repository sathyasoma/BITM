package com.strings;

public class StringEx {

	public static void main(String[] args) {
		
		String name="welcome";  //string is immutable
		String name1="welcome";
		name.concat("india"); //wecome india	
		//welcome india
		System.out.println(name); //welcome,welcomeindia,india welcome,india
		
		//System.out.println(name.equals(name1)); // t  f t t 
		//System.out.println(name==name1); // f t t f
		
		String st= new String("india");
		String st1= new String("india");
		
		System.out.println(st.equals(st1)); // t  f t t 
		System.out.println(st==st1); // f t t f
		
		System.out.println(name.toUpperCase()); //WELCOME
		System.out.println(name.contains("wel")); //
		System.out.println(name.isEmpty());//false
		System.out.println(name.concat("to india")); //
		System.out.println(name.charAt(5));
		System.out.println(name.length());
		
		//assignment
	}
}
