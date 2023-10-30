package kr.or.ddit.study06.exam4;

public class Circle {
	double PI = 3.141592;
	public static void main(String[] args) {
		Circle c = new Circle();
//		double result = 3.14*10*10;
//		double result2 = 3.14*5*5;
		double result = c.getArea(10);
		System.out.println("result 값은 : "+result);
		System.out.println("-----------------");
		double result2 = c.getArea(5);
		System.out.println("result2 값은 : "+result2);
	}
	
	public double getArea(int r) {
		System.out.println("파라미터 int인 getArea");
		return getArea((double)r);
	}
	/*
	 * 오버로딩 : 변수타입, 개수를 다르게 하여 메소드를 호출 할 수 있도록 하는 것
	 */
	public double getArea(double r) {	//파라미터 변화
		System.out.println("파라미터 double인 getArea");
		return PI*r*r;
	}
	
	public double getRound(int r) {
		return PI*r*2;
	}
	
	public double getRound(double r) {
		return PI*r*2;
	}
}
