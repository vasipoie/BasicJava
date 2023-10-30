package kr.or.ddit.study05;

import java.util.Arrays;

public class ObjectArrayExample2 {
	public static void main(String[] args) {
//		String[] stuName = {"홍길동","강감찬","이성계","이순신","정몽주"};		
//		int[][] score = {{80, 70, 80, 0, 0, 1},
//						 {90, 85, 90, 0, 0, 1},
//						 {90, 70, 75, 0, 0, 1},
//						 {65, 75, 70, 0, 0, 1},
//						 {80, 80, 70, 0, 0, 1}};
		
		Student[] sArr = new Student[5];
		sArr[0] = new Student("홍길동", 80, 70, 80, 0, 0, 1);	//sArr은 Student라는 클래스를 담고 있음
		sArr[1] = new Student("강감찬", 90, 85, 90, 0, 0, 1);
		sArr[2] = new Student("이성계", 90, 70, 75, 0, 0, 1);
		sArr[3] = new Student("이순신", 65, 75, 70, 0, 0, 1);
		sArr[4] = new Student("정몽주", 80, 80, 70, 0, 0, 1);
		
		for (int i = 0; i < sArr.length; i++) {
//			System.out.println(sArr[i]);
		}
//		sArr[0].sum = sArr[0].kor+sArr[0].eng+sArr[0].math;
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].sum = sArr[i].kor+sArr[i].eng+sArr[i].math;
		}
		
		for (int j = 0; j < sArr.length; j++) {
			sArr[j].avg = (double)sArr[j].sum/3;
		}
		
		for (int i = 0; i < sArr.length; i++) {	//i는 본인배열
			for (int j = 0; j < sArr.length; j++) {	//j는 비교할 배열
				//총점 비교 후 값이 더 작으면 등수를 증가시킨다.
				if(sArr[i].sum < sArr[j].sum) {
					sArr[i].rank+=1;
				}
			}
		}
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
}
class Student{
	//5명의 3과목(국, 영, 수 점수) 성적과 이름을 선언 저장하고
	//총점과 평균과 등수를 구하여 출력하시오.
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	public Student(String name, int kor, int eng, int math, int sum, double avg, int rank) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
		this.rank = rank;
	}//alt + shift + s - constructor using fields
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
	
	
}
