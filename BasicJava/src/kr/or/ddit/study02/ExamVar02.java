package kr.or.ddit.study02;

public class ExamVar02 {
	public static void main(String[] args) {
		
		
		//소문자 a로 변환할 것
		char c9 = 'A';
		int i9 = c9+32;
		char c10 = (char)i9;
		System.out.println(c10);
		
		
		//변수사용 : 1년은 365.2422일이다. 이것을 xxx일 xx시간 xx분 xx초로 나타내라
		//1년은 365일 5시간 48분 46초이다		
		double year = 365.2422;
		
		int days = (int)year;
		System.out.println("1년은 "+days+"일 이다.");
		
		double hour = (year-days)*24;	//0.2422을 시간으로 바꾸려고 24시간을 곱함 = 5.8128
		int hour1 = (int)hour;
		System.out.println("1년은 "+days+"일 "+hour1+"시간 이다.");
		
		double min = (hour-hour1)*60;	//0.8128을 분으로 바꾸려고 60을 곱합 = 48.768
		int min1 = (int)min;
		System.out.println("1년은 "+days+"일 "+hour1+"시간 "+min1+"분 이다.");
		
		double sec = (min-min1)*60;		//0.768을 초로 바꾸려고 60을 곱함 = 46.08
		int sec1 = (int)sec;
		System.out.println("1년은 "+days+"일 "+hour1+"시간 "+min1+"분"+sec1+"초 이다.");
		
		
		
	}
}
