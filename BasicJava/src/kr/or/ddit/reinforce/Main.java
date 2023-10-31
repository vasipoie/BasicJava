package kr.or.ddit.reinforce;

public class Main {
	public static void main(String[] args) {
		MemberVo m1 = new MemberVo();	//m1객체 만듦
		m1.id = "test1";				//m1객체에 id랑 name 입력
		m1.name = "테스트 게정1";
		m1.call();						//call()메소드 호출
		System.out.println(m1.call);
		
		MemberVo m2 = new MemberVo();
		m2.call();						//m2객체에는 id, name입력 안함. 아무것도 없는 것
		System.out.println(m2.call);	//static니까 전체가 공유해서 계속 ++되는것
		
		Main obj = new Main();	//객체생성 후
		obj.test();				//호출 가능		->동일한 클래스 내부에서 호출인데? main메소드 안에서 다른 메소드를 호출하는거라서 그런가?
					
		testStatic();			//static는 객체 생성 없어도 호출 가능
	}
	
	public static void testStatic() {
		System.out.println("testStatic");
	}
	
	public void test() {
		System.out.println("test call");
	}
}
