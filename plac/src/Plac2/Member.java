package Plac2;

public class Member implements LibraryController {
	String name;  //회원 이름
	int age;		//회원 나이
	char gender;	//회원 성별
	String mem;
	
	Member(){		
	}
	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}public String toString() {
		
		return "회원 이름:" + name + ", 회원 나이: "+ age +", 회원 성별: "+gender;
	}

}
