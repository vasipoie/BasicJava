package kr.or.ddit.study06.exam4;

import java.util.Scanner;

//외부
public class PersonTest {
	public static void main(String[] args) {
		PersonVo p1 = new PersonVo("이름1", 20, "한국");
		PersonVo p2 = new PersonVo("이름2", 20, "한국");
		PersonVo p3 = new PersonVo("이름3", 20, "한국");
		PersonVo p4 = new PersonVo("이름4", 20, "한국");
		PersonVo p5 = new PersonVo("이름5", 20, "한국");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		
		int age1 = sc.nextInt();
//		if(age1<0) {
//			System.out.println("음수는 입력할 수 없습니다.");
//		}else {
//			p1.age = age1;
//		}
		p1.setAge(age1);
		
		int age2 = sc.nextInt();
		p2.setAge(age2);
		
		int age3 = sc.nextInt();
		p3.setAge(age3);
		
		int age4 = sc.nextInt();
		p4.setAge(age4);
		
		int age5 = sc.nextInt();
		p5.setAge(age5);
	}
}
