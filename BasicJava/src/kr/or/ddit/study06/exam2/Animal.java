package kr.or.ddit.study06.exam2;

public class Animal {
	/*
	 * 동물 종, 동물 이름, 날 수 있는지 여부 
	 * 평균수명, 무게, 현재 나이
	 */
	String type;
	String name;
	boolean fly;
	int avgAge;
	int weight;
	int age;
	
	public Animal(String type, String name, boolean fly, int avgAge, int weight, int age) {
		this.type = type;
		this.name = name;
		this.fly = fly;
		this.avgAge = avgAge;
		this.weight = weight;
		this.age = age;
	}

	public Animal(Mammalia m, String name, int avgAge, int weight, int age) {
		this.type = m.type;
		this.name = name;
		this.fly = m.fly;
		this.avgAge = avgAge;
		this.weight = weight;
		this.age = age;
	}
	
	
}
