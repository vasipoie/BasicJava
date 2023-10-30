package kr.or.ddit.study06.exam4;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println("메인 메소드");
		System.out.println("--------------");
		
		MethodTest mt = new MethodTest();
		double return3 = mt.method3();
		System.out.println("--------------");
		
		mt.method1();
		System.out.println("--------------");
		
		int return2 = mt.method2();
		System.out.println("--------------");
		
		System.out.println("method3 리턴값 : "+return3);
		System.out.println("method2 리턴값 : "+return2);
	}
	
	public void method1() {
		System.out.println("public void method1 ");
		System.out.println("리턴 값 없어요");	//void일 떄는 리턴 값 없음. void:아무것도 하지 않는다
	}
	
	public int method2() {
		System.out.println("public int method2 ");
		System.out.println("리턴 값 int");
		return 10;
	}
	
	public double method3() {
		System.out.println("public double method3");
		System.out.println("리턴 값 double");
		return method2()*3;//method2 호출
	}
}
