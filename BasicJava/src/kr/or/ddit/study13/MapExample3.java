package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MapExample3 {
	public static void main(String[] args) {
		MapExample3 me = new MapExample3();
		List<Map> al = me.dataInput();
		System.out.println(al);
		int maxSalary = me.getMaxSalary(al);
		System.out.println("직원의 최대 월급은 : "+maxSalary);
		List addDept = me.getAddDept(al);
		me.printEmp_no103(al);
	}
	

	public void printEmp_no103(List<Map> al) {
		for (int i = 0; i < al.size(); i++) {
			Map m  = al.get(i);
			//no_103인 사람 찾기
			String emp_no = (String) m.get("emp_no");
			//no_103이 아니라면 continue로 다음 포문 진행하기
			if(!emp_no.equals("103")) continue;
			System.out.println(m);
			//모든 정보 출력하기
			//iterator 사용
			Iterator it = m.keySet().iterator();	//전체를 꺼낼 때
			System.out.println("---------------------------------------------");
			while(it.hasNext()) {
				String key = (String) it.next();
				String value = (String) m.get(key);	//하나씩 꺼낼 때
				System.out.print(value+"\t");
			}
			System.out.println();
			System.out.println("---------------------------------------------");
		}
	}


	public List getAddDept(List<Map> al) {
		//각 부서별 월급 합 구하기
		ArrayList salSum = new ArrayList();
		HashMap sum = new HashMap();
		for(Map map : al) {
			String dept = (String) map.get("dept");
			String salary = (String) map.get("salary");
			int salaryInt = Integer.parseInt(salary);
			//입력된 부서가 있으면 덮어쓰기가 되니까. 꺼내서 지금 현재 값과 더해줌
			if(sum.containsKey(dept)) salaryInt += (int) sum.get(dept);
			sum.put(dept, salaryInt);
		}
		System.out.println(sum);
		/*
		 * sum값 전체 꺼내서 salSum에 넣어보기
		 */
		Iterator it = sum.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			int value = (int) sum.get(key);
			salSum.add(value);
		}
		return salSum;
	}


	public int getMaxSalary(List<Map> al) {
		//제일 높은 월급
		int max = 0;
		for (Map map : al) {
			//월급인 salary문자열 값 꺼내기
			String salary = (String) map.get("salary");
			//문자열을 비교를 위해 숫자로 변환하기 (wrapper class)
			int salaryInt = Integer.parseInt(salary);
			System.out.println(salaryInt);
//			System.out.println(salary);
//			System.out.println(map);
			
			//맥스 값이랑 비교해서 더 크다면 max 값에 저장하기
			if(max<salaryInt) {
				max = salaryInt;
			}
		}
		return max;
	}


	public List<Map> dataInput() {
	//emp_no, emp_name, dept, 	tel,			salary
//	  100	    장승수		영업부	010-8422-8117	300
//	  101	    홍성범		기획부	010-7562-3217	350
//	  102	    이만수		기획부	010-5562-6677	500
//	  103	    강나미		영업부	010-4442-5614	350
//	  109	    민병철		총무부	010-2542-8277	250

		/*
		 * 5개의 맵을 각각 선언 및 데이터 입력
		 */
		HashMap map1 = new HashMap();
		map1.put("emp_no", "100");
		map1.put("emp_name", "장승수");
		map1.put("dept", "영업부");
		map1.put("tel", "010-8422-8117");
		map1.put("salary", "300");
		
		HashMap map2 = new HashMap();
		map2.put("emp_no", "101");
		map2.put("emp_name", "홍성범");
		map2.put("dept", "기획부");
		map2.put("tel", "010-7562-3217");
		map2.put("salary", "350");
		
		HashMap map3 = new HashMap();
		map3.put("emp_no", "102");
		map3.put("emp_name", "이만수");
		map3.put("dept", "기획부");
		map3.put("tel", "010-5562-6677");
		map3.put("salary", "500");
		
		HashMap map4 = new HashMap();
		map4.put("emp_no", "103");
		map4.put("emp_name", "강나미");
		map4.put("dept", "영업부");
		map4.put("tel", "010-4442-5614");
		map4.put("salary", "350");
		
		HashMap map5 = new HashMap();
		map5.put("emp_no", "109");
		map5.put("emp_name", "민병철");
		map5.put("dept", "총무부");
		map5.put("tel", "010-2542-8277");
		map5.put("salary", "250");
		
		
		/*
		 * 5개의 맵을 리스트를 선언해 입력 할 것
		 */
		ArrayList al = new ArrayList();
		al.add(map1);
		al.add(map2);
		al.add(map3);
		al.add(map4);
		al.add(map5);
		
		
		/*
		 * 리스트에 각 맵을 입력한 후 리턴 해볼 것
		 */
		return al;
	}

	
	
	
}
