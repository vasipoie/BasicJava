package kr.or.ddit.study06.exam4;

public class Method2 {
	public static void main(String[] args) {
//		Circle c = new Circle();
//		int r = 10;
//		double area = c.getArea(r);
//		double round = c.getRound(r);
//		System.out.println("반지름 "+r+"짜리의 원의 넓이는 "+area);
//		System.out.println("반지름 "+r+"짜리의 원의 둘레는 "+round);
		
//		System.out.println();
//		
//		double r2 = 10.5;
//		double area2 = c.getArea(r2);
//		double round2 = c.getRound(r2);
//		System.out.println("반지름 "+r2+"짜리의 원의 넓이는 "+area2);
//		System.out.println("반지름 "+r2+"짜리의 원의 둘레는 "+round2);
		
		
		Method2 m2 = new Method2();
		m2.recrucive(10);
	}
	//재귀함수
	public void recrucive(int i) {
		if(i==0) {
			System.out.println("종료 되었습니다.");
			return;
		}
		System.out.println(i);
		recrucive(--i);	//i--면 10 들어간 후에 -1이니까 계속 돌아감
	}
}
