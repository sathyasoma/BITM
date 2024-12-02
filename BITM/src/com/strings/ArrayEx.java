package com.strings;

public class ArrayEx {
public static void main(String[] args) {
		
   int marks[]=new int[4];
	
   
   marks[0]=56;
   marks[1]=89;
   marks[2]=90;
   marks[3]=54;
  //marks[4]=23;
   
   System.out.println(marks[0]);
   System.out.println(marks[1]);
   System.out.println(marks[2]);
   System.out.println(marks[3]);
   
   System.out.println("for loop");
   for (int i = 0; i < 3; i++) {
	System.out.println(marks[i]);
}
}
}
