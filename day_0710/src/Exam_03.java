//1.키보드로 점수를 입력 입력된 점수가 80~90 사이면 "pass"
//2.키보드로 점수를 입력 입력된 점수가 80~90 사이면 "pass"
//  아니면 "nopass"

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("입력 : ");
    int score = scn.nextInt();
    
    if(score>=80 && score<=90) {
    	System.out.println("&&(and) 사용시 pass");
    }else {
    System.out.println("&&(and) 미사용시 nopass");
    	}
    }
	//
	}

