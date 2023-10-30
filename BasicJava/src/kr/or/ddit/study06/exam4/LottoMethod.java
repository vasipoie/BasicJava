package kr.or.ddit.study06.exam4;

import java.util.Arrays;

//메소드 활용예시
public class LottoMethod {
	public static void main(String[] args) {
		LottoMethod lm = new LottoMethod();
//		int[] lotto = lm.generateLotto();
//		System.out.println(Arrays.toString(lotto));
//		lm.lottoPaper();
		
//		int[][] paper = lm.lottoPaper();
//		for (int i = 0; i < paper.length; i++) {
////			System.out.println(Arrays.toString(paper[i]));
//			lm.printArray(paper[i]);
//		}
		
		int[][][] bundle = lm.lottoBundle(6000);
		for (int i = 0; i < bundle.length; i++) {
			int[][] papers = bundle[i];
			for (int j = 0; j < papers.length; j++) {
				int[] lottos = papers[j];
				System.out.println(Arrays.toString(lottos));
			}
			System.out.println("------------------------------------");
		}
	}
	
	public void printArray(int[] arr) {	//Arrays.toString 메소드로 만들어본거
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(arr.length-1==i) {
				System.out.print(arr[i]+"]");
			}else {
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println();
	}
	
	
	
	public int[][][] lottoBundle(int money){
		/*
		 * 1000원 단위
		 */
		int papers = money/1000/5;	//2만원->4장
		
		if(money/1000%5 != 0 ) papers++;	//나머지가 있으면 1장이 더 있어야함
		int[][][] bundle = new int[papers][5][6];
		
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		
		if(money/1000%5 != 0 ) {
			bundle[papers-1] = lottoPaper(money/1000%5);
		}
		return bundle;	
	}
	
	
	public int[][] lottoPaper(){
		return lottoPaper(5);	//오버로딩. 구현해놓은 코드 참고하려고 씀		
//		int[][] paper = new int[5][6];
//		
//		for(int line=0; line<paper.length; line++) {
//			int[] lotto = generateLotto(); //이렇게 쓰면 generateLotto에서 for문~break까지 안써도됨
//			paper[line] = lotto;
//		}
////		for(int line = 0; line<5; line++) {
////			System.out.println(Arrays.toString(paper[line]));
////		}
////		return null;
//		return paper;
	}
	
	public int[][] lottoPaper(int n){
		int[][] paper = new int[n][6];
		
		for(int line=0; line<paper.length; line++) {
			int[] lotto = generateLotto();
			paper[line] = lotto;
		}
		return paper;
	}
	
	
	public int[] generateLotto() {
		int[] lotto = new int[6];
		// 로또 값 저장 포문
		for (int i = 0; i < lotto.length; i++) {
			int ran = (int)(Math.random()*45)+1;
			// 배열 값 저장
			lotto[i] = ran;
			// 비교 포문
			for (int j = 0; j < i; j++) {
				/*
				 * 저장된 로또 값과 비교 후
				 * 저장된(중복) 값이 있다면 i 다시 반복
				 */
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
//		for (int i = 0; i < lotto.length-1; i++) {
//			for (int j = 0; j < lotto.length-1; j++) {
//				if(lotto[j]>lotto[j+1]) {
//					int temp = lotto[j];
//					lotto[j] = lotto[j+1];
//					lotto[j+1] = temp;
//				}
//			}
//		}
		
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = i+1; j < lotto.length; j++) {
//				if(lotto[i]>lotto[j]) {
//					int temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//				}
//			}
//		}
		
//		System.out.println(Arrays.toString(lotto));
//		return null; //이렇게 쓰면 메소드를 쓰는 의미가 없으니까
		
		Arrays.sort(lotto);	//lotto = sort(lotto); 누군가 Arrays.sort()로 만들어놨음.
		return lotto;
	}
	
	public int[] sort(int[] arr) {
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
	
	
	
	
	//-----------------//
	public int[] lotto() {
		int[] lo = new int[6];
		//로또 값 저장 포문
		for (int i = 0; i < lo.length; i++) {
			int rand = (int)(Math.random()*45)+1;
			lo[i] = rand;
			//비교 포문
			for (int j = 0; j < lo.length; j++) {
				if(lo[i]==lo[j]) {
					i--;
					break;
				}
			}
		}
		return null;
	}
	
	public int[][] ppaper(){
		int[][] pap = new int[5][6];
		
		
		return null;
	}
	
}





