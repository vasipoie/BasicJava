package kr.or.ddit.study02;

public class TypeChange {
	public static void main(String[] args) {
		
		int i = 10;
		long l = i;
		System.out.println("롱 타입 입니다."+l);
		
//		long l = (long)i;    int i 값을 long 으로 변환
//		7줄은 long>int 자동으로 변환
		
		
		long l2 = 1000;
		int i2 = (int)l2;
		System.out.println("인트 타입 입니다."+i2);
		
		//타입 변환시 범우 밖을 넘기게 되면 문제가 발생하기 때문에 강제 타입 변환을 하도록 유도함
		//오버플로우
		long l3 = 1000000000000L;		//끝에 L이 없으면 에러
		int i3 = (int)l3;
		System.out.println("인트 타입 입니다."+i3);
		
		
		//실수형->정수형 : 소수점 날아감
		double d4 = 3.412;
		int i4 = (int)d4;
		System.out.println("더블 -> 인트 변환입니다. "+i4);
		
		int i5 = 4;
		double d5 = i5;
		System.out.println("인트 -> 더블 변환입니다. "+d5);
		
		
		//char<int
		char c6 = 'a';
		int i6 = c6;
		System.out.println("char -> int 변환입니다. "+i6);
		
		int i7 = 41300;
		char c7 = (char)i7;
		System.out.println("int -> char 변환입니다. "+c7);
		
		
		int i8 = c6-32;
		char c8 = (char)i8;
		System.out.println("int 숫자값은 " +i8);
		System.out.println("int -> char 변환입니다. "+c8);
		
		
		//소문자 a로 변환할 것
		char c9 = 'A';
		int i9 = c9+32;
		char c10 = (char)i9;
		System.out.println(c10);
		
		
		
		
	}
}
