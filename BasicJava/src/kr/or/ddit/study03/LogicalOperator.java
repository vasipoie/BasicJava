package kr.or.ddit.study03;

import java.util.Scanner;

public class LogicalOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LogicalOperator obj = new LogicalOperator();
//		obj.test();
		obj.test2();
	}

	private void test() {
		// 논리연산자
		// 			&(and)		   or 		 ^(xor) 	 ~(not)
		// 45 : 00101101		00101101	00011001	00101101
		// 25 : 00011001		00011001	00011001	
		//		00001001 => 9	00111101	00110100	11010010
	
		int a = 45;
		int b = 25;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
	
	
	
	
	}
	
	private void test2() {
		// shift operator
		// >> << >>>
		// 숫자 >> 정수 => 숫자를 정수만큼 오른쪽으로 평행이동
		// => 숫자를 2^(정수로 ) 나눔 몫이됨
		
		System.out.println(12>>2);	//12를 2의 n승만큼 나눈다
		System.out.println(12<<2);	//12에 2의 n승만큼 곱한다
		
		//12 = 1100 (2진법)
		//12>>2 = 11 (2진법) = 3(10진법)
		//12<<2 = 110000 
		
	}
	
}
