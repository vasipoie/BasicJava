package kr.or.ddit.reinforce;

public class Main2 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id = "enend";	//public은 외부에서 접근이 된다.
//		m1.pass = "ddd";	//private는 외부에서 접근이 안됨
		m1.setAge(-10);		//세터에서 이상한 입력을 막음. 만약 게터세터가 아니고 직접 입력했으면 무조건 입력됨.
		
		Member m = new Member();
		m.setId("test1");
		m.setPass("test1");
		m.setName("test1");
		m.setAge(20);
		
		Member m2 = new Member();
		m2.setId("test2");
		m2.setPass("test2");
		m2.setName("test2");
		m2.setAge(20);
		
		Member m3 = new Member("test3", "test3", "test3", 20);	//생성자 이용
		
		
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);
		
		
		
		
		
	}
}
