package kr.or.ddit.study06.exam2;

public class Customer {
	// 아이디 비번 만들어보기
	String nation = "한국";	//계속 같은 값을 입력해야할 때 생성자에서는 nation을 만들지않음
	String id;
	String pw;
	String name;
	int age;
	
	public Customer() {
		System.out.println("기본 생성자 입니다.");
	}
	
	// 동일한 생성자명, 메소드 명에서 파라미터값만 달라지는 것을 오버로딩이라고 한다.
	public Customer(String id, String pw, String name, int age) {//생성자. 외부에서 입력된 데이터
		this.id = id;	//this:class내부에 있는 id.저장할, 생성된 공간, =뒤에 id:외부에서 입력받는 값(knh)
		this.pw = pw;
		this.name = name;
		this.age = age;
		
//		this(id,pw,name);	//아래 매개변수가 3개인 Customer라는 내부생성자를 불러옴
		System.out.println("1번 생성자");
	}
	
	public Customer(String id, String pw, String name) {
		this(id,pw,name,30);	//디폴트 값으로 준 1번 생성자
//		this.id = id;	
//		this.pw = pw;
//		this.name = name;
		System.out.println("2번 생성자");
	}

	@Override 	//부모클래스에서 구현되어있는것을 재구현
	public String toString() {
		return "Customer [nation=" + nation + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	
//	private Customer() {	//만들지 않아도 class에서 자동으로 만들어줌=기본 생성자
//		//private는 내부에서만 사용하는 생성자 = 외부에서 가져다 쓸 수 없음
//		
//	}
	
	
	
	
}
