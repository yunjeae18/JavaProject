//사칙연산 수행

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	System.out.print("계산기:");
	int a = scn.nextInt();
	String op= scn.next();
	int b = scn.nextInt();
	
	int result=0;
	switch(op) {
	case "+":
		result = a+b;
		break;
	case"-":
		result= a-b;
		break;
	case "*":
		result= a*b;
		break;
	case "/":
		result= a/b;
		break;
	case "%":
		result= a%b;
		break;
		default:
			System.out.println("연산자오류");
			//System.exit(0);
	}
	if(op.equals("+")|| op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%")) {
	System.out.print(a+op+b+"="+result);
	}

}
