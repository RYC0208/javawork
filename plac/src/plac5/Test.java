package plac5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
Scanner sc = new Scanner ( System.in);
	System.out.println("등록할 아이디: ");
	String username = sc.next();
	System.out.println("등록할 비밀번호: ");
	String userpass = sc.next();
	LoginSystem log = new LoginSystem(username, userpass);
	System.out.println("회원가입에 완료 했습니다.");
	log.perlog();
	
	}

}
