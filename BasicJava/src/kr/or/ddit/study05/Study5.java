package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Study5 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Study5 obj = new Study5();
//		obj.test1();
//		obj.test2();
//		obj.test3();
//		obj.test4();
	}

	public void test1() {
		/*
		 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기
		 * 위해 필요한 피자의 수를 출력해보세요.
		 */
		
		int n = new Random().nextInt(200);	//0~199사이 난수 1개 발생
	}
	public void test2() {
		/*
			정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
			num_list의 원소의 순서를 거꾸로 뒤집은 배열을 출력 해주세요.
		 */
		
		int length = new Random().nextInt(15);	//0~14사이 난수 1개 발생
		int[] num_list = new int[length];
		for(int i=0; i<num_list.length;	i++) {
			num_list[i] = new Random().nextInt(10);	//0~9사이 난수 1개 발생
			System.out.print(num_list[i]+"\t");
		}
		System.out.println();
		System.out.println("거꾸로 뒤집은 배열은");
		int[] num_list_rev = new int [num_list.length];
//		int i2 = 0;
		for (int j = num_list.length-1; j >=0; j--) {
			num_list_rev[num_list.length-1-j] = num_list[j];
		}
		for (int k = 0; k < num_list.length; k++) {
			System.out.print(num_list_rev[k]+"\t");
		}
	}
	
	public void test3() {
		/*
		 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 구하시오
		 */
		
		int[] numbers = {0, 31, 24, 10, 1, 9};
		
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

            }
        }
	}
	
	public void test4() {
		/*
		 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
		 * my_string에서 letter를 제거한 문자열을 출력하시오
		 * 
		 * 
		 *  my_string	letter	result
			"abcdef"	'f'  	"abcde"
			"BCBdbe"	'B'		"Cdbe"
		 * 
		 */
		String my_string ="abcdef";
		char   letter    ='f';
		
	}

}
