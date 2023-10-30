package kr.or.ddit.study05;

import java.util.Arrays;
import java.util.Scanner;

public class WordScramble {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WordScramble obj = new WordScramble();
		obj.method1();
		
	}

	private void method1() {
		/*
		 * 5개의 단어가 제공되며 이 중 임의의 단어가 선택된다.
		 * 선택된 단어의 철자를 섞어 사용자에게 제시되며
		 * 사용자는 이를 보고 원래의 단어를 입력한다.
		 * 사용자가 단어를 맞출 때까지 반복하여 단어를 맞추었을 때 시도 횟수를 출력.
		 */
		String[] word = {"apple", "banana", "love", "hope", "persimmon"};
		int ran = (int)(Math.random()*word.length);		//0.0 ~ 4.xxx 니까 0~4까지 나옴
		String select = word[ran]; 
		
		//문자열 -> char[]의 배열로 변환 : toCharArray
		char[] ch = select.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			//r값이 3이면
			//3과 1번째 배열값이 바뀜
			//1 = p  3 = l -> alppe
			//r값이 2라면
			//2와 1번째 배열값이 바뀜
			//1 = l  2 = p -> aplpe
			int r = (int)(Math.random()*ch.length);
			char temp = ch[1];
			ch[1] = ch[r];
			ch[r] = temp;
		}
		System.out.println(Arrays.toString(ch));
		
		int count = 0;
		while(true) {
			System.out.print("정답 : ");
			String str = sc.nextLine();
			count++;
			/*
			 * if문으로 문자열 같은지 비교 -> equals
			 */
			if(str.equals(select)) {
				System.out.println("정답입니다! "+count+"번 시도 했습니다.");
				break;
			}else {
				System.out.println("틀렸습니다. 다시 입력해주세요");
			}
		}
	}
}
