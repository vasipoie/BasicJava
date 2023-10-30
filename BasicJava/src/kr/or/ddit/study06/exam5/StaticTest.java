package kr.or.ddit.study06.exam5;

public class StaticTest {
	static int a = 10;	//정적변수
		   int b = 10;	//클래스 생성 필요
	
	public static void main(String[] args) {
		/*
		StaticTest s1 = new StaticTest();	//클래스?
		System.out.println("static int a\t"+a);
		System.out.println("       int b\t"+s1.b);
		
		a = 20;
		s1.b = 15;
		
		System.out.println("변경 후 값");
		System.out.println("static int a\t"+a);
		System.out.println("       int b\t"+s1.b);
		
		StaticTest s2 = new StaticTest();
		System.out.println();
		System.out.println("static int a\t"+a);
		System.out.println("       int b\t"+s2.b);

		StaticTest s3 = new StaticTest();
		System.out.println();
		System.out.println("static int a\t"+a);
		System.out.println("       int b\t"+s3.b);
		*/
		
		//일반 인스턴스 객체 같은 경우 클래스를 만들어 호출
		StaticTest st = new StaticTest();
		st.b = 20;
		st.method1();

		System.out.println();
		//그냥 호출 가능(객체 안만들어도 됨. static니까 static에서 호출 가능)
		method2();
		
		System.out.println();
		StaticTest st2 = new StaticTest();
		st2.method1();
		
	}
	
	
	public void method1() {
		System.out.println("public void method1() 호출");
		System.out.println("static int a\t"+a);
		//객체 만들어졌을때의 b값 호출
		//40줄 객체가 만들어지고 나서 b값은 변화가 없으니까 10
		System.out.println("       int b\t"+b);
	}
	
	public static void method2() {
		System.out.println("public static void method2()");
		System.out.println("static int a\t"+a);
		//b값은 객체가 없어서 못 부른다.
//		System.out.println("       int b\t"+b);
	}
	
}
