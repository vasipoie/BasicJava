package kr.or.ddit.study06.exam2;

public class Car {
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	
	
	public Car(String model) {
		this(model, "은색", 250);
		System.out.println("model 코드");
	}
	
	public Car(String model, String color) {
		this(model, color, 300);
		System.out.println("model, color 코드");
	}

	public Car() {
		System.out.println("기본생성문");
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("공통실행코드");
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
