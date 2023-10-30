package kr.or.ddit.study03;

public class AssignOperator {
	public static void main(String[] args) {
//		= : '=' 오른쪽의 값을 '=' 왼쪽에 저장. 우선순위가 가장 낮다
//		'='과 다른 연산자가 결합
//		a = a+b		a+=b
//		a = a*b		a*=b
//		a = a/b		a/=b
//		a = a-b		a-=b
//		a = a%b		a%=b
		
		int a = 10;
		int b = 4;
		System.out.println("a=a+b ==" + " a+=b -> " + (a+=b));
		System.out.println("a = "+a);
		
		System.out.println("a=a-b ==" + " a-=b -> " + (a-=b));
		System.out.println("a=a*b ==" + " a*=b -> " + (a*=b));
		System.out.println("a=a/b ==" + " a/=b -> " + (a/=b));
		System.out.println("a=a%b ==" + " a%=b -> " + (a%=b));
		
		System.out.println("a = "+a);
		
	}
}
