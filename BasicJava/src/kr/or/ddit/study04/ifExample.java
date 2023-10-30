package kr.or.ddit.study04;

import java.util.Scanner;
// { 클래스 블럭 시작 -> 클래스에서 선언된 변수는 모든 블럭에서 사용 가능
public class ifExample {
	Scanner sc = new Scanner(System.in);

	String c = "클래스 변수 입니다.";
										// 메인 블럭 시작 {
	public static void main(String[] args) {
		ifExample obj = new ifExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
//		System.out.println("메인 메소드에서 호출 " +obj.c);
	}
	private void method4() {
		/*
		 * if(1==2) {
			System.out.println("실행1");
		   }
		*/
		
		if(1==2) System.out.println("실행1");	//한 줄이면 같은 줄에 적어도 됨
		System.out.println("실행2");
		
	}
	// } 메인 블럭 끝
	
	// 메소드 블럭 시작 {
	private void method1() {
		// { if 블럭 시작
		System.out.println("메소드1에서 호출 " +c);
		String a = "method1";	//method1 안에서 선언됐으니까 사용 가능
		if(false) {
			String s = "if 시작점";
			System.out.println(s);
			System.out.println(a);
			// if 문 안에 if 문 사용 가능
			if(false) {
				String ss = " if 안에 if문";	//중첩if문 안에서만 사용 가능한 변수 ss
			}else {
				
			}
		}
		// } if 블럭 끝
		// { else if 블럭 시작
		else if(true) {
			String s = "else if 시작점";
			System.out.println(s);
			System.out.println(a);
			
		}
		// } else if 블럭 끝
	}
	// } 메소드 블럭 끝 
	
	private void method2() {
		//키와 체중을 입력하여 bmi 지수를 구하고
		//bmi지수에 따른 정상, 과체중, 비만, 고도비만 등의 정보를 출력하시오.
		//bmi 지수 = 체중/(키*키) (키=m)
		//0~18.4 : 저체중
		//18.5~22.9 : 정상
		//23.0~24.9 : 과체중
		//25.0~29.9 : 비만
		//30.0이상 : 고도비만
		
		System.out.print("키를 입력하세요 : ");
		double key = sc.nextDouble();
		
		System.out.print("체중을 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(key*key)*10000;
		System.out.println("bmi 수치는 : "+bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}
//		if(bmi>=18.5 && bmi<23)
		else if(bmi<23) {
			System.out.println("정상");
		}else if(bmi<25) {
			System.out.println("과체중");	
		}else if(bmi<30) {
			System.out.println("비만");
		}else 
			System.out.println("고도비만");
	}
	
	private void method3() {
		// 점수를 입력 받고 학점을 출력하시오.
		// (90 이상 A) (80 : B) (70 : C) (60 : D) (0~59 : F)
		// 100~96 A+ 95~90 A-
		
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		String g="";
		if(grade>=90) {
			g="A";
		}else if(grade>=80) {
			g="B";
		}else if(grade>=70) {
			g="C";	
		}else if(grade>=60) {
			g="D";	
		}else
			g="F";
		
		if(grade%10>5 || grade%10==0) {
			g+="+";
		}else
			g+="-";
		
		System.out.println(g+"입니다");
	}
		
	
	
}
// } 클래스 블럭 끝