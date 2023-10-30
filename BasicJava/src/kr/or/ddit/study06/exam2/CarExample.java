package kr.or.ddit.study06.exam2;

public class CarExample {
	public static void main(String[] args) {
		Car ca = new Car();
		System.out.println("ca : "+ca);
		System.out.println();
		
		Car ca2 = new Car("자가용");
		System.out.println("ca2 : "+ca2);
		System.out.println();
		
		Car ca3 = new Car("화물", "검정색");
		System.out.println("ca3 : "+ca3);
		System.out.println();
		
		Car ca4 = new Car("자가", "흰색", 350);
		System.out.println("ca4 : "+ca4);
		System.out.println();
	}
}
