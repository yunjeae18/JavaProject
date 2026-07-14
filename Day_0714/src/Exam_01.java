//키보드로 n(값) 입력 1~n 까지 정수를 출력후 홀수의 합을 출력
//한줄에는 10개씩 출력

//[입력예시1]                 [출력예시1]
//입력: 20              1 2 3 4 5 6 7 8 9 10
//            11 12 13 14 15 16 17 18 19 20
//                              홀수 합: 100


//[입력예시2]                 [출력예시2]
//입력: 100             1 2 3 ...         10
//                     11...             20

//                     90...            100
//                               홀수 합:2500

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하시오: ");
		int n = scn.nextInt();
		
		int sum=0;
		/* for(int i=1; i<=n; i++) {
	    	 System.out.print("%4d", i);
	    	 if(i%10==0){
	    	 system.out.print("\n");
	    	 }
	    	 
	    	 if(i%2==1){
	    	 sum += i;
		 */
		for(int i=1; i<=n; i++) {
	    	 System.out.print(i+"\t");
	    	 if (i%2==1)
	    		 sum += i;
	    	 
	    	 if(i%10==0)
	    		 System.out.println();
	    	 }
			System.out.println("홀수 합:"+ sum);
			
		}

}

