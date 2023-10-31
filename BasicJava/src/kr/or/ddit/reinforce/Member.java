package kr.or.ddit.reinforce;

public class Member {

	//필드
	public String id;
	private String pass;
	private String name;
	private String addr1;
	private String addr2;	//상세주소
	int age;
	
	
	//게터세터 VO객체 - 필드 값을 사용할 수 있게
	//private - 외부에서 필드값 접근 못하게 막는 제어자. 내부에서만 호출됨
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("0이하는 입력불가");
			return;
		}
		this.age = age;	//this는 본인 클래스.
		
		
	}
	public Member(String id, String pass, String name, int age) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	
	public Member() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
