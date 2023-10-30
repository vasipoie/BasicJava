package kr.or.ddit.study11;

public class MathExample {
	public static void main(String[] args) {
		//0~1 사이 값
		double ran = Math.random();
		System.out.println(ran);
		
		//절대값, double, int, long, float 등을 사용할 수 있게 오버로딩 되어서 지원됨
		int abs = Math.abs(-10);
		System.out.println(abs);
		
		int a = 30;
		int b = 10;
		int max = Math.max(a,b);
		System.out.println(max);
		int min = Math.min(a,b);
		System.out.println(min);
		
		//2^4
		double pow = Math.pow(2, 4.4);
		System.out.println(pow);
		
		//로그값
		double log10 = Math.log10(100);
		System.out.println(log10);
		
		//제곱근(루트)
		double sqrt = Math.sqrt(100);
		System.out.println(sqrt);
		
		double sqrt2 = Math.sqrt(2);
		System.out.println(sqrt2);
		
		//반올림
		double var = 13.541213;	//2째 자리에서 반올림하고싶을때
		double round = Math.round(var*10);
		System.out.println(round/10);
		
		double round2 = Math.round(var);
		System.out.println(round2);
		
		double round3 = roundN(var, 4);
		System.out.println(round3);
		
	}
	
	public static double roundN(double var, int n) {
		double pow = Math.pow(10, n-1);
		return Math.round(var*pow)/pow;
	}
}
