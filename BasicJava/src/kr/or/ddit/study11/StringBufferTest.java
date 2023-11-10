package kr.or.ddit.study11;

import java.util.Date;

public class StringBufferTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		//테스트
//		stringTest();
		stringBufferTest();
		Date d2 = new Date();
		long time = (d2.getTime()-d1.getTime());
		
		System.out.println(time);
	}
	
	public static void stringTest() {
		String str = "";
		for (int i = 0; i < 1000000; i++) {
			str +="a";
		}
	}

	/*
	 * 문자열 더할 때
	 * stringBuffer로 하면 속도가 빠름
	 * 힙 메모리를 따로 만들지않음
	 */
	public static void stringBufferTest() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 1000000; i++) {
			sb.append("a\n");	//append : 더한다
		}
		String str = sb.toString();	//문자열로 변환
		System.out.println(str);
	}
	
	
	
	
}
