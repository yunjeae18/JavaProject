//재귀(recursion)함수 자기가 자기를 호출
public class Exam_15 {
    static void test(int n) {
    	if(n==0)
    		return;
    	System.out.println("hello world");
    	test(n-1);
    }
	public static void main(String[] args) {
   
	test(5);
	
	
	}

}
