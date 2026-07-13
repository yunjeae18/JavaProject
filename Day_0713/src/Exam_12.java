
public class Exam_12 {

	public static void main(String[] args) {
    //1~10 정수 출력 후 합계
	// 1 2 3 4 10=55
	// 1. for()	
		int sum=0;
		for(int i=1; i<=10; i++) {
			System.out.printf("%3d", i);
			sum+=i;
		}
		System.out.printf(" = %3d\n", sum);
		
	}
//while()
	int i=1;
	int tot=0;
	while(i<10) {
		i++;
		System.out.printf("%3d", i);
		tot += i;
	}
	System.out.printf("= %3d\n", tot);
	
}
}
