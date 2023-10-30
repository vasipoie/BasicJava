package kr.or.ddit.study08;

public interface ILogin {	//인터페이스는 직접 구현x
	public boolean login(String id, String pass);
	public boolean sign(String id, String pass, String name, String tell);
}
