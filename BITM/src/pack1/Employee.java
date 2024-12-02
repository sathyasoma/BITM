package pack1;

class ParentEx{
	
	private void m2() {
		System.out.println("i ma m2 method from parent employee class");
	}
}
public class Employee extends ParentEx {

	 void m1() {
		System.out.println("i am m1 method from employee class pack1");
	}
	
	public static void main(String[] args) {
		ParentEx  obj= new ParentEx();
		
	//	obj.m2();
		
	}
	
}
