package kr.or.ddit.study06.exam2;

public class Triangle {
	/*
	 * x1, y1, x2, y2, x3, y3
	 */
	
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	double area;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
//		this.area = Math.abs((x1*y2+x2*y3+x3*y1)-(y1*x2+y2*x3+y3*x1))/2.0;
		
		int r1 = (x1*y2+x2*y3+x3*y1);
		int r2 = (y1*x2+y2*x3+y3*x1);
		this.area = Math.abs((r1-r2)/2.0);
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		/*
		 * p1에 x값 y값 꺼내서 x1, y1
		 */
		this(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);
	}

	@Override
	public String toString() {
		return "점 1의 좌표("+x1+","+y1+") "
			  +"점 2의 좌표("+x2+","+y2+") "
			  +"점 3의 좌표("+x3+","+y3+") "
			  +"넓이는 "+area;
	}
	
	
	
	
}
