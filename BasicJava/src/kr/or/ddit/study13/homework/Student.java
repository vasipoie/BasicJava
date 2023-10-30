package kr.or.ddit.study13.homework;

public class Student {
	String major;
	int studentId;
	
	@Override
	public String toString() {
		return "Student [major=" + major + ", studentId=" + studentId + "]";
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.major = "수의학과";
		stu.studentId = 2016037111;
		System.out.println(stu);
	}

	
}
