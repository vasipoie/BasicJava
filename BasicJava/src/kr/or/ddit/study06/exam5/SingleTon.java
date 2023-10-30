package kr.or.ddit.study06.exam5;

/**
 * 디자인 패턴 중에 하나인 싱글톤
 * 
 * 클래스를 여러개 만들지 못하도록 방지함.
 */



public class SingleTon {
	
	private static SingleTon singleTon = null;
	
	//싱글톤 객체가 불러오기 전까지 a는 메모리를 안먹고. 호출될 때. 객체를 생성하는순간 메모리에 올림
	int a = 10;
	
	//외부에서 싱글톤 기본생성자 사용못하도록 막음
	private SingleTon() {
		try {
			Thread.sleep(3000);	//3초동안 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
		
	//static가 있어야 객체생성 없이도 부를 수 있음
	public static SingleTon getInstance() {
		System.out.println("객체가 호출 되었습니다.");
		if(singleTon == null) {
			singleTon = new SingleTon();	//객체가 1번만 생성됨
		}
		System.out.println("객체로드가 완료 되었습니다.");
		return singleTon;	//이미 싱글톤이 있으면 만들어진거 리턴
	}
}
