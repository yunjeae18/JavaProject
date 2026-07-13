//키보드 정수 데이터가 무작위로 엔개 입력 될 경우
//입력 데이터 중에서 5이상 데이터 5개 입력하는 프로그램 작성

import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int cnt=0;
    System.out.print("Data:");
    while(true) {
    	int n= scn.nextInt();
    	if(n >= 5) {
    		System.out.print(n);
    		cnt++;
    		if(cnt==5) {
    			break;
    		}
    	}
    }
	}

}
