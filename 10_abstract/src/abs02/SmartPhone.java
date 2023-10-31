package abs02;

import java.util.Scanner;

public class SmartPhone extends Phone {
Scanner sc = new Scanner(System.in);
String owner;
String search;
SmartPhone(String owner){
	super(owner);
	this.owner = owner;
}
@Override
public void turnon() {
	System.out.println("스마트폰 켜짐.");
	
}@Override
public void turnoff() {
	System.out.println("스마트폰 꺼짐.");
	
}public void search(){
	
	System.out.println("검색 할 내용을 입력: ");
	String search = sc.nextLine();
	this.search =search;
	System.out.println(search+"을 검색합니다");

}@Override
public void infor() {
	System.out.println("스마트폰 주인: "+owner+", 최근 검색어:"+search);

}
}