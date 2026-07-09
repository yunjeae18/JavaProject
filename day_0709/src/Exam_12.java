//키보드로 실수 입력 입력된 값이 85~95사이면 
//"pass" 아니면 "no"출력하는 프로그램 작성

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);

		System.out.print("점수를 입력하시오");
		double val = scn.nextDouble();
		
		String str = (val>=85 && val<=95)? "pass" : "no";
		System.out.println(val + "는"+ str + "입니다");

	

	}

}
