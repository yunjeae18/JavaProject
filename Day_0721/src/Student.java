
public class Student {
int Hakbun;
String name;
int kor;
int eng;
int mat;
int tot;
double ave;

Student(){}

Student (int hakbun, String name, int kor, int eng, int mat){
	this.hakbun=hakbun;
	this.name=name;
	this.kor=kor;
	this.eng=eng;
	this.mat=mat;
	totAve();
}
//총점 평균을 구하는 메소드
 void totAve() {
	 tot= kor+eng+mat;
	 ave= (double)tot/3;
	 
 }
//학점을 구하는 반환하는 메소드
String studentGrade() {
	String grade="F";
	
	return grade;
}
}
