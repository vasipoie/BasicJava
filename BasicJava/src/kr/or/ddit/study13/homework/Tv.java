package kr.or.ddit.study13.homework;

public class Tv {
	String maker = "SAMSUNG";
	int year = 2023;
	int inch = 86;
	
	@Override
	public String toString() {
		return "Tv [maker=" + maker + ", year=" + year + ", inch=" + inch + "]";
	}


	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv);
	}
}
