package kr.or.ddit.study02;

import java.util.Scanner;

//import java.util.Scanner;

public class TypeChange3 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("문자열을 입력해주세요");
//		String str = sc.nextLine();
//		System.out.println("입력받은 문자열은 "+str);
//		
		
		// "문자" -> 숫자
		System.out.println("숫자만 입력해주세요");
		String str = "4000000000";
		//int -> Integer
//		int num = Integer.parseInt(str)+3;
//		System.out.println("변경된 숫자 입니다."+num);
		
		//long -> Long
		long l1 = Long.parseLong(str);
		System.out.println("변경된 숫자 입니다."+l1);
		
		//double -> Double
		double d1 = Double.parseDouble(str);
		System.out.println("변경된 숫자 입니다."+d1);
		
		
	}
}
