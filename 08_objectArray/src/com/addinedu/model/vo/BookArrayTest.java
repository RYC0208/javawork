package com.addinedu.model.vo;

import java.util.Scanner;

public class BookArrayTest {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Book[] books = new Book[3];

	for(int i=0; i<books.length; i++) {
		System.out.println(i+1+"번째 도서 정보 입력: ");
		
		System.out.println("도서명 입력:");
		String title = sc.nextLine();
		System.out.println("저자 입력:");
		String author = sc.nextLine();
		System.out.println("가격 입력:");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("출판사 입력:");
		String publisher = sc.nextLine();
	
		//배열에 객체 입력
		books[i] = new Book(title, author,price,publisher);
	}

	System.out.println("검색할 책 제목: ");
	String search = sc.nextLine();
	
	while(true) {
		boolean found = false;
	for(int i=0; i<books.length; i++) {
		if(books[i].gettitle().equals(search)) {
			System.out.println(books[i].information());
			 found = true;
		break;
		}		
	}	
	
	if (!found) {
		System.out.println("잘못된 입력입니다");
		} 
	found = false;
	}
	
	}
}