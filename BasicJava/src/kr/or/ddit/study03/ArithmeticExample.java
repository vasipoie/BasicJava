package kr.or.ddit.study03;

public class ArithmeticExample {
	public static void main(String[] args) {
//		종류 : +, -, /, * %
//		사칙연산과 마찬가지로 /, * 먼저 적용된다.
		
		int a = 5;
		int b = 3;
		
		System.out.println("덧셈\t" + (a+b));
		System.out.println("뺄셈\t" + (a-b));
		System.out.println("곱셈\t" + (a*b));
		System.out.println("나눗셈\t" + ((double)a/b));
		
		System.out.println("나머지\t" + (a%b));		
		
	}
}
