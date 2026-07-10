//키보드로 정수 연산자 정수 입력 산출연산(+,-,*,/,%)을 수행하는 프로그램 작성
import java.util.Scanner;

public class Exam_7_1 {

	public static void main(String[] args) {
    //문자열 비교는 [문자열=="문자열" ?X, 문자열.equals("문자열")]
	//입력 : 7*7
	//7*7=49
	//System.out.printf("%d * %d = %d \n",7,7,(7*7));

Scanner scn = new Scanner(System.in);
	System.out.print("입력 :");
	int a = scn.nextInt();
		String op=scn.next();
		int b= scn.nextInt();
		
		if(!op.equals("+")&&!op.equals("-")&&!op.equals("*")
				&&!op.equals("/")&&!op.equals("%")) {
			System.out.println("연산자오류");
			System.exit(0);
		}
			
		int res = -1;
		
		if(op.equals("+")) {
			res = a+b;
		}else if(op.equals("-")) {
			res = a-b;
		}else if(op.equals("*")) {
			res = a*b;
		}else if(op.equals("/")) {
			res = a/b;
		}else if(op.equals("%")) {
			res = a%b;
		}
		System.out.printf("%d %s %d = %d \n" , a,op,b,res);
		
		/*if(res != -1) {
			System.out.printf("%d %s %d = %d \n" , a,op,b,res);
		}else {
			System.out.println("연산자오류");
		}
		*/
		
	}

}
