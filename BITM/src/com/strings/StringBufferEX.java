package com.strings;

public class StringBufferEX {
public static void main(String[] args) {
	
	StringBuffer sb= new StringBuffer("welcome");
	StringBuffer sb1= new StringBuffer("welcome"); //
	//sb.append("to india");
	//System.out.println(sb); //
	
	System.out.println(sb.equals(sb1)); //java.lang.Object
	System.out.println(sb==sb1); 
}
}
