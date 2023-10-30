package kr.or.ddit.study10;

import java.nio.file.Files;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *		예외 클래스 생성
 *		 - class 클래스명 extend Exception
 *			클래스명(){
 *				super("예외 메세지");
 *			}
 */
public class ExceptionExample04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("닉네임 입력 : ");
		String nickName = sc.nextLine();
	
		try {
			if(nickName.contains("18")) {
				throw new NickNameException();
			}
			if(nickName.length()>10) {
				throw new NickNameLengthException();
			}
		} catch (NickNameException e) {	//catch (Exception e) 로 처리하면, 모든 에러가 다 모임
			System.out.println(e);
		}
		catch (NickNameLengthException e) {
			System.out.println("길이가 너무 깁니다.");
		}
		
		
	}
}
/*
 * 사용자 정의 에러. 사용자가 직접 정의함
 */
class NickNameLengthException extends RuntimeException{
	public NickNameLengthException() {
		super("닉네임 길이가 너무 깁니다");
	}
}

class NickNameException extends RuntimeException{
	public NickNameException() {
		super("부적절한 닉네임입니다.");
	}
}