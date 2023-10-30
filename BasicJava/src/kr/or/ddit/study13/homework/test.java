package kr.or.ddit.study13.homework;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		test te = new test();
		for(int i=0; i<1000; i++) {
			int td = te.throwDice();
			te.l.add(td);
		}
		te.print();
	}
	
	public void print() {
		for(int i =2; i<13; i++) {
			System.out.println("주사위 합 "+i+"는 총 "+countDice(i)+"번 나왔습니다.");
		}
	}

	public int countDice(int num) {
		int count = 0;
		for(int i=0; i<l.size(); i++) {
			if(num==l.get(i)) {
				count++;
			}
		}
		return count;
	}

	List<Integer> l = new ArrayList();

	public int throwDice() {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		int sum = dice1 + dice2;
		return sum;
	}
	
	
	
	
	
	
	
}
