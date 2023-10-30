package kr.or.ddit.study06.exam5;

public class StaticMain {
	public static void main(String[] args) {
		int a = StaticTest.a;
		StaticTest.method2();
		
		//static이 아니면 new객체 생성 후에 사용가능
		StaticTest st = new StaticTest();
		int b = st.b;
		st.method1();
		
		//메모리 관리면에서 static는 계속 메모리를 잡고있음
		//static를 계속 다른 클래스에서 부르면 값이 변함
		
		
	}
}
