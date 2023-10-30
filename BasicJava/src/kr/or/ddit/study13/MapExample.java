package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;

/**
 * HashMap
 * key와 value로 이루어짐
 * key 값은 중복을 허용하지 않고 순서가 보장되지 않음
 * 
 * Map 타입의 컬렉션
 * 
 * 주요 메소드
 * .put(key, value); : 데이터 입력 key 값은 중복되지 않음. value는 중복 될 수 있음.
 * .get(key)		 : 입력 받은 value 값을 key 값을 통해 꺼내올 수 있음.
 * .keySet()		 : key로 이루어진 hashSet 값을 가져옴.
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		/*
		 * 제네릭 정보
		 * HashMap<Key, Value>
		 * 타입을 정의해주면 꺼낼때(get)캐스팅을 안해줘도 됨
		 */
		//타입은 Object만 들어갈 수 있어서 int말고 상위 래퍼클래서 적어주기
		HashMap<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("이순신", 75);
		map.put("정몽주", 90);
		map.put("이성계", 83);
		
		//홍길동의 점수
//		int score = (int)map.get("홍길동");
//		//이순신의 점수 넣은 타입 그대로 꺼낼 것
//		double d_score = (double)map.get("이순신");
//		System.out.println(score);
//		System.out.println(d_score);
		
		map.put("홍길동", 60);
		System.out.println(map);	//기존데이터를 또 입력하면 덮어씌워진다
		
		
		
		
		Iterator<String> it = map.keySet().iterator();	//데이터를 순차적으로 꺼내오는 역할
		while(it.hasNext()) {	//hasNext : 데이터가 있으면 출력, 없으면 종료
			String key = it.next();	//제네릭타입 선언해줬으니까 캐스팅 해 줄 필요 없다
//			String key = (String) it.next();
			int value = (int)map.get(key);
			System.out.println(key+", "+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
