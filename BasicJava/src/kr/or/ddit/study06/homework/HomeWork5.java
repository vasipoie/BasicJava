package kr.or.ddit.study06.homework;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 멤버 클래스를 5명 배열을 선언 후
		 * 배열에 5명 저장 할것.
		 * 
		 */
		
		Member[] mArr = {
			new Member("kye","1234","0.권예은"),
			new Member("knh","1234","1.김나혜"),
			new Member("kys","1234","2.김영상"),
			new Member("ktw","1234","3.김태원"),
			new Member("sys","1234","4.성이수"),
		};
		
		/*
		 * 멤버중 한명 선택후 
		 * 아이디와 비밀번호를 입력해서 맞을 경우 
		 * -> 로그인 성공
		 * 실패 할경우 
		 * -> 아이디 , 비밀번호 일치 하지 않음 출력 
		 * 
		 */
		
		// 멤버 이름 출력 
		for(int i=0; i<mArr.length;i++) {
			System.out.print(mArr[i].name+"\t");
		}
		System.out.println();
		// 멤버 배열 선택
		System.out.print("로그인 할 멤버 번호를 입력하세요.");
		int select = sc.nextInt();
		
//		Member selM = mArr[select];	//select를 다른 변수로 재해석
		
		while(true) {
			// 아이디 
			System.out.print("아이디를 입력하세요.");
			String id = sc.next();
			System.out.print("비번을 입력하세요.");
			String pass = sc.next();
			// 비밀번호 
			// 비교문 통과 여부 확인.
			/*
			 * if(equals, &&)
			 */
			if(id.equals(mArr[select].id)&&pass.equals(mArr[select].pass)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
}
class Member {
	String nation;
	String group;
	String id;
	String pass;
	String name;
	

	public Member(String nation, String group, String id, String pass, String name) {
		this.nation = nation;
		this.group = group;
		this.id = id;
		this.pass = pass;
		this.name = name;
	}

	public Member(String id, String pass, String name) {
		this("한국","403호",id,pass,name);
	}

	@Override
	public String toString() {
		return "Member [nation=" + nation + ", group=" + group + ", id=" + id + ", pass=" + pass + ", name=" + name
				+ "]";
	}
	
	/*
	 * 국가 = 한국 
	 * group = 403호	 를 기본으로 하고 
	 * id , pass, name를 입력 가능하도록 하는    
	 * Member 생성자를 만들자.
	 * 
	 */
	
	/*
	 * toString 메소드를 통해 값을 바로 출력하도록 할것.
	 */
	
}
