//키보드로 급여를 입력 화페단위별 매수를 구하여 출력

import java.util.Scanner;

public class Exam_03_1 {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
			
			System.out.print("입력하시오:");
			int pay= scn.nextInt();
	        int money= 50000;
	    System.out.printf("급여: %7d\n",pay);
	    boolean flag = true;
	    
	    while(pay != 0) {
	    	System.out.printf("%5d : ",money);
	    	int mok = pay / money;
	    	System.out.printf("%3d : ",mok);
	    	pay = pay % money;
	    	
	    	if(flag) {
	    	money = money / 5;
	    	flag = false;
	    	}else {
	    	money = money / 2;
	    	flag = true;
	    }
	    
	    }
		}
	}


