package kr.or.ddit.study06.exam4;

public class PersonVo {	//VO : 데이터 담을 수 있는 객체
	String name;
	int    age;
	String nation;
	
	//생성자
	public PersonVo(String name, int age, String nation) {
		this.name = name;
		this.age = age;
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "PersonVo [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	
	
	//게터세터(검증단계)
	//데이터 가져갈 때 사용
	public int getAge() {
		return age;
	}
	
	//데이터 입력할 때 사용
	public void setAge(int age) {
		if(age<0) {
			System.out.println("음수는 입력할 수 없습니다.");
		}else {
			this.age = age;
		}
//		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
}
