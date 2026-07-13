import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num;
		
		System.out.print("입력하시오");
		num= scn.nextInt();
		
		System.out.println("10진수:"+num);
		
		if(num<1|| num>15) {
			System.out.println("입력오류");
			System.exit(1);
		}else {
			System.out.print("16진수:");
			
			switch (num) {
			case 10:
				System.out.println("A");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("C");
				break;
			case 13:
				System.out.println("D");
				break;
			case 14:
				System.out.println("E");
				break;
			case 15:
				System.out.println("F");
				break;
			default:
				System.out.println(num);
			}
		}
		scn.close();
		
		
		
	}

}
