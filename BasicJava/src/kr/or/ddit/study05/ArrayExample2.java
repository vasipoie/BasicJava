package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample2 obj = new ArrayExample2();
//		obj.method1();
		obj.method2();
	}

	private void method2() {
		/*
		 * 각 타입별 초기화 값
		 * 
		 * boolean : false
		 * char : '\u0000'
		 * byte, short, int, long : 0
		 * float : 0.0f
		 * double : 0.0
		 * 
		 * reference type : null
		 */
		
		boolean[] b = new boolean[5];
		char[]c = new char[5];
		byte[] bte = new byte[5];
		short[] s = new short[5];
		int[] i = new int[5];
		long[] l = new long[5];
		float[] f = new float[5];
		double[] d = new double[5];
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(bte));
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(l));
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(d));
		
		String[] str = new String[5];
		System.out.println(Arrays.toString(str));
	}

	private void method1() {
		/*
		 * lotto 45개 번호 배열 생성 후 
		 * 섞어서 앞에 6개 출력
		 */
		
		int[] lotto = new int[45];
		
		//공 번호 지정
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] =i+1;
		}
		
		//충분히 많이 섞을 것
		for (int i = 0; i < 10000000; i++) {
			int ran = (int)(Math.random()*lotto.length);
			int temp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = temp;
		}
		//0~5까지 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+"\t");
		}
		System.out.println();
		/*
		 * 배열 길이가 6인 값을 생성
		 * 위에서 만든 로또 번호를 옮길 것
		 * copy
		 */
		int[] copy = new int[6];
//		for (int i = 0; i < copy.length; i++) {
//			copy[i] = lotto[i];
//		}
		System.out.println(Arrays.toString(copy));
		
		System.arraycopy(lotto, 0, copy, 0, 6);
		System.out.println(Arrays.toString(copy));

		for (int i = 0; i < copy.length-1; i++) {
			for (int j = 0; j < copy.length-1; j++) {
				if (copy[j]>copy[j+1]) {
					int temp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(copy));
		
		}
	}


