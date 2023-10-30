package kr.or.ddit.study06.exam1;

public class Class_ {
	// 필드
	String field1;
	int field2;
	
	// static은 클래스에 종속된 변수
	static double field3;
	
	//메인 메소드
	public static void main(String[] args) {
		
	}
	
	//test 메소드
	public void test() {
		
	}
	
	// 기본 생성자:클래스가 만들어질 때 기본 생성자부터 만들어짐
	public Class_() {
		
	}
	
	// 생성자
	public Class_(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
}
