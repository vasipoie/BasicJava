package kr.or.ddit.study02;

public class ExamVariable {
	public static int a = 4;      //전역변수
	public static void main(String[] args) {
//		int x, y, z;
//		x=5;
//		y=2;
//		z=4;
		
		int x=3;                  //지역변수
		int y=2;
		int z=x+y;
		
		System.out.println("x+y의 결과값은 "+z);
		
		System.out.println("a 값은 : "+ a + " 입니다.");
	}
	
	public void test() {
		
	}
}
