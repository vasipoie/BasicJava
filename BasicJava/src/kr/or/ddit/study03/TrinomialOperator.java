package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	public static void main(String[] args) {
		// 삼항연산자 : 3개의 피연산자를 필요로 하는 연산
		// 			삼항연산자는 ? 앞의 조건식의 결과에 따라 
		//			콜론 앞뒤의 피연산자가 선택 조건연산식이라고도 함.
		/*
		 * 	조건식 ? 값 또는 연산식 : 값 또는 연산식
		 * 		|		 |			 	 |
		 * 		|--ture--|			 	 |
		 * 		|		 				 |
		 * 		|___________________false|
		 */
		

		//age 값을 스캐너를 통해서 입력 받을 것
		//18보다 크거나 같을 경우 성년을 출력
		//거짓일 경우 미성년을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String message = (age >= 18) ? "성년" : "미성년";
		System.out.println(message);
		
		
		int day = 6;
		String cal = (day >=10) ? 3+5+"" : 6-2+"";
		System.out.println(cal);
		
		
		
		
	}
}
