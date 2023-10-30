package kr.or.ddit.study02;

public class CharExample {
	public static void main(String[] args) {
//		char : 부호 없는 2byte 정수 0 ~ 65535
		
		// 작은 따옴표 사용
		char c1 = 'D';
		System.out.println("c1 = " +c1);
		
		char c2 = 98;
		System.out.println("c2 = "+c2);	//98이라는 문자는 b이다
		
		char c3 = 97;
		System.out.println("c3 = "+c3 +"\n");
		
		
		char x = 97;	//97=a
		System.out.println(x);
		
		char y = (char)(x+1);
		System.out.println(y);

		char z = (char)(x+2);
		System.out.println(z +"\n");
		
		
		System.out.println(x+", "+ y+", "+ z);
		System.out.println("a" + y + z);
		System.out.println("a + b + c");
		System.out.println();
		
		
		char n = 64;
		System.out.println(n);
		
		
	}
}
