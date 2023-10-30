package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample2 obj = new ForExample2();
//		obj.method1();
		obj.method2();
//		obj.method3();
//		obj.method4();
	}

	private void method4() {
		int sum=0;
		/*
		 * for(int i=1; i<=10; i++) {
		 *  sum+=i;
		 * }
		 */
		
		for(int i=1; i<=10; i++) sum+=i;	//1줄일 경우 같은 줄에 써도 동작됨
		System.out.println(sum);
	}

	private void method3() {
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;	//짝수는 출력안함
			}
			System.out.println("홀수만 출력 : "+i);
		}
	}

	private void method2() {
		//구구단 출력
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
	}

	private void method1() {
		//영어에 포함된 모음의 수를 구하시오
		//a e i o u
		System.out.println("영어 문장을 입력하세요");
		String s = sc.nextLine();
		//문자열 길이
		int length = s.length();	//.length = .앞에 변수의 길이를 나타냄
		int cnt=0;
		
		for(int i=0; i<length; i++) {
//			System.out.println(s.charAt(i));
			char c = s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u') {
				cnt++;
			}
		}
		
		System.out.println("입력한 문자에 포함된 총 모음의 수는 : "+cnt);
	}
}
