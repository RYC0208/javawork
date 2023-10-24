package Str01;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		String name = "노용철";
		String hobby = "공부안하기";
		System.out.println(name);
		System.out.println(name == hobby);
		
		System.out.println();				
		
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);
		String str5 = "노용철";
		System.out.println("-----------");		
		System.out.println(name == str5);
		
		System.out.println("-----------");
		
		String str3 = new String("java");
		String str4 = new String("java");  // new가 들어갔을댄 객체를 새로 생성한다 따라서 주소가 바뀌기 때문에 문자열이 같아도
		Scanner sc = new Scanner(System.in);// 서로 다르다는 결과 값이 나옴
		System.out.println("sts3과 str4의 주소가 같은가 ?"+str3==str4);
		
		System.out.println("sts3과 str4의 값이 같은가 ?"+str3.equals(str4));
	}

}
