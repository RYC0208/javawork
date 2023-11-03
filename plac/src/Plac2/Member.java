package Plac2;

public class  Member  {
 private String name;  //회원 이름
 private  int age;		//회원 나이
 private  char gender;	//회원 성별

	
 public	Member(){		
	}
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public 	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
