package kr.or.ddit.study06.exam2;

public class Rectangle {
	/*
	 * int x, y 선언
	 * 높이 넓이 선언 해볼것
	 * 
	 * 생성자 구현해볼것
	 */
	
	int x;
	int y;
	int height;
	int width;
	int area;
	
	public Rectangle(){	//기본생성자. {}에 아무것도 없음.
		
	}
	
	
	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.area = height*width;
	}


	@Override
	public String toString() {
		return "Rectangle [x 좌표는 " + x + ", y 좌표는 " + y + ", 높이는 " + height + ", 너비는 " + width + ", 넓이는 " + area + "]";
	}
	
	
	
}
