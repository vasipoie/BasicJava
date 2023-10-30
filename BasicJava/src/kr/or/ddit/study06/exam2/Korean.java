package kr.or.ddit.study06.exam2;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	//기본생성자
	public Korean() {
		
	}

	//일반생성자 1번생성자
	public Korean(String nation, String name, String ssn) {
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
	}

	//일반생성자 2번생성자
	public Korean(String nation) {
		this.nation = nation;
	}

	//일반생성자 3번생성자
	public Korean(String name, String ssn) {
		this("한국");		//생성자는 순서 중요. 맨 위로
		this.name = name;
		this.ssn = ssn;
	}
	
	
	
}
