package kr.or.ddit.study06.exam2;

public class CustomerExam {
	public static void main(String[] args) {
//		Customer c1 = new Customer(); // Customer():생성자
//		c1.id = "knh";
//		c1.pw = "1234";
//		c1.name = "김나혜";
//		c1.age = 26;
		
		Customer c1 = new Customer("knh", "1234", "김나혜", 26);//변경하고싶은 일부 데이터만 입력
		System.out.println("-----------------");
		Customer c2 = new Customer("kye", "1234", "권예은");
		System.out.println("-----------------");
		//생성자를 따로 만들었을 경우 기본 생성자가 생성되지 않는다.
		Customer c3 = new Customer();
		System.out.println("-----------------");
		
		System.out.println(c1);
		System.out.println("-------------------");
		System.out.println(c2);
		System.out.println("-------------------");
		System.out.println(c3);
	}
}
