package com.mnu.exam;

class SuperA{
	
}
class ChildA extends SuperA{
	
}
public class Exam_06 {
	public static void main(String[] args) {
		//조상은 자식 객체 생성 가능
		SuperA a= new SuperA();
        SuperA sa = new ChildA();//업케스팅(형변환)
    // 자식은 조상 객체 생성 불가
        int value = (int)3.14;
        double dd + 100;
       //ChildA ca= (ChildA)a;
       
       int var[]= new int[3];
       //var[5]=100;
       
       ChildA ca = (ChildA)sa;
	}

}
