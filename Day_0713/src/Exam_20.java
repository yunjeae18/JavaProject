//키보드로 7개의 점수를 입력 최대,최소,합계
//출력하는 프로그램 작성
//입력; 9 5 8 6 3 7 6 
//최대: 9
//최소: 3
//합계(합계-최대-최소) : (44-9-3) :32
//for(), while()

import java.util.Scanner;
public class Exam_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하시오:");
		
		int score= scn.nextInt();
		int max= score;
		int min= score;
		int sum= score;
		
		int cnt=1;
		while(cnt<7) {
			score= scn.nextInt();
			if(max < score)
				max=score;
			if(min> score)
				min=score;
			sum+= score;
			cnt++;
		
		}
		System.out.println("최대:"+max);
		System.out.println("최소:"+min);
		System.out.println("합계:"+(sum-max-min));
				
	}
}
