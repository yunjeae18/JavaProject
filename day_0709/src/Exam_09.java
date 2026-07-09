
public class Exam_09 {

	public static void main(String[] args) {
    double tmp= 365.2422;
    int day = 0, hour= 0, min=0, sec= 0;
    System.out.printf("1년은 %.4f일이다.\n",tmp);
		
    //(int)tmp=365를 대입
    day=(int)tmp;
    tmp-=day;
    hour=(int)(tmp*24);
    
    tmp=(tmp*24)-hour;
    min=(int)(tmp*60);
    
    tmp=(tmp*60)-min;
    sec=(int)(tmp*60);
    
    System.out.printf("%d일%d시%d분%d초\n",day,hour,min,sec);
		
		
		
		
		
		
		
		
	}

}
