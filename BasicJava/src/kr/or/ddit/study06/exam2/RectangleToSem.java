package kr.or.ddit.study06.exam2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class RectangleToSem extends JFrame{
	/*
	 * int x, y 선언 
	 * 높이 가로 선언 해볼것
	 * 
	 * 생성자 구현해볼것
	 * 
	 */
	void paintJPanelEx(){
        this.setTitle("JPanel paintComponent 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setSize(250,200);
        this.setVisible(true);
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(x, y, width, height);
        }
    }
	
	
	int x; 
	int y;
	int height;
	int width;
	int area;
	
	RectangleToSem(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width  = width;
		this.area   = height*width;
	}

	@Override
	public String toString() {
		return "Rectangle [x 좌표는=" + x + ", y 좌표는=" + y + ", 높이=" + height + ", 너비=" + width + ", 넓이=" + area + "]";
	}
	
	
	

}
