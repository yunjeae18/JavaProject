import java.util.Scanner;
public class Exam_03 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 String name;
 int kor, eng, mat;
 int tot;
 double ave;
 String result;
 
 System.out.print("입력하시오 : ");
 name = sc.next();
 kor = sc.nextInt();
 eng = sc.nextInt();
 mat = sc.nextInt();
 
 //총점 평균
 tot= kor+eng+mat;
 ave= tot/3.;
 String etc="";
 
 if(ave>=80 && kor>=60 && eng>=60 && mat>=60) {
	 result= "합격";
 }else {
	 result="불합격";
	 if(kor <40|| eng<40 || mat <40) {
	 etc= "과락";
 }else {
	 etc = "평균미만";
 }
 }
 
 
 if(result.equals("합격")) {
	 System.out.println("이름\t총점\t평균\t판정");
	 System.out.println(name+"\t"+tot+"\t"+ave+"\t"+result);
 }else {
	 System.out.println("이름\t총점\t평균\t판정\t불합격사유");
     System.out.println(name+"\t"+tot+"\t"+ave+"\t"+result+"\t"+etc);
 
	}

	}
}
/* System.out.println("이름:" + name);
* System.out.println("총점:" + tot);
* System.out.println("평균:" + ave);
* System.out.println("판정:" + result);

 * 
 * 
 * 
 * 
