package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}

	private void method4() {
		int i=0;
		do {
			i++;
			System.out.println("실행1 : "+i);
			
			if(i==1) {
				continue;
			}
			System.out.println("실행2 : "+i);
		}while(i<3);
		
	}

	private void method3() {	//언제까지 반복될지 모를때 사용
		int overflow = 2147483000;
		while (true) {
			overflow++;
			System.out.println(overflow);
			if(overflow<0) {	//int값 범위 밖으로 넘어갈 때
				System.out.println(overflow);
				System.out.println("오버플로우 발생");
				break;
			}
		}
		
	}

	private void method2() {
		String menu = 
				"***커피 메뉴***\n"
			+	"1. 아메리카노\t1000원\n"
			+	"2. 카페라떼\t1500원\n"
			+	"3. 자바칩 프라프치노\t2000원\n"
			+	"4. 카라멜 마키아또\t2500원\n"
			+	"5. 프로그램 종료";
		
		int sum = 0;
		String bill = "***영수증***\n";
		
		while (true) {
			System.out.println(menu);
			System.out.println();
			System.out.println("메뉴를 선택해주세요.");
			int select = sc.nextInt();
			int exit=0;
			switch (select) {
				case 1:
					sum+=1000;
					bill+="아메리카노\n";
					System.out.println("아메리카노");
					break;
				case 2:
					sum+=1500;
					bill+="카페라떼\n";
					System.out.println("카페라떼");
					break;
				case 3:
					sum+=2000;
					bill+="자바칩 프라프치노\n";
					System.out.println("자바칩 프라프치노");
					break;
				case 4:
					sum+=2500;
					bill+="카라멜 마키아또\n";
					System.out.println("카라멜 마키아또");
					break;
				case 5:
//					System.out.println("프로그램 종료");
					exit = -1;
					break;
				default:
					System.out.println("잘못 입력됐습니다.");
					break;
			}
			if(exit==-1) break;
			System.out.println();
		}
		System.out.println();
		System.out.println("총 금액은 "+sum+"원\n");
		System.out.println(bill);
	}

	private void method1() {
		/*
		 * while 반복문 무한루프 등을 사용할 때 주로 사용
		 * 			    끝나는 지점을 알 수 없을 때

		조전식
		while(true) {
			실행문
		}
		 */
		
		int num =0;
		while(num<10) {
			System.out.println(++num + "번 실행됨");
		}
		
	}
}
