package kr.or.ddit.study10;

public class ExceptionExample02 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {	//try문에서 실패한 구문이 catch로 넘어옴
			System.out.println("에러 발생");
		}catch (Exception e) {	//에러원인, 해결책은 각각의 catch에서 적용 가능
			System.out.println("에러 발생2");
		}
		System.out.println("?");	//try catch구문이 있으니까 오류가 나도 실행됨
	}
}
