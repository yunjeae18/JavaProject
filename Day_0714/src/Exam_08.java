//배열 선언과 동시에 원하는 값으로 초기화
import java.util.Arrays;

public class Exam_08 {

	public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    int arr2[] = new int[5];//자동초기화(0)
		
		//배열 요소수
    int cnt= arr.length;//16
    System.out.println("arr 배열 요소수:" +cnt);
    System.out.println("arr 배열 요소수:" +arr.length);

    //배열 요소 확인

System.out.println(Arrays.toString(arr));
    arr[1] = 100;
    System.out.print(Arrays.toString(arr));
		
    int sum=0;
    for(int i=0; i<arr.length; i++) {
    	sum += arr[i];
    }
    System.out.println("arr 배열 요소 합: "+sum);
	}

}
