package kr.or.ddit.study10;

public class ExceptionExample01re {
	public static void main(String[] args) {
		ExceptionExample01re ee = new ExceptionExample01re();
		
		try {
			double de1 = ee.devide(3, 0);
			System.out.println(de1);
			double de2 = ee.devide(10, 3);
			System.out.println(de2);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		try {
			double de2 = ee.devide(10, 3);
			System.out.println(de2);
			double de1 = ee.devide(3, 0);
			System.out.println(de1);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
	}
	
	public double devide(int a, int b) {
//		if(b==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			return b;
//		}
		return a/b;
	}
}
