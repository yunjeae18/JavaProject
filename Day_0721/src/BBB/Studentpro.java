package BBB;

public class Studentpro {
   private Studentpro() {}
   
   public static Studentpro pro = new Studentpro();
   
   public static Studentpro getInstance() {
	   
	   return pro;
   }
   
   public Student getStudent(int hak,String name,boolean gender,
		   int age, int kor, int eng, int mat) {
	   Student student = new Student(hak,name,gender,age,kor,eng,mat);
	   
	   return student;
   }
   
   public void studentOutput(Student st1) {
	   System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
   }
   }

