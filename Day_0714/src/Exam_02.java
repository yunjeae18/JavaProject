//키보드로 급여를 입력 화페단위별 매수를 구하여 출력

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
			
			System.out.print("입력하시오:");
			int pay= scn.nextInt();
	        int money= 50000;
	    System.out.printf("급여: %7d\n",pay);
	    for(int i=1; i<=10; i++) {
	    	System.out.printf("%5d:",money);
	    	int mok = pay / money;
	    	System.out.printf("%3d\n:",mok);
	    	pay %= money;
	    	if(i%2==1) {
	    	money = money / 5;
	    	}else {
	    	money = money / 2;
	    }
	    	if(pay==0)
	    		break;
	    }
		}
	}


