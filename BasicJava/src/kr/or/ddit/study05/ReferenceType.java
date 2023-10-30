package kr.or.ddit.study05;

import java.util.Scanner;

public class ReferenceType {
	Scanner sc = new Scanner(System.in);

	String a = "전역 변수";	//class가 만들어지는 순간 a가 스택에 올라감
	public static void main(String[] args) {
		ReferenceType obj = new ReferenceType();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

	private void method4() {
		Customers c1 = new Customers();
		Customers c2 = new Customers();
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println(c1.name);
		System.out.println(c1.age);
	}

	private void method3() {
		String str1 = "홍길동";
		String str2 = "홍길동";	//str1, str2는 같은 주소값
		String str3 = "강감찬";
		String str4 = new String("강감찬");	//new를 쓰면 메모리영역에 새로운 주소를 하나 더 만듦
		String str5 = new String("강감찬");
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));	//값이 같은지 확인 가능
		System.out.println(str4==str5);
	}

	private void method1() {
		String b = "method1 변수";	//method1에서만 사용 가능
		System.out.println(a);
		System.out.println(b);
	}//끝나면 다시 2줄로 가서 method2실행
	
	private void method2() {
		String b = "method2 변수";
		System.out.println(a);
		System.out.println(b);
		
		String[] c = {};
		System.out.println(c);
	}
}

class Customers{
	String name;
	int age;
	
	Customers() {
		this.name="강감찬";
		this.age=26;
	}
	@Override
	public String toString() {
		return name+","+age;
	}
}