package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}

	private void method7() {
		//scanner를 통해 문자를 입력받고 입력받은 문자부터 z까지 출력
		System.out.print("문자를 입력해주세요 ");
		String s = sc.nextLine();
		char c = s.charAt(0);	//string 문자 중 몇번째 글자를 가지고 올건지 정함
								//0 : 첫번째 문자. 1 : 두번째 문자
//		System.out.println("입력 받은 문자는 "+c);
		
		for(; c<='z'; c++) {
			System.out.print(c);
		}
		
	}

	private void method6() {
		//a~z까지 출력
		for(char c='a'; c<='z'; c++) {	//char도 정수형이니까 ++가능
			System.out.println(c);
		}
		
	}

	private void method5() {
		//1~100까지 홀수의 합을 구하시오
		//1~100까지 짝수의 합을 구하시오
		
		//홀수
		int sumOdd = 0;
		//짝수
		int sumEven = 0;
		//for문 하나만 사용할 것
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.printf("1~100까지 홀수의 합은 %d\n", sumOdd);
		System.out.printf("1~100까지 짝수의 합은 %d", sumEven);
		
	}

	private void method4() {
		// 1~10까지 홀수의 합을 구하시오
//		int sum=0;
//		1,3,5,7,9 i 실행됨
//		for(int i=1; i<11; i=i+2) {
//			sum+=i;
//		}
//		System.out.println("1~10까지 홀수의 합 : " + sum);
//		
//		sum=0;
//		for(int i=2; i<11; i=i+2) {
//			sum+=i;
//		}
//		System.out.println("1~10까지 짝수의 합 : "+sum);

//		1,2,3,4,5,6,7,8,9,10 i 실행되며
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			//i 값이 홀수일때만 더해짐
			if (i % 2 == 1) {
				sum +=i;
			}
		}
		System.out.println("1~10까지 홀수의 합 : " + sum);

	}

	private void method3() {
		int sum = 0;
		for (int i = 10; i < 21; i++) {
			System.out.println("i값은 : " + i);
			System.out.println("sum값은 : " + sum);
			sum += i;
			System.out.println();
			System.out.println("sum값은 : " + sum);
			System.out.println("i값은 : " + i);
			System.out.println("-----------");
		}
		System.out.println("결과 값은 : " + sum);

	}

	private void method2() {
		// 1~10까지의 합을 구하시오
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			System.out.println(sum += i);
		}
		System.out.println("결과 값은 : " + sum);
	}

	private void method1() {
		/*
		 * 반복문 for, while문
		 * 
		 * int i=0 <-초기화식 i < 10 <-조건식(종료 조건) i++ <-증감식(반복시 실행)
		 * 
		 * for(int i=0; i<10; i++) {
		 * 
		 * }
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("for 문 안입니다.");
			System.out.println(i);
		}
		System.out.println("for 문 밖입니다.");
	}
}
