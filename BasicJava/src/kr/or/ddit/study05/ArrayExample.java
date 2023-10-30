package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();	//얕은복사, 깊은복사
//		obj.method6();	//버블정렬
//		obj.method7();	//a,b 바꿔보기
//		obj.method8();	//선택정렬
//		obj.method9();
		

	}

	private void method9() {
		String[] a;
		a = new String[] {"홍길동", "신용권", "감자바"};
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
	}

	private void method8() {
		/*
		 * 선택 정렬
		 * 원본 자료가 n개일 때 n-1차로 운행한다.
		 * 왼쪽 자료부터 기준값으로 선정하여 나머지 모든 자료와 비교한다.
		 */
		int[] num = {67, 55, 9, 86, 98};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				// i=0		67, 55, 9, 86, 98
				//1번째실행	55, 67, 9, 86, 98
				//2번째실행	9, 67, 55, 86, 98
				//3번째실행	9, 67, 55, 86, 98
				//4번째실행	9, 67, 55, 86, 98
				
				//i=1		9, 67, 55, 86, 98
				//j=0		9, 55, 67, 86, 98
				//			9, 55, 67, 86, 98
				//			9, 55, 67, 86, 98
				
				// i=0			67, 55, 9, 86, 98
				//1번째실행(j=0)	67, 55, 9, 86, 98
				//2번째실행(j=1)	67, 55, 9, 86, 98
				//3번째실행(j=2)	67, 55, 9, 86, 98
				//4번째실행(j=3)	86, 55, 9, 67, 98
				//5번째실행(j=4)	98, 55, 9, 67, 86
				
				//i=1			98, 55, 9, 67, 86
				//j=0			55, 98, 9, 67, 86
				//j=1			55, 98, 9, 67, 86
				//j=2			55, 98, 9, 67, 86
				//j=3			55, 98, 9, 67, 86
				//j=4			55, 98, 9, 67, 86
				
				if(num[i]>num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

	private void method7() {
		int a = 7;
		int b = 3;
		System.out.printf("a 값은 %d, b 값은 %d\n", a,b);
		
		//a랑 b값 바꿔보기
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("a 값은 %d, b 값은 %d\n", a,b);
		
	}

	private void method6() {
		//버블정렬(bubble sort)
		//원본자료가 n개일때 n-1차 운행한다.
		//각 회차에서 인접한 두 값을 비교하여 오름차순인 경우 작은 값을 앞에 위치시킴
		
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length-1; i++) {	//i=실행횟수
			for (int j = 0; j < num.length-1; j++) {//-1을 한 이유 : j=4일때 num[j+1]==num[5]인데 num[5]값은 없으니까 에러
				//67 55 9 86 98 : i=0
				//55 67 9 86 98 : 1번째 시행(j=0)
				//55 9 67 86 98 : 2번째 시행(j=1)
				//55 9 67 86 98 : 3(j=2)
				//55 9 67 86 98 : 4(j=3)
				
				//55 9 67 86 98 : i=1
				//9 55 67 86 98 : 1
				//9 55 67 86 98 : 2
				//9 55 67 86 98 : 3
				//9 55 67 86 98 : 4
				
				if(num[j]>num[j+1]) {	//내림차순 : num[j]<num[j+1]
					int temp = num[j];	//a,b값을 바꾸는거
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

	private void method5() {
		/*
		 * 배열 복사 : 얕은 복사(shallow copy), 깊은 복사(deep copy)
		 * 
		 * 얕은 복사(shallow copy) : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 같이 변경
		 */
		
		int[] source = {1,2,3,4,5};
		int[] target = source;	//source의 주소값을 저장. target이랑 source는 동일함
		
//		for(int i=0; i<source.length; i++) {
//			System.out.print(source[i]+"\t");
//		}
//		System.out.println();
//		
//		for(int i=0; i<target.length; i++) {
//			System.out.print(target[i]+"\t");
//		}
//		System.out.println();
//		
//		target[2] = 30;
//		
//		for(int i=0; i<source.length; i++) {
//			System.out.print(source[i]+"\t");
//		}
//		System.out.println();
//		
//		for(int i=0; i<target.length; i++) {
//			System.out.print(target[i]+"\t");
//		}
//		System.out.println();
		
		/*
		 * 깊은 복사 : 배열 공간을 별도로 확보
		 * 1. 반복문 이용
		 * 2. System.arrycopy()
		 * 3. clone()
		 */
		
		int[] des1 = new int[source.length];	//객체 새로 생성. 주소값이 다름
		for(int i=0; i<des1.length; i++) {	//for문으로 값을 일일히 넣음
			des1[i] = source[i];
			System.out.print(des1[i] + "\t");
		}
		System.out.println();
		
		des1[2] = 30;
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < des1.length; i++) {
			System.out.print(des1[i] + "\t");
		}
		System.out.println();
		

		
		
		int[] des2 = new int[source.length];
		System.arraycopy(source, 0, des2, 0, 3);	//원본배열, 어디서부터, 복사된거 넣을 배열, 새 배열에서 시작 인덱스,복사할 개수. 원하는 갯수만큼 바꿀 수 있음
		des2[2] = 31;
		System.out.println("System.arraycopy 사용");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < des2.length; i++) {
			System.out.print(des2[i]+"\t");
		}
		System.out.println();
		
		
		

		System.out.println("clone 사용");
		int[] des3 = source.clone();	//알아서 전체가 깊은 복사
		des3[2] = 32;
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < des3.length; i++) {
			System.out.print(des3[i]+"\t");
		}
		System.out.println();
		
	}

	private void method4() {
		// 키보드로 거스름돈을 입력받아 화폐단위별로 개수를 구하시오
		int[] coin;
		coin = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println("거스름돈의 액수를 입력");
		int money = sc.nextInt();
		for(int i=0; i<coin.length; i++) {
			int c = coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], (money/coin[i]));
			money%=coin[i];
		}
	}

	private void method3() {
		//배열 객체 10개를 생성하고 최소값, 최대값, 합계, 평균을 출력해라
		//for문, if문 사용
		int[] score = {75, 80, 81, 84, 95, 65, 77, 71, 72, 74};
		int min = score[0];
		int max = score[0];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i]<min) {
				min = score[i];
			}
			if(score[i]>max) {
				max = score[i];
			}
			sum+=score[i];
		}
		avg = (double)sum/score.length;
		System.out.println(min+", "+max);
		System.out.println(sum+", "+avg);
	}

	private void method2() {
		// 정수 5개를 입력받아 저장하고 역순으로 출력
		int[] num;
		num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("i번째 정수 입력 : ");
			num[i] = sc.nextInt();
		}
		
		for (int i = num.length-1; i >=0; i--) {
			System.out.println(num[i]);
		}
	}

	private void method1() {
		// int 변수 5개 선언해볼것
		// [] 배열 선언
		// new <- 메모리 할당
		// int[] <- 생성될 개수
		int[] a1 = new int[5];
		for(int i=0; i<a1.length; i++) {
//			System.out.print(a1[i]);
		}
		System.out.println(Arrays.toString(a1));
		
		
		int[][] aa = new int[][] {{1,2},{3,4},{5,6}};
		
		int[] ab = new int[3];
//		ab = {1,2,3};
//		ab[0] = {1};
		ab[0] = 1;
		
		int[] ba = new int[] {};
		
//		int[] bd = new int[3]{1,2,3};
		
		int[] a = new int[] {1,2,3,4,5};
		int[] ac;
		
		int[] b;
		b = new int[] {1,2,3,4,5};
		
		int[] c = new int[5];
		System.out.println(c);
		
		int[] d = new int[] {1,2,3,4,5};
		
		String[] arr = new String[] {"XX", "YY", "ZZ"};
	}
}
