package kr.or.ddit.study06.exam2;

public class CustomerExam2 {
	public static void main(String[] args) {
		/*
		 * 같은 줄 학생 이름 넣어서 클래스 배열 생성해 볼 것
		 */
		
//		Customer[] cArr = new Customer[4];
//		cArr[0] = new Customer("kye", "1234", "권예은", 28);
//		cArr[1] = new Customer("knh", "1234", "김나혜", 27);
//		cArr[2] = new Customer("kys", "1234", "김영상", 30);
//		cArr[3] = new Customer("ktw", "1234", "김태원", 29);
		
		Customer[] cArr = {
			new Customer("kye", "1234", "권예은", 28),
			new Customer("knh", "1234", "김나혜", 27),
			new Customer("kys", "1234", "김영상", 30),
			new Customer("kth", "1234", "김태현", 29)
		};
		
	}
}
