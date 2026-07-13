//키보드 10잔수, 변환할 진수(2,8,16)

import java.util.Scanner;

public class Exam_19 {
 
	public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("10진수:");
    int dec= scn.nextInt();
    System.out.print("변환 할 진수:");
    int con = scn.nextInt();
    
		int imsi= dec;
		String str="";
		
		while (dec != 0) {
			int na= dec % con;
			switch(na) {
			case 10:
				str = "A" +str;
			case 11:
				str = "B" +str;
				case 12:
					str = "C" +str;
				case 13:
					str = "D" +str;
				case 14:
					str = "E" +str;
				case 15:
					str = "F" +str;
					default:
						str= na + str;
			}
			dec= dec / con;
			}
		System.out.println("10진수:"+imsi);
		System.out.println(con+"진수:"+str);
		
	}

}
