package kr.or.ddit.study06.exam2;

public class RectangleExam {
	public static void main(String[] args) {
		/*
		 * 사각형1, 사각형2 선언 및 호출하기
		 */
//		Rectangle rec = new Rectangle();
//		rec.x = 3;
//		rec.y = 4;
//		rec.height = 5;
//		rec.width = 6;
		
		Rectangle r1 = new Rectangle(0, 0, 10, 10);
		Rectangle r2 = new Rectangle(10, 0, 10, 10);
		
//		System.out.println("사각형1 : "+);
//		System.out.println("사각형2 : "+);
		
		/*
		 * 넓이 구하기
		 * 가로*세로
		 */
		
//		int r1Width = r1.width;
//		int r1Height = r1.height;
//		System.out.println(r1Width+","+r1Height);
//		int r1Area = r1Width*r1Height;
//		r1.area = r1Area;
//		System.out.println(r1Area);
//		
//		r1.area = r1.height*r1.width;
//		System.out.println("r1 넓이 : "+r1.area);
		
		System.out.println(r1);
		
//		r2.area = r2.height*r2.width;
//		System.out.println("r2 넓이 : "+r2.area);
		System.out.println(r2);
	}
}
