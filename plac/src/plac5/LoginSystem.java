package plac5;

import java.util.Scanner;

public class LoginSystem extends User {

	public LoginSystem(String username, String userpass) {
		super(username, userpass);
	
	}public void perlog() {
		Scanner sc = new Scanner ( System.in);
		for(int i=0; i<3; i++) {
			System.out.println("_____로그인_____");
			System.out.println("아이디: ");
			String username = sc.next();
			System.out.println("비밀번호: ");

			String userpass = sc.next();
				
			boolean log = Login(username,userpass);
		if(log)
			break;
		}
	}

}
