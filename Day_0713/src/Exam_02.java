import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num;
		
		System.out.print("입력하시오");
		num= scn.nextInt();
		
		System.out.println("10진수:"+num);
		
		if(num<1|| num>15) {
			System.out.println("입력오류");
			System.exit(1);
		}
		int mok = num;
		int na = num % 16;
		
		String con= "";
			
			switch (na) {
			case 10:
				con="A";
				break;
			case 11:
				con="B";
				break;
			case 12:
				con="C";
				break;
			case 13:
				con="D";
				break;
			case 14:
				con="E";
				break;
			case 15:
				con="F";
				break;
			default:
				con=na +"";
			}
		}		
	
		System.out.println("10진수:" +num);
		System.out.println("16진수:"+ con);
		
	}

