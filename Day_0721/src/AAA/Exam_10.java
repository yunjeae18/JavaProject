package AAA;

public class Exam_10 {

	public static void main(String[] args) {
   Student stu1= new Student();
 
    int hakbun = 1101;
   String name="홍길동";
   boolean gender=true;
   int age=22;
   int kor=90;
   int eng=80;
   int mat=70;
   
   stu1.setHakbun(hakbun);
   stu1.setName(name);
   stu1.setGender(gender);
   stu1.setAge(age);
   stu1.setKor(kor);
   stu1.setEng(eng);
   stu1.setMat(mat);
   
   Student stu2 = new Student(1102,"이사람",false,30,77,88,99);
   
   
   
   int tot = stu1.kor +stu1.eng +stu1.mat;
   double ave = tot/3.;
   
   System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
   System.out.println(
		   stu1.hakbun + "\t"+
				   stu1.name + "\t"+
				   stu1.gender + "\t"+
				   stu1.age + "\t"+
				   stu1.kor + "\t"+
				   stu1.eng + "\t"+
				   stu1.mat + "\t"+
				   tot + "\t"+
				   String.format("%.2f", args)
		   );
	}

}
