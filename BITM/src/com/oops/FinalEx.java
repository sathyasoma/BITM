package com.oops;

 class ParentEx{
	
	int age=88;
	
	 void getAge(int age) {
		this.age=++age;
		System.out.println("i am parent age"+this.age);
	}
}
public class FinalEx extends ParentEx{
	
	void getAge(int age) {
		this.age=--age;
		System.out.println("i am child age"+this.age);
	}
	public static void main(String[] args) {
		
		FinalEx obj= new FinalEx();
		
		obj.getAge(68);  //88 87 86 67 68 69
		
	}

}
