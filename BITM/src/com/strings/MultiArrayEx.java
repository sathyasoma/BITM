package com.strings;

//multidimension Array
public class MultiArrayEx {

	public static void main(String[] args) {
		
		int x[][]= {{45,89,56},{78,23,56},{78,20,63}};
		
		for (int i = 0; i <3; i++) {  //0,0:0,1:0,2: 1,0:
			
			  for (int j = 0; j < 3; j++)
			  
			  {
				  System.out.print(x[i][j]+ " ");
				
			}
			  System.out.println();
		}
		
		
		
	}
}
