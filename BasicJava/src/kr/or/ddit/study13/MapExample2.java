package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MapExample2 {
	public static void main(String[] args) {
	//emp_no, emp_name, dept, tel
	//100		김나혜	개발부	010-2646-7470
		
		/*
		 * 해쉬맵에 각각
		 * key 		emp_no, emp_name, dept, tel
		 * value	100		김나혜	    개발부	010-2646-7470
		 * 			101		홍성범	    기획부	010-7562-3217
		 * 
		 * 입력해보기()
		 * .put(key, value);
		 */
		
		HashMap map = new HashMap();
		map.put("emp_no", "100");
		map.put("emp_name", "김나혜");
		map.put("dept", "개발부");
		map.put("tel", "010-2646-7470");
		
		//emp_no 값 꺼내보기
		String emp_no = (String) map.get("emp_no");
		System.out.println(emp_no);
		
		//tel 값 꺼내보기
		String tel = (String) map.get("tel");
		System.out.println(tel);
		
		//전체 꺼내보기
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			String value = (String) map.get(key);
			System.out.println(key+", "+value);
		}
		
		HashMap map2 = new HashMap();
		map2.put("emp_no", "101");
		map2.put("emp_name", "홍성범");
		map2.put("dept", "기획부");
		map2.put("tel", "010-7562-3217");
		
		
		//map에 emp_no 값 가져오기
		//map2에 emp_name 값 가져오기
		String emp_n = (String) map.get("emp_no");
		String emp_na2 = (String) map2.get("emp_name");
		System.out.println("emp_n : "+emp_n+", emp_name : "+emp_na2);
		
		
		ArrayList l = new ArrayList();
		//리스트에 맵 담아 볼 것
		//리스트 값 더하는 방법 .add();
		l.add(map);
		l.add(map2);
		System.out.println(l);
		
		
	}
}
