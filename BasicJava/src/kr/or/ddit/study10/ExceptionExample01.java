package kr.or.ddit.study10;

public class ExceptionExample01 {
	public static void main(String[] args) {
		ExceptionExample01 ee = new ExceptionExample01();
		ee.devide(10, 3);
		ee.devide(3, 0);
	}
	
	public double devide(int a, int b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return b;
		}
		return a/b;
	}
}
