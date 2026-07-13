//행열
public class Exam_22 {

	public static void main(String[] args) {
//5*4 행열
		for(int i=1; i<=5; i++) {
			System.out.print(i+":");
			for(int j=1; j<=5; j++) {
				System.out.print("*"+j);
			}
			System.out.print("\n");
		}
		System.out.println("------------------");
		for(int j=1; j<=5; j++) {
			System.out.print("*");
		}
		System.out.print("\n");		
	}

}

