package kr.or.ddit.study05;

import java.util.Scanner;

public class ObjectArrayExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ObjectArrayExample obj = new ObjectArrayExample();
		obj.method1();

	}

	private void method1() {
		Book book = new Book();
		book.price = 1000;
		book.title = "자바";
		book.writer = "신용권";
//		System.out.println(book);	
		
		Book book2 = new Book();	//Book : book2를 담기위한 타입. class를 만들때는 언제나 new:새로운 객체를 만듦
		book2.price = 1100;
		book2.title = "파이썬";
		book2.writer = "양형운";
//		System.out.println(book2);
		
		Book[] arr = new Book[2];
		arr[0] = book;
		arr[1] = book2;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


class Book{	//class=변수+method. 변수=값 저장하기 위함. 여러가지 타입의 객체를 만들 수 있음
	String title;	//title=속성=필드
	String writer;
	int price;
	@Override //alt + shift + s
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", price=" + price + "]";
	}
}