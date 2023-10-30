package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();	//switch문은 if문보다 속도가 빠른편(if문 3-4개)
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}

	private void method5() {
		System.out.println("점수 입력");
		int score = sc.nextInt();
		switch (score/10) {
		case 10: 
			System.out.println("A+ 학점");
			break;
		case 9:
			switch (score%10) {
			case 0: case 1: case 2:
				System.out.println("A- 학점");
				break;
			case 3: case 4: case 5: case 6:
				System.out.println("A0 학점");
				break;
			case 7: case 8: case 9:
				System.out.println("A+ 학점");
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}
	}

	private void method4() {
		System.out.println("국가명 입력");
		String nation = sc.nextLine();

		switch (nation) {
		case "korea": // switch()에 들어간 변수 타입과 같은걸로
			System.out.println("한국 입니다.");
			break;
		case "japan":
			System.out.println("일본 입니다.");
			break;
		case "china":
			System.out.println("중국 입니다.");
			break;

		default:
			System.out.println("잘못 입력되었습니다.");
			break;
		}
	}

	private void method3() {
		// 끝자리 31일인 달
		// 끝자리 30일인 달
		// 끝자리 28, 29일인 달
		System.out.println("월을 입력");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일로 끝납니다.");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일로 끝납니다.");
			break;

		case 2:
			System.out.println("28일, 29일로 끝납니다.");
			break;

		default:
			System.out.println("잘못 입력되었습니다.");
			break;
		}

	}

	private void method2() {
		System.out.println("회원 등급을 입력하세요 1~3");
		int grade = sc.nextInt();

		switch (grade) {
		case 1: // grade 값 = 1
			System.out.println("VIP");
			break;
		case 2:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("일반");
			break;
		default:
			System.out.println("잘못 입력됨");
			break;
		}

	}

	private void method1() {
		/*
		 * switch 문 변수가 어떤 값을 갖는가에 따라 실행문 선택 if문보다 코드가 간결함.
		 * 
		 * switch(변수){ case 값1 : //값1=조건 break; //중단 case 값2 : break; default:
		 * 
		 * }
		 */

	}
}
