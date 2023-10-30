package kr.or.ddit.study06.exam2;

public class CircleExample {
	public static void main(String[] args) {
		/*
		 * 원 c1, c2 선업해볼것
		 * c1 = x10 y10 r10
		 * c2 = x20 y20 r10
		 */
		
		Circle c1 = new Circle(10, 10, 10);
		Circle c2 = new Circle(20, 20, 10);
		
		/*
		 * 원의 넓이 필드 추가하고 구할 것
		 * 3.14*반지름*반지름
		 */
		System.out.println(c1);
		System.out.println(c2);
		
		/*
		 * 원의 둘레 구해볼 것
		 * 3.14*2*반지름
		 */
		
		double round1 = c1.r*2*3.14;
		double round2 = c2.r*2*3.14;
		System.out.println(round1);
		System.out.println(round2);
	}
}
