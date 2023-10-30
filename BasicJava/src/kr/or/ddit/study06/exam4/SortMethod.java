package kr.or.ddit.study06.exam4;

import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
		SortMethod sort = new SortMethod();
		
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		int[] result = sort.sort(num);
		System.out.println(Arrays.toString(result));
		
		System.out.println("---------------------");
		int[] num2 = {10,55,37,20,98};
		System.out.println(Arrays.toString(num2));
		int[] result2 = sort.sort2(num2);
		System.out.println(Arrays.toString(result2));
	}
	
	/*
	 * pulic -> 접근 범위
	 * int[] -> return type
	 * sort  -> 메소드 이름
	 * int[] arr -> 매개변수(파라미터)
	 * 
	 * return 반환 값
	 */
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {	
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {	
					int temp = arr[j];	
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public int[] sort2(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {	
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {	
					int temp = arr[j];	
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
