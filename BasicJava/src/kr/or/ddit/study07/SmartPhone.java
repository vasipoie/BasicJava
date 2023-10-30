package kr.or.ddit.study07;

public class SmartPhone extends Phone{

	public void internet() {
		System.out.println("인터넷 검색");
	}
	
	public void touch() {
		System.out.println("터치 동작");
	}
	
	@Override //부모클래스에 있는거 재구현
	public void camera() {
		super.camera();	//super = 부모기능
		System.out.println("1000만 화소 카메라");
	}
	
}
