package abs02;

import java.util.Scanner;

public class FolderPhone extends Phone {
Scanner sc = new Scanner (System.in);
String Message;
String owner;
	FolderPhone(String owner) {
		super(owner);
		this.owner = owner;
		
	}@Override
	public void turnon() {
		System.out.println("폴더폰 켜짐.");
	}@Override
	public void turnoff() {
		System.out.println("폴더폰 꺼짐.");
		
	}public void Message(){
		
		System.out.println("전송할 문자를 입력하세요: ");
		String Message = sc.nextLine();
		this.Message = Message;
		System.out.println("문자가 전송되었습니다");

	}@Override
	public void infor() {
		System.out.println("폴더폰 주인: "+owner+", 최근 보낸메세지:"+Message);
	
}
}
