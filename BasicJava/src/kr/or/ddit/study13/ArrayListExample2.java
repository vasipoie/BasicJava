package kr.or.ddit.study13;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		Student[] sArr = new Student[5];
		Student s1 = new Student("홍길동", 80, 70, 80, 0, 0, 1);
		Student s2 = new Student("강감찬", 90, 85, 90, 0, 0, 1);
		Student s3 = new Student("이성계", 90, 70, 75, 0, 0, 1);
		Student s4 = new Student("이순신", 65, 75, 70, 0, 0, 1);
		Student s5 = new Student("정몽주", 80, 80, 70, 0, 0, 1);
		
		ArrayList al = new ArrayList();
		al.add(s1);	//클래스 자체도 ArrayList에 넣을 수 있음
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		
		System.out.println("리스트의 사이즈 : "+al.size());
		
		//Object = 모든 클래스의 최상위 클래스. 모든걸 포함함
		for(Object s : al) {
			System.out.println(s);
		}
		System.out.println();
		
		Student s6 = new Student("정몽주1", 80, 80, 70, 0, 0, 1);
		al.add(s6);
		al.remove(2); //==al.remove(s3);
		
		for(Object s :al) {
			System.out.println(s);
		}
		
		System.out.println();
		
		if(al.contains(s3)) {
			System.out.println(s3+"s3이 포함됨");
		}
		if(al.contains(s2)) {
			System.out.println(s2+"s2이 포함됨");
		}
	}
}
