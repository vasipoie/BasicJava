package kr.or.ddit.study13.homework;

import java.util.Scanner;

public class Grade {
	int sci;
	int his;
	int mus;
	int sum;
	
	public Grade(int sci, int his, int mus) {
		this.sci = sci;
		this.his = his;
		this.mus = mus;
		this.sum = sci+his+mus;
	}

	@Override
	public String toString() {
		return "Grade [sci=" + sci + ", his=" + his + ", mus=" + mus + "]";
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과학 점수를 입력해주세요\t");
		int sci = sc.nextInt();
		System.out.print("역사 점수를 입력해주세요\t");
		int his = sc.nextInt();
		System.out.print("음악 점수를 입력해주세요\t");
		int mus = sc.nextInt();
		Grade gra = new Grade(sci, his, mus);
		System.out.println("총 점수 합은 "+gra.sum+"입니다.");
		
	}
	
}
