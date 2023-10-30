package kr.or.ddit.study03;

import java.util.Scanner;

public class TestTemp{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TestTemp obj = new TestTemp();
		obj.test();		//메소드를 만나면 test()=메소드로 넘어감
//		obj.test2();	
	}

	private void test2() {
		System.out.println("test2 메소드입니다.");
		System.out.println("test2 메소드입니다.");
		System.out.println("test2 메소드입니다.");
		System.out.println("test2 메소드입니다.");
		System.out.println("test2 메소드입니다.");
	}

	private void test() {
		System.out.println("test 메소드입니다.1");	
		System.out.println("test 메소드입니다.2");	
		System.out.println("test 메소드입니다.3");	
		System.out.println("test 메소드입니다.4");	
		System.out.println("test 메소드입니다.5");	
	}
}
