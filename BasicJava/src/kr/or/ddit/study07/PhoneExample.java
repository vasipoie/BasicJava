package kr.or.ddit.study07;

public class PhoneExample {
	public static void main(String[] args) {
		System.out.println("-------------그냥 폰-----------");
		Phone phone = new Phone();
		phone.tell();
		phone.camera();
		
		System.out.println("-------------폴더폰-----------");
		FolderPhone fp = new FolderPhone();
		fp.fold();
//		fp.tell();
		
		System.out.println("-------------스마트폰-----------");
		SmartPhone sp = new SmartPhone();
		sp.tell();
		sp.internet();
		sp.touch();
		sp.camera();
	}
}
