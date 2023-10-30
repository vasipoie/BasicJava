package kr.or.ddit.study10;

public class ExceptionExample01re {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		ExceptionExample01re ee = new ExceptionExample01re();
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
