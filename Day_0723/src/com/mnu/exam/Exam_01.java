package com.mnu.exam;

class Super{
	private int a=10;
	int b=100;
	
}
class Child extends Super{
	int b=50;
	int d=10;
	
	void test() {
		System.out.println("Super.b=" +super.b);
		System.out.println("b="+b);
		System.out.println("d="+d);
	}
}

public class Exam_01 {
	public static void main(String[] args) {
     Super s1 = new Super();
     System.out.println("s1.b="+s1.b);//100
     
     Child c1 = new Child();
     System.out.println("c1.b="+c1.b);//100
     System.out.println("c1.d="+c1.d);//10
     
	}

}
