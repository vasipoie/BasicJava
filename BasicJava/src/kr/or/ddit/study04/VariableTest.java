package kr.or.ddit.study04;

import java.util.Scanner;

public class VariableTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		VariableTest obj = new VariableTest();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();		
//		obj.method6();
	}
	
	private void method1() {
		// 8가지 기본타입을 각각 선언해보고 값을 저장할 것
		// System.out.println 을 이용해서 출력까지 해보자.
		
		char a = 'A';	//작은따옴표로 1글자 입력 가능
		
		byte b = 127;	//bite = 8bit 프로그램 기본단위로 많이 사용 -128~127
		short s = 32767;
		int i = 12345;
		long l = 1234567891L;
		
		float f = 0.1f;	//지수에 따라 소수점 뒤에가 다름
		double d = 0.1;
		if(f==d) {
			System.out.println("같음");
		}else
			System.out.println("다름");
		
		boolean h = true;
		
		
	}
	
	
	private void method2() {
		/*
		 * 각 데이터를 형변환하고 출력하시오.
		 */
		// char -> int
		char c1 = 'a';
		int i1 = c1;	//작은거->큰거는 자동 형변환
		System.out.println("i1 = "+i1);
		
		//int -> char
		int i2 = 65; ;
		char c2 = (char) i2;
		System.out.println("c2 = "+c2);
		
		//int -> double
		//int 값 변수 a,b를 나누기 연산 후 double로 저장
		System.out.print("a값을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하시오 : ");
		int b = sc.nextInt();
		double d = (double)a/b;	//작->크 이지만 정수형, 실수형 다르니까 a를 실수형으로 바꿔줌
		System.out.println("d값은 : "+d);
		
		//char -> String
		//c3_1 + c3_2 값을 문자열에 저장
		char c3_1 = 'a';
		char c3_2 = 'b';
		String s3 = ""+c3_1+c3_2;	//""는 문자열. 문자열+문자+문자=문자열
		System.out.println("s3값은 : "+s3);
		
	}

	
	private void method3() {
		// Math.random은 double값으로 범위는  0~0.999999999999 이다.
		//(int)(Math.random()*10)+1
		// *10은 범위 값 / +1은 시작 값
		
//		int ran = (int)(Math.random()*100)+1;
//		System.out.println(ran);
		
		
		/*
		 * 양꼬치는 1인분에 12000원, 음료수는 2000원
		 * 양꼬치 n개와 음료수 k개를 먹었다면 총 얼마를 지불해야 하는지 출력해보세요.
		 * n값은 1~10
		 * k값은 1~3
		 */
	
		int n = (int)(Math.random()*10)+1 ;
		int k = (int)(Math.random()*3)+1;
		System.out.println("양꼬치 개수는 : "+n+"개");
		System.out.println("음료수 개수는 : "+k+"개");
		
		//결과값 저장 할 곳	
		int result = n*12000 + k*2000;
		System.out.println("총 지불해야하는 금액은 : "+result+"원");
	}


	private void method4() {
		/*
		 * 정수 num1, num2 랜덤한 변수(1~50)로 주어질 때
		 * num1을 num2로 나눈 나머지와 몫을 출력하세요.
		 */
		
		int num1 = (int)(Math.random()*50)+1;
		int num2 = (int)(Math.random()*50)+1;
		
		int result_m = num1/num2;
		System.out.println("num1 값은 : "+num1);
		System.out.println("num2 값은 : "+num2);
		int result_n = num1%num2;
		System.out.println("num1 값은 : "+num1);
		System.out.println("num2 값은 : "+num2);
		System.out.println("몫은 : "+result_m+", 나머지는 : "+result_n);
	}
	
	private void method5() {
		/*
		 * 정수 num1, num2 랜덤한 변수(1~50)로 주어질 때
		 * num1을 num2로 나눈 값에 1000을 곱한 후 
		 * 정수 부분을 출력하세요.
		 */
		
		int num1 = 20; //(int)(Math.random()*50+1);
		int num2 = 14; //(int)(Math.random()*50+1);
		System.out.println("num1 값은 "+num1);
		System.out.println("num2 값은 "+num2);
		
//		int result = num1*1000/num2;	// != num1/num2*1000
		// 소수점 3자리까지만 출력하도록 해볼 것
		int result_int = num1*1000/num2; //1428
//		double result = num1*1000/num2/(double)1000;
		double result = result_int/1000.0;
		System.out.println("결과는 "+result);
		
	}
	
	
	private void method6() {
		/*
		 * 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 출력합니다.
		 * 예를 들면 다음과 같습니다.
		 * a = 12, b = 3
		 * 12 ☆ 3 = 123
		 * 3 ☆ 12 = 312
		 * 
		 * 양의 정수 a와 b가 주어졌을 때
		 * a☆ b와 b☆ a 값 중 더 큰 값을 출력하세요 
		 */
				
		int a  = (int)(Math.random()*100)+1;
		int b  = (int)(Math.random()*100)+1;
		System.out.printf("a값은 %d, b값은 %d\n", a, b);
		
		String ab = ""+a+b;
//		String ab = String.valueOf(a)+String.valueOf(b);
		String ba = ""+b+a;
		
		int ab_int = Integer.parseInt(ab);	//String->int
		int ba_int = Integer.parseInt(ba);
		
		if(ab_int>ba_int) {
			System.out.println(ab_int);
		}else
			System.out.println(ba_int);
	}


}
