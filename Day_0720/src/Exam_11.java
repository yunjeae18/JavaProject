class person{
	int num;
	String name;
	int age;
	
	person(){
		this(9, "DDDD", 30);
	}
	
	
	person(int num, String name, int age){
		this.num= num;
		this.name= name;
		this.age=age;
	}
	void personprint() int 
		System.out.println("번호:"+num);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);

	}
}
public class Exam_11 {

	public static void main(String[] args) {
	
    person p1 = new person(1, "AAAA",20);
    person p2 = new person(2, "BBBB",25);
    person p3 = new person(3, "CCCC",29);
	}

}
