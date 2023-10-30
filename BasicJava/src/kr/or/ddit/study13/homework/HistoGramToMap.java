package kr.or.ddit.study13.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HistoGramToMap {
	//<주사위 눈금 합, 개수>
	Map<Integer, Integer> map = new HashMap();	
	
	public static void main(String[] args) {
		HistoGramToMap hg = new HistoGramToMap();
		hg.process();
	}
	
	private void process() {
		doThrow(1000);
		print();
	}

	private void print() {
		for(int i=2; i<=12; i++) {
			int count = map.get(i);
			System.out.print("주사위 합 "+i+" 는\t"+count+"\t");
			//차트 나타내기
			for(int j=0; j<count/10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	private int getDiceNumCount(int num) {
//		int cnt = 0;
//		for(int dice : map.get()) {
//			if(dice == num)
//				cnt++;
//		}
//		return cnt;
//	}

	private void doThrow(int enforcement) {
		for(int i = 0; i<enforcement; i++) {
			int num = throwDice() + throwDice();
			//salary 합 구한거랑 같은 로직
			int cnt = 1;
			if(map.containsKey(num)) cnt+=map.get(num);
			map.put(num, cnt);
		}
	}

	private int throwDice() {
		return new Random().nextInt(6)+1;
	}
	
}
