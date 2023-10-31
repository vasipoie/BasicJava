package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar, Date, SimpleDateFormat 날짜처리
 *
 */
public class DateExample {
	static boolean debug = true;	//개발단계에서 확인 후 false로 변경
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.dateMethod1();
//		de.dateMethod2();
//		de.dateMethod3();
		de.dateMethod4();
//		de.dateMethod5();
	}

	/*
	 * 날짜 더하는거는 Calendar객체 사용
	 */
	public void dateMethod5() {
		Calendar cal = Calendar.getInstance();	//싱글톤
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.DATE, 1);
		Date date = cal.getTime();
		cal.add(Calendar.MONTH, 1); //변경할 수 있는건 enum타입으로 되어있음
		System.out.println(cal.getTime());
	}

	private void dateMethod4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		Date d = new Date();
		String dateStr = sdf.format(d);	//date->string
		System.out.println("dateStr : "+dateStr);
		System.out.println("d : "+d);
		Date d2 = new Date(d.getTime());
		System.out.println(d2);
		
		long time = 1000*60*60*24*7;	//1주일 뒤 시간
		d2 = new Date(d.getTime()+time);
		
		System.out.println(d2);
	}

	public void dateMethod3() {
		String dateStr = "2023-10-31 15:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date d  = sdf.parse(dateStr);	//string->date
			System.out.println(d);
			
			Date t = new Date();
			long curTime = t.getTime();
			long milSec = curTime - d.getTime();
			System.out.println(milSec+"ms");
			int sec = (int)milSec/1000;
			System.out.println(sec/60+"min");
//			System.out.println(sec+"sec");
//			int min = (int)sec/60;
//			System.out.println(min+"min");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void dateMethod1() {
		if(debug) System.out.println("dateMethod1");	//디버깅메세지 
//		String date = "2023-10-02";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = new Date();	//선언된 시점의 시간
		if(debug) System.out.println(d1);	//java server 시간
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		if(debug) System.out.println(d2);
		
		long time = d2.getTime() - d1.getTime();  //시차 (millisec)
		System.out.println(time);
		System.out.println((double)time/1000);	//나누기1000하면 sec단위
		
		System.out.println((double)d2.getTime()/1000);
		System.out.println((double)d1.getTime()/1000);
		
	}
	
	/*
	 * SimpleDateFormat
	 * 입력한 문자 형식을 date로 바꿔줌
	 */
	public void dateMethod2() {
		String dateStr = "2023/10/30";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date yesterday = sdf.parse(dateStr);
			System.out.println(yesterday);
			
			Date cur = new Date();
			long milSec = cur.getTime() - yesterday.getTime();
			System.out.println(milSec+"ms");
			int sec = (int)(milSec/1000);
			System.out.println(sec+"sec");
			int min = sec/60;
			System.out.println(min+"min");
			int hour = min/60;
			System.out.println(hour+"hour");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
