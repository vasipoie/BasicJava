package kr.or.ddit.study02;

public class IntegerExample {
	public static void main(String[] args) {
		//정수형
		// 1 byte	: 1byte (-128 ~ 127)
		// 2 short	: 2byte (-32768 ~ 32767)
		// 3 int	: 4byte (-2147483648 ~ 2147483647)
		// 4 long	: 8byte (-2^63 ~ 2^63-1)
		
		
		byte b1 = 127;
		System.out.println("b1 = "+ b1);
		
//		byte b2 = 128; 컴파일에러. 범위 밖이어서
		
		
		short s1 = 128;
		System.out.println("s1 = "+ s1);
		
		//타입 변환
		short s2 = (short) (s1 +10);	//(short)는 타입변환. +10은 int라서 short인 s1과 연산할 수 없음
		System.out.println("s2 = "+s2);
		
		
		int var1 = 200;			//10진수
		int var2 = 0203;		//8진수 8bit
		int var3 = 0x74a;		//16진수
		int var4 = 0b11011;		//2진수
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		
		
		long l1 = 1000;
		long l2 = 10000000000L;		//int범위 밖이라서 뒤에 L을 붙임
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		
		
		int bita = 65;
		System.out.println("비타오백"+bita);
		
				
		
		
	}
}
