package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExample4 {
	
	public static void main(String[] args) {
		MapExample4 me = new MapExample4();
		List<Map<String, String>> l = me.dataInput();
		me.printAll(l);
		int min = me.getMin(l, "0148");
		System.out.println("0148의 총 주차 시간은 "+min+"분");
		int pay = me.pay(min);
		System.out.println("0148의 총 주차 요금은 "+pay+"원");
	}
	
	public int pay(int min) {
//		기본 시간(분)	기본 요금(원)	단위 시간(분)	단위 요금(원)
//		180			5000		10			600
		
		int pay = min<=180 ? 5000 : (min-180)/10*600+5000;
		return pay;
//		if(min<=180) return 5000;
//		min = min-180;
//		min = min/10;
//		return 5000+min*600;
		
	}
	
	
	public int getMin(List<Map<String, String>> l, String number) {
		//선택된 차량 값 담아보기
		ArrayList<Map> selectList = new ArrayList();
		
		//list에서 for문을 이용해 map 값 꺼내기
		for(Map m : l) {
			//map에서 차량 번호 값 꺼내기
			String car_no = (String) m.get("차량 번호");
			//map 값이 number랑 같은지 비교하기
			//아닐 경우 continue하기(같은 number값만 담기)
			if(!car_no.equals(number)) continue;
//			System.out.println(m);
			selectList.add(m);
		}
		String in = "";
		String out = "";
		
		int result = 0;
		//원하는 number의 입,출차 시간 꺼내기
		System.out.println();
		for(int i=0; i<selectList.size(); i++) {
//			System.out.println(selectList.get(i));
			Map m = selectList.get(i);
			String time = (String) m.get("시각");
//			System.out.println(time);
			
			//내역이 입차라면 in에 시간 입력
			String inout = (String) m.get("내역");
			if(inout.equals("입차")) in = time;
			//내역이 출차라면 out에 시간 입력
			if(inout.equals("출차")) {
				out = time;
				//내역이 출차일 경우 주차시간 구하기
				int t1 = getTime(in);
				int t2 = getTime(out);
				result += t2-t1;	//(입차-출차)가 1set이상일 수도 있으니까 더하기로 담기
//				System.out.println(result);
			}
		}
		return result;
	}

	
	public int getTime(String t) {
		String[] token = t.split(":");
		
		//token[0]값 숫자로 변환해서 넣기
		int hour = 0;
		hour = Integer.parseInt(token[0]);
		
		//token[1]값 숫자로 변환해서 넣기
		int min = 0;
		min = Integer.parseInt(token[1]);
		
		return hour*60+min;
	}
	
	
	public void printAll(List<Map<String, String>> l) {	//print니까 return할게 없어서 void
		/*
		 * 전체 값 출력 해볼 것
		 */
		for(int i=0; i<l.size(); i++) {
			Map<String, String> m = l.get(i);
			Iterator<String> it = m.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				String value = m.get(key);
				System.out.print(key+", "+value+"\t");
			}
			System.out.println();
		}
	
	}
	
	public List<Map<String, String>> dataInput(){
		
//		시각            차량 번호	 내역
//		05:34	5961	 입차
//		06:00	0000	 입차
//		06:34	0000	 출차
//		07:59	5961	 출차
//		07:59	0148	 입차
//		18:59	0000	 입차
//		19:09	0148	 출차
//		22:59	5961	 입차
//		23:00	5961	 출차
		
		HashMap m1 = new HashMap();
		m1.put("시각", "05:34");
		m1.put("차량 번호", "5961");
		m1.put("내역", "입차");
		
		HashMap m2 = new HashMap();
		m2.put("시각", "06:00");
		m2.put("차량 번호", "0000");
		m2.put("내역", "입차");
		
		HashMap m3 = new HashMap();
		m3.put("시각", "06:34");
		m3.put("차량 번호", "0000");
		m3.put("내역", "출차");
		
		HashMap m4 = new HashMap();
		m4.put("시각", "07:59");
		m4.put("차량 번호", "5961");
		m4.put("내역", "출차");
		
		HashMap m5 = new HashMap();
		m5.put("시각", "07:59");
		m5.put("차량 번호", "0148");
		m5.put("내역", "입차");
		
		HashMap m6 = new HashMap();
		m6.put("시각", "18:59");
		m6.put("차량 번호", "0000");
		m6.put("내역", "입차");
		
		HashMap m7 = new HashMap();
		m7.put("시각", "19:09");
		m7.put("차량 번호", "0148");
		m7.put("내역", "출차");
		
		HashMap m8 = new HashMap();
		m8.put("시각", "22:59");
		m8.put("차량 번호", "5961");
		m8.put("내역", "입차");
		
		HashMap m9 = new HashMap();
		m9.put("시각", "23:00");
		m9.put("차량 번호", "5961");
		m9.put("내역", "출차");
		
		ArrayList l = new ArrayList();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		l.add(m6);
		l.add(m7);
		l.add(m8);
		l.add(m9);
		
		return l;
	}
}
