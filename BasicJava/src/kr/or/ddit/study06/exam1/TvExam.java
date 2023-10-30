package kr.or.ddit.study06.exam1;

public class TvExam {
	public static void main(String[] args) {
		Tv t1 = new Tv();	//class명 변수명 = new 클래스명();
		t1.company = "LG";	//변수명.class에서 만든 변수명
		t1.year = 2021;
		t1.size = 81.5;
		
		Tv t2 = new Tv();
		t2.company = "samsung";
		t2.year = 2022;
		t2.size = 60;
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
}
