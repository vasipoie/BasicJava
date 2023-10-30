package kr.or.ddit.study08;

import java.util.Scanner;

public class BoardImple implements IBoard {

	@Override
	public void writeBoard(String title, String content, String id) {
		
		//첫번째
		//디비에서 이름 가져오기
		boolean phoneChk = false;
		
		//id null일 경우 로그인 시키기
//		ILogin login  = new LoginImple();	//인터페이스 변수명 = new 실제구현체
		ILogin login = null;
		if(phoneChk) {
			login = new MobileLoginImple();	
//			MobileLoginImple login2 = new MobileLoginImple();	//인터페이스를 안쓰면 이렇게 생성
		}
		else {
			login = new LoginImple();
		}
		
		
		Scanner sc = new Scanner(System.in);
		if(id==null)
		id = sc.next();
		String pass = sc.next();
		login.login(id, pass);	//인터페이스로 해놨으니까 구현된 것 처럼 일단 쓰면됨
		
	}

}
