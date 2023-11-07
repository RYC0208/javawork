package plac5;

public class User {
private String username;
private String userpass;
private int loginatt=0;
public User(String username, String userpass) {
	super();
	this.username = username;
	this.userpass = userpass;
}

public boolean Login(String entername, String enterpass) {
	if(loginatt>=3) {
		 System.out.println("로그인 횟수 초과 프로그램 종료");
		
		 }
	if(username.equals(entername)&&userpass.equals(enterpass)) {
		System.out.println("로그인 성공");
	
	}else {
	   loginatt++;
		System.out.println("남은 로그인 횟수: "+(3-loginatt));
		return false;
	}
	return false;
	
}
}