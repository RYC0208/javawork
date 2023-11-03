package object02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 while(true) {
 System.out.println("1. 모든 문자를 대문자로 변환\n2 문자열에서 문자가 몇번 출현하는지 횟수 반환\n3 글자 변경하기\n0 시스템 종료 (메뉴를 선택하세요): ");
 int num1 = sc.nextInt();
 sc.nextLine();
if(num1 == 1) {
	System.out.println("대문자로 변환할 문장을 입력하세요: ");
	String str = sc.nextLine();
	
	String upp = str.toUpperCase();
	System.out.println(upp+"로 변경되었습니다");
	}
	else if (num1 == 2) {
		int count = 0;
		System.out.print("문장을 입력하세요: ");
		String str = sc.nextLine();
		System.out.print("횟수를 반환할 문자를 입력하세요: ");
		char ch = sc.next().charAt(0);
		for(int i=0; i<str.length();i++) {
				if(ch==str.charAt(i)) {
					count++;
				}
		 
		}System.out.println(str+"에서 "+ch+"가 등장한 횟수는"+count+"번 입니다.");

		
	}else if (num1 ==3) {
		System.out.println("문장을 입력하세요: ");
		String str = sc.nextLine();
		System.out.println("문장에서 변경할 글자를 입력하세요: ");
		String str1 = sc.nextLine();
		System.out.println("새로운 글자를 입력하세요: ");
		String str2 = sc.nextLine();
		System.out.println(str.replace(str1, str2) );
		
	}else if (num1 == 0 ) {
		System.out.println("프로그램을 종료합니다");
		break;
	}
	
	}

		 
		 
	}

}
 	
//toUpper
//charCount 단어를 선택해서 문장에서 몇개가 나오는지
//strReplace