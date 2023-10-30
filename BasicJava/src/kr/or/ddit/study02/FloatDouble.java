package kr.or.ddit.study02;

public class FloatDouble {
	public static void main(String[] args) {
		
//		1. float : 4byte(부호(1bit), 지수(8bit), 가수(23bit))
//			끝에 f 추가
//		2. double : 8byte(부호(1bit), 지수(11bit), 가수(52bit))
		
		float  f1 = 3.141562f;
		double d1 = 3.141562;
		
		//변환 오차 발생
		if(f1 == d1) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");		//지수를 비교하면 다르니까
		}
	
		
		
	}
}
