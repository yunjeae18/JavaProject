
public class Exam_27 {

	public static void main(String[] args) {
		int cnt=0;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
		}
		cnt=0;
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
	}
	}
}
