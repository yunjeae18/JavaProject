
public class Exam_07 {
//1: 반환타입x 매개변수x
	static void method_1() {
		
	}
	// 2. 반환타입x 매개변수o
	static void method_2(int a, int b) {
		
	}
	// 3. 반환타입o 매개변수x
	static int method_3() {
		return 1;
	}
	// 4. 반환타입o 매개변수o
	static int method_4(int[]a) {
		return 1;
	}
	public static void main(String[] args) {
//메소드 호출
		method_1();
		
		//2.
		method_2(100,2);
		
		//3.
		int s= method_3();
		
		//4.
		int ss[]= {1,2,3,4};
		int k= method_4(ss);
		
		
		
		

		
	}

}
