import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력");
		int value = scn.nextInt();
		
		String str="";
		if(value>=80) {
			str="pass";
		}else {
			str="no";
		}
		System.out.println(value+"="+str);
	}

}
