/* 정수 배열 5개 선언
 * 키보드를 이용하여 배열에 데이터 저장
 * 배열[0]=10
 * 배열[1]=30
 * 
 * 배열요소출력후 합계 출력
 */

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int score[] = new int[5];
    
    for(int i=0; i<5; i++) {
    	System.out.print("score["+i+]=");"
    	score[i] = scn.nextInt();
    }
    
    System.out.print("="+sum);
    System.out.print("\n");

    //출력 및 합계{확장 for
		int sum2=0;
		for(int a : score) {
			System.out.print(a+" ");
			sum2+= a;
		}
		
		System.out.print("="+sum2);
		
		
		
		
		
	}

}
