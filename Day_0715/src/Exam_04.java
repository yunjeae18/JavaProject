import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {
    int score[]= {90, 60, 80, 70, 55,88,77,65};

    //배열 데이터 확인
    System.out.print("data 확인: "+Arrays.toString(score));
    
    //배열 데이터 출력
    System.out.print("data:");
    for(int i=0; i<score.length; i++) {
    	System.out.print(score[i]+" ");
    }
    System.out.print("\n");
    
    //배열 데이터 출력 확장for
    System.out.print("data:");
    for(int data: score) {
    	System.out.print(data + " ");
    }
    System.out.print("\n");
    
    //합계 평균 최대 최소
    //int sum=0, max=0, min=0;
    int sum= score[0], max=score[0], min=score[0];
    for(int i=1; i<score.length; i++) {
    	//합계
    	sum+=score[i];
    	//최대값
    	if(max<score[i])
    		max=score[i];
    	//최소
    	if(min> score[i])
    		min=score[i];
    }
     System.out.println("힙계:" +sum);
     System.out.println("평균:" +((double)sum/score.length));
     System.out.println("최대:" +max);
     System.out.println("최소:" +min);
    
     //정렬
     
     int scoreCp[] = score.clone();
     for(int i=0; i<scoreCp.length-1; i++) {
    	 for(int j= i+1; j<scoreCp.length; j++) {
    		 if(scoreCp[i]> scoreCp[j]) {
    			 int imsi= scoreCp[i];
    			 scoreCp[i]= scoreCp[j];
    			 scoreCp[j]=imsi;
    		 }
    	 }
     }
     System.out.println("정열 전: "+ Arrays.toString(score));
     System.out.println("정열 후: "+ Arrays.toString(scoreCp));
     
 }
}








