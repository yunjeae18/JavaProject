//키보드 입력 (Scanner 클래스)
/*객체 생성
 * Scanner 변수명= new Scanner(System.in)
 * 메소드 next() ->문자열 입력
 *      nextInt() - 정수입력. nextBoolean()
 *      nextDouble(), nextLine()-한줄 전체
 *      xxx( nextChar())
 * 
 * 
 */
import java.util.Scanner;
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		//키보드로 이름, 국어, 영어, 수학 점수를 입력
		//총점, 평균(실수로 계산)을 구하여 출력
		//한줄에서 모두 입력시
		System.out.print("학생 입력: ");
		String na= scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();

		int tot = kor+eng+mat;
		double ave= tot/ 3.;
		
		System.out.println("이름: "+na);
		System.out.println("총점: "+tot);
		System.out.println("평균: "+ave);

		
		
		
		
		
		
 
	}

}
