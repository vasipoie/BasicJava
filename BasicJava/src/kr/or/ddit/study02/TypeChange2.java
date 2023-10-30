package kr.or.ddit.study02;

import java.util.Scanner;	//sc입력하고 ctrl+spacebar, ctrl+shift+o
							//내가 사용하는 클래스를 import로 불러온다

public class TypeChange2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//입력

		System.out.println("국어 점수를 입력해 주세요.");	//안내문구
		int kor = sc.nextInt();
//		System.out.println("국어 점수는 : "+kor);
		
		System.out.println("영어 점수를 입력해 주세요.");
		int eng = sc.nextInt();

		System.out.println("수학 점수를 입력해 주세요.");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		System.out.println("점수 합 : "+sum);
		double mean = ((double)sum)/3;	// sum=int니까 강제변환 필요
		System.out.println("평균 : "+mean);
		
		
		
		
		
	}
}
