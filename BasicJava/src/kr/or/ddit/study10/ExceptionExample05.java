package kr.or.ddit.study10;

import java.io.IOException;
import java.nio.file.Files;

public class ExceptionExample05 {
	public static void main(String[] args) {
		try {
			Files.readAllLines(null);
		} catch (IOException e) {	//IOException은 자바에서 꼭 Exception하라고 에러가 뜸
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
