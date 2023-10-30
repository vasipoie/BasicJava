package kr.or.ddit.study04.homework;

import java.util.Scanner;

public class Homework4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework4 obj = new Homework4();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}

	private void method4() {
		/*
		 * 양의 정수 n이 매개변수로 주어질 때
		 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수 합
		 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수 제곱의 합
		 */
		
		int nn = (int)(Math.random()*100)+1;
		System.out.println("nn값은 "+nn);
		int sum =0;
		
		if(nn%2==0) {
			for(int i=2; i<=nn; i=i+2) {	//짝수
				sum+=i*i;
				System.out.println(sum);
			}
		}else {
			for(int i=1; i<=nn; i=i+2) {	//홀수
				sum+=i;
				System.out.println(sum);
			}
		}
		
		
/*
		int sumOdd = 0;
		int sumEvenSqu = 0;
		
		int n = (int)(Math.random()*6)+1;
		System.out.println("n값은 "+n);
		
		int h = n;
		
		if(n%2==1) {
			for(; n>0 && n<101; n=n-2) {
				sumOdd +=n;
			}
			System.out.printf("%d이하 모든 양의 홀수 합 : %d", h, sumOdd);
		}else {
//			int a = 0;
			for(; n>0 && n<7; n=n-2) {
//				sumEvenSqu = n*n;
//				a += sumEvenSqu;
				
				int squ = n*n;
				sumEvenSqu +=squ;
			}
			System.out.printf("%d이하 모든 양의 짝수 제곱의 합 : %d", h, sumEvenSqu);
		}
*/
	}

	private void method3() {
		/*
		 * for 문 2개를 이용하여 구구단 전체를 출력하시오.
		 * 스캐너를 통해 숫자를 입력받고 해당 숫자에 해당하는 구구단은 제외
		 */
		System.out.println("2~9단 중 제외할 구구단 숫자를 입력하세요");
		int n = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				if(n==dan) {
					continue;
				}
				System.out.printf("%d*%d =%d\t", dan, i, dan*i);
				
//				if(n!=dan) {
//					System.out.printf("%d*%d =%d\t", dan, i, dan*i);
//				}
			}
			System.out.println();
		}
	}

	private void method2() {
		/*
		 *  for 문 2개를 이용하여 구구단 전체를 출력하시오.
		    2*1 =2	3*1 =3
		    2*2 =4	3*2 =6
		    2*3 =6	3*3 =9
		 */
//SS		
		for(int i=2; i<10; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		
/*		
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d*%d =%d\t", dan, i, dan*i);
			}
			System.out.println();
		}
*/		
	}

	private void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력받고 해당 숫자에 해당하는 구구단을 출력하시오
		 * 
		 * 3*1 =3
		   3*2 =6
		   3*3 =9
		   3*4 =12
		   3*5 =15
		   3*6 =18
		   3*7 =21
		   3*8 =24
		   3*9 =27
		 */
		System.out.print("1~9까지 숫자를 입력하세요 : ");
		String dan = sc.nextLine();
		int _dan = Integer.parseInt(dan);
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d*%d =%d\n", _dan, i, _dan*i);
		}
	}
}
