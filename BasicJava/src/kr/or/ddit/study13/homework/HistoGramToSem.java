package kr.or.ddit.study13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HistoGramToSem {
	
	List<Integer> diceList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		HistoGramToSem hg = new HistoGramToSem();
		hg.process();
	}
	
	private void process() {
		doThrow(1000);
		print();
	}

	private void print() {
		for(int i=2; i<=12; i++) {
			int count = getDiceNumCount(i);
			System.out.print("주사위 합 "+i+" 는\t"+count+"\t");
			//차트 나타내기
			for(int j=0; j<count/10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private int getDiceNumCount(int num) {
		int cnt = 0;
		for(int dice : diceList) {
			if(dice == num)
				cnt++;
		}
		return cnt;
	}

	private void doThrow(int enforcement) {
		for(int i = 0; i<enforcement; i++) {
			int num = throwDice() + throwDice();
			diceList.add(num);
		}
	}

	public int throwDice() {
		return new Random().nextInt(6)+1;
	}
	
	
	
	
}
