package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample3 obj = new ArrayExample3();
//		obj.method1();
//		obj.method2();
		obj.method3();
//		obj.method4();

	}

	private void method4() {
		//5명의 3과목(국어 영어 수학) 성적과 이름을 배열에 저장하고
		//총점과 평균과 등수를 구하여 출력하시오.
		
		String[] stuName = {"홍길동","강감찬","이성계","이순신","정몽주"};		
		int[][] score = {{80, 70, 80, 0, 0, 1},
						 {90, 85, 90, 0, 0, 1},
						 {90, 70, 75, 0, 0, 1},
						 {65, 75, 70, 0, 0, 1},
						 {80, 80, 70, 0, 0, 1}};
		
		//총점계산
//		int sum = 0;
		for (int peop = 0; peop < score.length; peop++) {
			//1차원배열
//			int kor = score[peop][0];
//			int eng = score[peop][1];
//			int math = score[peop][2];
//			int sum = kor+eng+math;
//			score[peop][3] = sum;
			score[peop][3] = score[peop][0]+score[peop][1]+score[peop][2];
//			System.out.println(Arrays.toString(score[peop]));
		}
		
		//평균계산
		for (int i = 0; i < score.length; i++) {
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			score[i][4] = score[i][3]/3;
//			System.out.println(Arrays.toString(score[i]));
		}

		//등수계산
		for (int i = 0; i < score.length; i++) {	//i는 본인배열
			for (int j = 0; j < score.length; j++) {	//j는 비교할 배열
				//총점 비교 후 값이 더 작으면 등수를 증가시킨다.
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(""+stuName[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		//2차원 배열 바꾸기
 		int[] temp = score[0].clone();
		score[0] = score[1];
		score[1] = temp;
		
		String temp_s = stuName[0];
		stuName[0] = stuName[1];
		stuName[1] = temp_s;
		
		System.out.println("---------------------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(""+stuName[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
	}
		
		
		for (int i = 0; i < score.length-1; i++) {
			for (int j = 0; j < score.length-1; j++) {
				if(score[j][5]>score[j+1][5]) {
					int[] temp_r = score[j].clone();	//2차원 배열에서 꺼낸 값은 1차원 배열
					score[j] = score[j+1];
					score[j+1] = temp_r;
				
					String temp_n = stuName[j];
					stuName[j] = stuName[j+1];
					stuName[j+1] = temp_n;
				}
			}
		}
		
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.print(""+stuName[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
	}
	}
		
		


	private void method3() {
		//1차원 배열 건너 뛰기
		int[][] arr = new int[3][];
		
		arr[1] = new int[3];
		arr[0] = new int[3];
		arr[2] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("i "+i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private void method2() {
		//국어 영어 수학 점수
		String[] stuName = {"홍길동", "강감찬", "이순신"};
		int[][] score = {{80, 75, 87},
						 {88, 90, 91},
						 {77, 73, 65},
						};
		int h_eng = score[0][1];
		System.out.println(h_eng);
		
		//이순신 점수 : score[2]
		int[] lee = score[2];
		int l_kor = lee[0];
//		int l_kor = score[2][0];
		System.out.println(l_kor);
		
		//3명의 국어 점수만 출력
		int h_kor = score[0][0];
		int k_kor = score[1][0];
		int l_kor1 = score[2][0];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				if(j==0) {
					System.out.println("국어점수 "+score[i][j]);
				}else if(j==2) {
					System.out.println("수학점수 "+score[i][j]);
				}
			}
		}
	}

	private void method1() {
		int length2 = 5;
		int length1 = 10;
		int[][] arr = new int[length2][length1];	//2차원배열은 1차원배열의 집합. 앞에는 1차원 배열 개수. 뒤에가 1차원 배열의 길이
		for(int i = 0; i<length2; i++) {
			int[] a1 = arr[i];	//2차원 배열에서 값을 꺼내면 1차원 배열이 된다
			for(int j=0; j<length1; j++) {
				a1[j] = i;	//1차원 배열에서 값을 꺼내면 int라는 변수가 된다
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			int[] a1 = arr[i];	//2차원 배열에서 값을 꺼내면 1차원 배열이 된다
			for(int j=0; j<a1.length; j++) {
				System.out.print(a1[j]+"\t");
			}
			System.out.println();
		}
	}
}
