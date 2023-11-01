package Plac2;

public class Member  {
 private String name;  //회원 이름
 private  int age;		//회원 나이
 private  char gender;	//회원 성별

	
 public	Member(){		
	}
 public 	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		
		return "회원 이름:" + name + ", 회원 나이: "+ age +", 회원 성별: "+gender;
	}

}
