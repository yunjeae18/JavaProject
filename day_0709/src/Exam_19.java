/*키보드로 이름, 국어, 영어, 수학 점수를 입력 총점,평균,판정을 구하여 출력

1. 입력은 한줄로 입력
   입력: 이학생 90 90 90
2. 평균은 소수이하 3째자리에서 반올림
3. 판정은 3과목 모두 60점이상, 평균이 80점 이상 "합격' 아니면 '불합격"
4. 불합격 사유 출력
   - 한과목이라도 60미만이면 "과락"
   - 3과목 모두 60이상이나 평균이 80미만이면 "평균 미만"
5. 출력은 다음과 같이 한다(예시)
   이름    총점  평균    판정   불합격사유
   이학생  265  87.56   합격
   
   이름    총점  평균    판정   불합격사유
   이학생  265  87.56   불합격   "과락"
   */
import java.util.Scanner;
public class Exam_19 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 String name;
 int kor, eng, mat;
 int tot;
 double ave;
 String result;
 
 System.out.print("입력 : ");
 name = sc.next();
 kor = sc.nextInt();
 eng = sc.nextInt();
 mat = sc.nextInt();
 
 tot= kor+eng+mat;
 ave= tot/3.;
 String etc="";
 
 if(ave>=80 && kor>=60 && eng>=60 && mat>=60) {
	 result= "합격";
 }else {
	 result="불합격";
	 if(kor <60|| eng<60 || mat <60) {
	 etc= "과락";
 }else {
	 etc = "평균미만";
 }
 }
 
 
 System.out.println("이름\t총점\t평균\t판정\t불합격사유");
 System.out.println(name+"\t"+tot+"\t"+ave+"\t"+result+"\t"+etc);
 
	}

}
