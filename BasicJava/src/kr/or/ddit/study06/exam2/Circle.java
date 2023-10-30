package kr.or.ddit.study06.exam2;

public class Circle {
	/*
	 * x, y, (double)반지름 선언
	 */
	
	int x;
	int y;
	double r;
	double area;
	double round;
	
	public Circle(int x, int y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.area = 3.14*r*r;
		this.round = 3.14*2*r;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", 반지름=" + r + ", 넓이=" + area + ", 둘레=" + round + "]";
	}

	
	
	
}
