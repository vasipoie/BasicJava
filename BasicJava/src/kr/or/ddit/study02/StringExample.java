package kr.or.ddit.study02;

public class StringExample {
	public static void main(String[] args) {
		
//		문자와 문자열
//		문자 : 한글자로 '' 로 묶어서 선언 => char
//		문자열 : 복수개의 글자로 구성된 자료(데이터 타입은 아님)
//		""로 묶어 선언 => String
		
		
		String name = "홍길동";
		String name2 = new String("홍길동2");		//새로운 string 객체 생성
		String nameSum = name + ", " + name2;	//string + 문자열 + string
		System.out.println(nameSum);
		System.out.println();
		
//		\n : 개행 스크린 커서 위치를 다음줄의 처음으로 옮김
//		\t : 수평탭 스크린 커서를 다음 탭으로 옮김
//		\r : 캐리지리턴 스크린 커서의 위치를 현재 줄의 처음으로 옮김
//		\\ : 역슬래시 문자를 출력할 때 사용
//		\" : 큰따옴표를 출력할 때 사용
//		\' : 작은 따음표를 사용할 때 사용
//		\b : 백스페이스
		
		
		String nameEnter = name +"\n"+name2;
		System.out.println(nameEnter +"\n");
		
		String nameTab = name +"\t"+name2;
		System.out.println(nameTab +"\n");
		
		String nameTTA = "\""+name+","+name2+"\"";
		System.out.println(nameTTA +"\n");
		
		String year = "20"+23;	//+23은 int인데 string이 더 큰 범위라서 자동으로 문자로 바뀜
		System.out.println(year);
		
		String sDouble = "20"+20.3;
		System.out.println(sDouble);
		
		String sChar = "20"+'c';
		System.out.println(sChar);
		
		char c='a';
		String sChar2 = "20"+c;
		System.out.println(sChar2);
		
		
		
		
	}
}
