package kr.or.ddit.reinforce;

public class MemberVo {

	//필드
	static int call = 0;
	String id;
	String pass;
	String name;
	String addr1;
	String addr2;	//상세주소
	
	/*
	 *공통적으로 사용하고 싶은 데이터는 static
	 *객체가 여러개 만들어져도 동일하게 사용 
	 */
	
	//메소드
	public void call() {
		System.out.println(id+"\t"+name);
		System.out.println("call 메소드가 호출 되었습니다.");
		call++;		//call은 static. 일반 메소드에서는 call이 하나만 있는 변수니까 가져올 수 있음
		String return_call2 = call2("파라미터1");	//메소드끼리는 서로 호출 가능
		System.out.println("call 에서 받은 "+return_call2);
	}
	
	public String call2(String param1) {
		System.out.println("call2에서 "+param1);
		System.out.println("call2 메소드가 호출 되었습니다.");
		return "call2에서 보낸  리턴값.";
	}
	
	
	public static void test() {
//		id = "";	//static메소드에서는 일반 변수는 가져올 수 없다. static변수만 가져올 수 있음
//		call();		//call은 클래스에 포함된거. 10개가 생겼을때 어떤 메소드를 부르는건지 모르니까 못가져옴
	}
	
	//생성자
}
