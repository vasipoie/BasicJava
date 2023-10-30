package kr.or.ddit.study06.exam5;

public class SingleTonCall {
	public static void main(String[] args) {
		SingleTon singleTon = SingleTon.getInstance();
		
		singleTon.a = 100;
		System.out.println(singleTon.a);
		SingleTon singleTon2 = SingleTon.getInstance();
		
		//singleTon이랑 2랑 동일한 객체
		System.out.println(singleTon2.a);
	}
}
