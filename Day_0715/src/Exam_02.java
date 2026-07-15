import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("10 진수: ");
			int dec = scn.nextInt();
			if(dec==0) {
				System.out.println("프로그램을 종료합니다");
				break;
		}
			System.out.print("변환(2,8,16):");
			int con = scn.nextInt();
			//진법변환
			String str=" ";//변환값
			int imsi= dec;
			while(imsi !=0) {
				//int mok = imsi / con;
				int na = imsi % con;
				switch(na) {
				case 10:
					str= "A" + str;
					break;
				case 11:
					str= "B" + str;
					break;
					case 12:
						str= "C" + str;
						break;
						case 13:
							str= "D" + str;
							break;
							case 14:
								str= "E" + str;
								break;
							 case 15:
								str= "F" + str;
								break;
								default:
									str= na + str;
				}
				//imsi = mok;
				imsi = imsi / con;
			}
			System.out.println("10진수 :"+dec);
			System.out.println(con+"진수 :"+str);
		}
		
		
	}

}
