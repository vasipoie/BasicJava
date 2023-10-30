package kr.or.ddit.study11;

import java.io.File;

public class StringLang {
	public static void main(String[] args) {
		StringLang sl = new StringLang();
		sl.method1();
//		sl.method2();
//		sl.method3();
//		sl.method4();
//		sl.method5();
//		sl.method6();
//		sl.method7();
//		sl.method8();
	}

	private void method8() {//배열로 쪼개짐
//		String test = "스플릿 테스트 \n"
//                    +"test1 \n"
//				    +"test2 \n"
//				    +"test3 \n"
//				    +"test4 \n"
//				    +"test5 \n"
//				    +"test6 \n";
		
		String test = "스플릿 테스트,"
                +"test1 ,"
			    +"test2 ,"
			    +"test3 ,"
			    +"test4 ,"
			    +"test5 ,"
			    +"test6 ,";
		
		//라인 단위로 자르고 싶을 때
//		String line[] = test.split("\n");
		
		String line[] = test.split(",");
		System.out.println(test);
		for(String s : line) {
			System.out.println(s);
		}
		
	}

	private void method7() {	//null은 비어있는게 아니라 객체 자체가 생성되지 않은것.
		//string객체가 안만들어져서 에러뜨는것.
		String str = null;
		if(str==null || str.isEmpty()) {	//임의로 null도 비어있다고 하고싶을때. 순서바꾸면 안됨
			System.out.println("해당 문자열은 비어있습니다.");
		}
		
		if(str!=null && !str.isEmpty()) {	//비어있지않다면~
			
		}
	}

	private void method6() {
		String test = "가나다 가나다 가나다18";
		
		System.out.println(test);
		test = test.replace(" ", "");
		System.out.println(test);
		
//		test.replaceAll("정규식", replacement);	//규칙포함해서 해당하는 글자 바뀜
	}

	private void method5() {
		String test = "  공백 제거   \n \r \r\n";
		System.out.println(test);
		test = test.trim();	//앞뒤 공백제거
		System.out.println(test);
	}

	private void method4() {
		String test = "소문자 abcd";
		System.out.println(test);
		test = test.toUpperCase();
		System.out.println(test);

		if(test.contains("abcd")) {
			System.out.println("abcd값이 포함되어 있습니다.");
		}
		
		System.out.println("---------------------");
		
		String test1 = "대문자 ABCD";
		System.out.println(test1);
		
		test1 = test1.toLowerCase();
		System.out.println(test1);
	}

	private void method3() {	//파일 검사 할 때 주로 사용. 예)23년으로 시작하는 파일 검사
		String test = "문자열 test 입니다.";
		
		String start = "문자열";
		if(test.startsWith(start)) { //어떤 문자로 시작하는지.
			System.out.println(start + "로 시작됩니다.");
		}
		
		String end = "입니다.";
		if(test.endsWith(end)) {	//확장자 검사
			System.out.println(end + "로 끝납니다.");
		}
		//2023년으로 시작하는 엑셀 파일 개수를 구해보시오.
		
		int cnt = 0;
		
		File dir = new File("원하는 폴더 경로");
		for(String filename : dir.list()) {
			if(filename.startsWith("2023")) {
				
			}else continue;
			
			if(filename.endsWith(".xls") || filename.endsWith(".xlsx")){
				cnt++;
			}
		}
	}
	
	
	public void method2() {
		String test = "문자열 test 입니다.";
		String search = "test";
		
		if(test.contains(search)) {
			System.out.println(search + "값이 포함되어 있습니다.");
		}
		
		search = test;
		if(test.equals(search)) {
			System.out.println(search + "값이 동일합니다.");
		}
	}
	
	
	private void method1() {
		String test = "문자열 test 입니다.";
		
		for (int i = 0; i < test.length(); i++) {
			System.out.println(test.charAt(i));
		}
		
		System.out.println();
		
		//i값 필요할때 사용
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			System.out.println(ch[i]);
		}
		
		/*
		 * 향상된 포문
		 * 배열이나 리스트에서 사용됨
		 * char c <- 하위타입
		 * : <- 세미콜론(;)이 아님
		 * test.toCharArray() <- 배열 혹은 리스트
		 * for(char c : test.toCharArray()) {
		 * 
		 */
		
		//charArray 밑에 있는거는 char. 그래서 char c로 받음
		//i값 필요없이 반복문 돌리고 싶을때 사용
		for(char c : test.toCharArray()) {
			System.out.println(c);
		}
		
	}
}