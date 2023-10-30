package kr.or.ddit.study03.homework;

public class test {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		
		int start;
		for(int i=0; i<5; i++) {
			start = 1;
			for(int j=0; j<5; j++) {
				System.out.print(start);
				start++;
			}	
			System.out.println();
//			start++;
		}
		
		
		System.out.println("-------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
	}

}
