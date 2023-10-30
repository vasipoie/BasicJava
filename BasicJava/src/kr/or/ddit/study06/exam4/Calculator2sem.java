package kr.or.ddit.study06.exam4;

import java.util.Arrays;

public class Calculator2sem {
	public static void main(String[] args) {
		// 문자열 입력 받았을때 계산 해보기
		// 12*3+4-7
		// 임의의 문자를 입력 받았을때 결과값 출력해보기
		
//		System.err.println("ddd");
		String s = "12*3+4/7";
		// 문자와 숫자 나누기 
		// 연산 우선 순위 먼저 계산 
		char[] ch = s.toCharArray();
		double num[] ;
		char op [] ; 
		int    op_cnt =0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] =='+' || ch[i] =='-' || ch[i] =='*' || ch[i] =='/') {
				op_cnt++;
			}
		}
		op = new char[op_cnt];
		num = new double[op_cnt+1];
		
		int cnt =0;
		String num_string ="";
		for(int i=0; i<ch.length; i++) {
			if(ch[i] =='+' || ch[i] =='-' || ch[i] =='*' || ch[i] =='/') {
				num[cnt] = Double.valueOf(num_string);
				num_string="";
				op[cnt++] = ch[i];
			}
			else {
				num_string+=ch[i];
			}
		}
		num[cnt] = Double.valueOf(num_string);
		
		System.out.println(Arrays.toString(op));
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<op.length; i++) {
			if(op[i] =='*') {
				num[i] = num[i]*num[i+1];
				num = remove(num,i+1);
				op  = remove(op, i);
			}
			if(op[i] =='/') {
				num[i] = num[i]/num[i+1];
				num = remove(num,i+1);
				op  = remove(op, i);
			}
		}
		
		System.out.println(Arrays.toString(op));
		System.out.println(Arrays.toString(num));
	}
	
	public static char[] remove(char[] d, int n) {
		char[] r = new char[d.length-1];
		int c =0;
		for(int i=0; i<r.length; i++) {
			if(i == n) c++;
			r[i]=d[i+c];
		}
		return r;
	}
	
	public static double[] remove(double[] d, int n) {
		double[] r = new double[d.length-1];
		int c =0;
		for(int i=0; i<r.length; i++) {
			if(i == n) c++;
			r[i]=d[i+c];
		}
		return r;
	}
	
	
}
