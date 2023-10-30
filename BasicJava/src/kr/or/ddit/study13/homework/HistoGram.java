package kr.or.ddit.study13.homework;

import java.util.ArrayList;
import java.util.List;

public class HistoGram {
	/*
	 * 요구사항
	 * 
	 * 주사위 2개를 던져서 총 주사위 합을 구한 후 
	 * 1000번 던져서 해당 값을 저장 할 것(list)
	 * 전체 히스토그램을 구해볼 것
	 * 주사위 눈은 1~6으로 구현되어 있음
	 * 
	 * 주사위 던지면 주사위 값은 랜덤.1~6사이 값
	 * 주사위 두 개 던진 값 합쳐서 기록
	 * 합의 전체 그래프? 
	 * 
	 */
	
	List<Integer> diceList = new ArrayList();
	
	public static void main(String[] args) {
		HistoGram hg = new HistoGram();
		for (int i = 0; i < 1000; i++) {
			int thousand= hg.throwDice();
			hg.diceList.add(thousand);
		}
		hg.print();
	}
	
	public int throwDice() {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		return dice1+dice2;
	}
	
	public int getDiceNumCount(int num){//2를 넣으면 2가 몇번 나왔는지
		int count = 0;
		for(int i : diceList) {
			if(num == diceList.get(i)) {
				count++;
			}
		}
		return count;
	}
	
	public void print() {
		for (int i = 2; i <= 12; i++) {
			System.out.println("주사위 합 "+i+"는 "+getDiceNumCount(i)+"번 나왔습니다.");
		}
	}
	
}
