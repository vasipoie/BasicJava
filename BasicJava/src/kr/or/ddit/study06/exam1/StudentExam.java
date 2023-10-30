package kr.or.ddit.study06.exam1;

public class StudentExam {
	int a = 10;	//13줄이 없으면 객체생성 안된거
	static int b = 17;	//전역변수:객체를 생성하지 않아도 불러올 수 있음
	public static void main(String[] args) {
		Student s1 = new Student();	//s1객체 만들어짐
		s1.major = "학과1";
		s1.name = "김나혜";
		s1.age = 26;
		System.out.println(s1);
		
		StudentExam obj = new StudentExam();
		System.out.println(obj.a);
		
		System.out.println(b);	//static은 static를 불러올 수 있음
	}
}
