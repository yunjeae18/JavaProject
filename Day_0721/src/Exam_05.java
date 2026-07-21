class SS{
	int a=10;
}
class Sin{
	private Sin() {}
	
	static Sin s = new Sin();
	static Sin getSin() {
		return s;
	}
}
public class Exam_05 {

	public static void main(String[] args) {
    SS s1= new SS();
    SS s2= new SS();
    SS s3= new SS();
    
    System.out.println("s1="+s1);
    System.out.println("s2="+s2);
    System.out.println("s3="+s3);

    Sin sin1= Sin.getSin();
    Sin sin2= Sin.getSin();

	}

}
