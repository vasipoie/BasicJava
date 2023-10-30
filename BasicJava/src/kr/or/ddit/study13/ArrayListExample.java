package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 도큐먼트 주석 alt+shift+j
 * 
 * ArrayList 
 * - 1차원 배열 구조. 기본10개
 * - 중복을 허락하고 순서화 제공
 * - List 타입의 컬렉션
 * 
 * 주요 메서드
 * .add 	 : 데이터 삽입
 * .clear 	 : 모든 데이터 삭제
 * .contains : 포함 여부 확인
 * .get 	 : idx 자료 반환
 * .remove 	 : idx 자료 반환 후 삭제
 */
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		
		for(int i=0; i<20; i++) {
			at.add("str"+i);
		}
		String[] arr = at.arr;
		System.out.println(Arrays.toString(at.arr));
		
		/*
		 * 배열 중에 str6이 있는지 검사해보기.
		 */
//		for(String s : arr) {
//			if(s.equals("str6")) {
//				System.out.println(s);
//			}
//		}
		
		ArrayList l = new ArrayList();
		l.add("데이터1");
		l.add(10.3);

		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		//set : 중복을 허용하지 않는 단일데이터
		//map : set으로 이루어진 데이터
		
		
		
		
		
		
		
		
	}
}
