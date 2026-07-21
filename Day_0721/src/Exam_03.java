//키보드로 학번 이름 국어 영어 수학 입력
/* 학생체계(Student)생성후 출력
 * 
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {
     //키보드 입력
		int hakbun= 1101;
		String name="김학생";
		int kor=95;
		int eng=90;
		int mat=88;
		
		//기본 생성자 이용시
		Student st1 = new Student();
		st1.hakbun=hakbun;
		
		st1.totAve();
		//초기화 생성자이용시
		Student st2= new Student(hakbun,name,kor,eng,mat);
		st2.totAve();
		
		//총점, 평균을 구하여 다음과 같이 출력
		//학번 이름 국어 영어 수학 총점 평균
		System.out.println("\t\t\t\t\t\t\t");
		System.out.print(st1.Hakbun + "\t");
		
		System.out.print(st1.ave+"\n");
		//학점을 구하려 출력(A,B,C,D,F)
		//학번 이름 국어 영어 수학 총점 평균
  
		String grade = st1.studentGrade();
		System.out.print("\t\t\t\t\t\t\t");
		System.out.print(st1.hakbun+"\t");
		
		System.out.print(st1.grade+"\n");
 
	}

}
