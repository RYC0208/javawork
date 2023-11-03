package list01;



public class Person {

	private String name;
	private int age;
	private String phone;
	private String address;

public Person(String name, int age, String phone, String address) {
	this.name = name;
	this.age = age;
	this.phone = phone;
	this.address = address;
	


 }@Override
 public String toString() {
	 return "이름: "+ name + ", 나이: "+age+", 핸드폰: "+phone+", 주소: "+address;
}
}
