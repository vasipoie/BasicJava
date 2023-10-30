package kr.or.ddit.study04.homework;

import java.util.Scanner;

public class Homework3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework3 obj = new Homework3();
		obj.method1();
	}

	private void method1() {
		//가위 바위 보 게임
		//com : 1.가위	2.바위	3.보
		//user: 2o 3x 	3o 1x	1o 2x
		//u-c : 1  2	1  -1	-2  -1
		// 스캐너를 통해 숫자를 입력 받고 승패 결과 출력 할 것.
		// 비기기 포함
		// 결과값 -1은 졌다, 0은 비겼다, 1은 이겼다
		
//		int res = 0;
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("1:가위, 2:바위, 3:보  중 숫자를 입력해주세요");
		int user = sc.nextInt();
		System.out.println("컴퓨터가 낸 것은 : "+com);
		
		int res = user-com;
		
		if(res==1 || res==-2) {
			System.out.println("이겼습니다.");
		}else if(res==0) {
			System.out.println("비겼습니다.");			
		}else  
			System.out.println("졌습니다.");
		
		
	}
	
	private void method2() {
//		if(com==1) {
//		if(user==com) {
//			System.out.println("비겼습니다.");
//		}else if(user==2) {
//			System.out.println("이겼습니다.");
//		}else
//			System.out.println("졌습니다.");
//	}else if(com==2) {
//		if(user==com) {
//			System.out.println("비겼습니다.");
//		}else if(user==3) {
//			System.out.println("이겼습니다.");
//		}else
//			System.out.println("졌습니다.");
//	}else if(com==3) {
//		if(user==com) {
//			System.out.println("비겼습니다.");
//		}else if(user==1) {
//			System.out.println("이겼습니다.");
//		}else
//			System.out.println("졌습니다.");
//	}
	}
	
	
}
