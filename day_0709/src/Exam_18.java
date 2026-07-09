import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("점수입력");
    int val = scn.nextInt();
    
    String str="";
    if(val>=80) {
    	if(val<=90) {
    		//System.out.println("80~90 pass");
    		str= "80~90 pass";
    	}else {
    		str= "80이상 90 초과 no";
    	}
    }else {
    	str="80미만 no";
    }
    System.out.println(val+"점수의 결과는"+str);
	}

}
