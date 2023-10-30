package kr.or.ddit.study08;

public class LoginImple implements ILogin{ //인터페이스를 구현한 구현체

	@Override
	public boolean login(String id, String pass) {
		System.out.println("스캐너를 통해 로그인 구현");
		
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sign(String id, String pass, String name, String tell) {
		// TODO Auto-generated method stub
		return false;
	}	

}
