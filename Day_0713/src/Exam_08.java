//화폐단위별로 매수 출력
//50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
//17684=> 
//176874/50000 => 3 => 26874
public class Exam_08 {

	public static void main(String[] args) {
    int pay= 176874;
    int money= 50000;
    
    for(int i=1; i<=10; i++) {
    	System.out.print(money+"원:");
    	int mok = pay / money;
    	System.out.println(mok);
    	pay = pay % money;
    	if(i%2==1) {
    	money /= 5;
    	}else {
    	money /= 2;
    }
    
    /*int mok= pay / 50000;
    int na= pay % 50000;
    
   
    System.out.println("50000원:"+mok);
    mok = na / 10000;
	int na2 = na % 10000;
	System.out.println("10000원:"+mok);
	
	*/	
		
		
	}
	}
}
