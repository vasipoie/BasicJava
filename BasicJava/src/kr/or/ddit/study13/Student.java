package kr.or.ddit.study13;

public class Student {
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
	}
		@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	

}
