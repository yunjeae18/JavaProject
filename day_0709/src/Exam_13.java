//키보드로 정수를 입력 입력된 정수가 80이상 "합격"

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);

System.out.print("정수입력");
int score= scn.nextInt();

if(score>=80) {
	System.out.println("pass");
}
System.out.println("program End");
	}

}
