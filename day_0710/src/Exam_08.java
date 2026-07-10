//3개의 정수를 입력 최대값, 최솟값 찾기

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("3개의 정수입력: ");
    int a= scn.nextInt();
    int b= scn.nextInt();
    int c= scn.nextInt();
    
    if(a<1 || b<1 || c<1) {
    	System.out.println("입력오류");
    	System.exit(0);
    }
    
    if(a>b && a>c) {
    	System.out.println(a+","+b+","+c+"="+a);
    }else if(a>b && a<c) {
    	System.out.println(a+","+b+","+c+"="+c);
    }else if(a<b & b>c){
    	System.out.println(a+","+b+","+c+"="+b);
    }else {
    	System.out.println(a+","+b+","+c+"="+c);

    }
    
    
	}

}
