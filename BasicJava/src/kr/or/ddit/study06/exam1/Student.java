package kr.or.ddit.study06.exam1;

public class Student {
	// 학과 ->String
	// 학생 이름 ->String
	// 나이 ->int
	
	String major;
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
	
}
