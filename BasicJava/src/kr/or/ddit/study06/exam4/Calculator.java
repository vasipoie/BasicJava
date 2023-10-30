package kr.or.ddit.study06.exam4;

import java.util.Scanner;

//전략패턴 공부
public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double x = 10, y = 10;
		
		double a = cal.Sum(x, y);
		System.out.println("더하기 = "+a);
		
		double b = cal.Minus(x, y);
		System.out.println("빼기 = "+b);
		
		double c = cal.Divide(x, y);
		System.out.println("나누기 = "+c);
		
		double d = cal.Multi(x, y);
		System.out.println("곱하기 = "+d);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		x = sc.nextDouble();
		
		System.out.println("y : ");
		y = sc.nextDouble();
		
		System.out.println("op : ");
		String op = sc.next();
		
		double result = cal.callCal(x, y, op);
		
		System.out.printf("%f %s %f = %f", x, op, y, result);
		
	}
	
	//입력창에서 바로 연산자도 넣어서 계산 가능
	public double callCal(double a, double b, String op) {
		
		if(op.equals("+")) {
			return Sum(a,b);
		}
		else if(op.equals("-")) {
			return Minus(a,b);
		}
		else if(op.equals("/")) {
			return Divide(a,b);
		}
		else if(op.equals("*")) {
			return Multi(a, b);
		}
		else {
			System.out.println("해당 연산자는 지원하지 않습니다.");
//			return b;
		}
		
		return b;
	}
	
	
	//더하기 메소드 생성 해보기
	public double Sum(double x, double y){
		return x+y;
	}
	
	//빼기 메소드 생성 해보기
	public double Minus(double x, double y) {
		return x-y;
	}
	
	//나누기 메소드 생성 해보기
	public double Divide(double x, double y) {
		return x/y;
	}
	
	//곱하기 메소드 생성 해보기
	public double Multi(double x, double y) {
		return x*y;
	}
}
