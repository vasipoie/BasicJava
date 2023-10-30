package kr.or.ddit.study03;

public class UnaryOperator {
	public static void main(String[] args) {
		// 부호 연산자
//		int num = 100;
//		int res1 = -num;
//		
//		System.out.println("num\t"+num);
//		System.out.println("res1\t"+res1);
		
		// 증감 연산자
		//++변수	다른연산을 수행하기 전에 1을 증가 시킴
		//변수++	다른연산을 수행한 후에 1을 증가 시킴
		//--변수	다른연산을 수행하기 전에 1을 감소 시킴
		//변수--	다른연산을 수행한 후에 1을 감소 시킴
		
		int value = 10;
		int res   = ++value;
		System.out.println("value\t"+value);
		System.out.println("res\t"+res);
		
		
		
		
		System.out.println("-----------");
		
		value = 10;
		res   = value++;	//res값에 10이 먼저 들어가고, 그 다음에 value가 1 증가
		System.out.println("value\t"+value);
		System.out.println("res\t"+res);

		
		
		
		System.out.println("-----------");
		
		value = 10;
		res   = --value;	
		System.out.println("value\t"+value);
		System.out.println("res\t"+res);
		
		

		System.out.println("-----------");
		
		value = 10;
		res   = value--;	//res값에 10이 먼저 들어가고, 그 다음에 value가 1 감소
		System.out.println("value\t"+value);
		System.out.println("res\t"+res);
		
		
		
		System.out.println("-----------");
		
		boolean b = true;
		
		System.out.println("b="+b);
		System.out.println("b="+!b);
		
		
		
		
		
		
	}
}
