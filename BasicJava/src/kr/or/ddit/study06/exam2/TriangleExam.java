package kr.or.ddit.study06.exam2;

public class TriangleExam {
	public static void main(String[] args) {
		/*
		 * 삼각형 t1, t2 선언해볼것
		 */
		
		Triangle t1 = new Triangle(0, 0, 5, 2, 2, 8);
		System.out.println(t1);
		
		/*
		 * t2 point 객체를 이용해서 만들어볼것
		 */
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		Point p3 = new Point(50, 50);
		
		
		Triangle t2 = new Triangle(p1, p2, p3);
		System.out.println(t2);
	}
}
