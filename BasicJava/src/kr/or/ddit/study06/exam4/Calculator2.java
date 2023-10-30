package kr.or.ddit.study06.exam4;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자열 입력 받았을 때 계산 해보기
		// 12*3+4-7
		// 임의의 문자를 입력 받았을 때 결과값 출력해보기
		Calculator2 obj = new Calculator2();
		String s = "12*3+4-7";//=33
//		double result = 0;
		obj.character(s);
//		System.out.println();
		
		// 문자 숫자 나누기
		// 연산 우선 순위 먼저 계산
//		char[] ch = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if(ch == '+') {
//				
//			}
//			
//			else {
//				System.out.println("숫자");
//			}
//		}
	}
		
	
	public double character(String s) {
//		System.out.println("계산하고 싶은 문자열을 입력하세요");
//		String s = sc.nextLine();
		double result = 0;
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
//		for (int i = 0; i < ch.length; i++) {
//			boolean number = true;	//숫자
//			if(ch[i]>=48 && ch[i]<=57) {
//				continue;
//			}else {
//				number = false;
//				break;
//			}
//			System.out.println(ch[0].index.size);
			
		return result;
		
	}

}
