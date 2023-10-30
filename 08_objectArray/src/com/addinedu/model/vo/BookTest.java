package com.addinedu.model.vo;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			 Book Bb1 = new Book();
			 Book Bb2 = new Book("마이바티스 프로그래밍",
					 "이동국",28000,"둘빛미디어");
			 Bb1.settitle("혼자 공부하는 자바");
			 Bb1.setauthor("신용권");
			 Bb1.setprice(32000);
			 Bb1.setpublisher("한빛미디어");
			 
			 Book Bb3 = new Book();
			 System.out.println("책 제목을 입력:");
			 Bb3.settitle(sc.nextLine());
			 
			 System.out.println("저자를 입력하라!:");
			 Bb3.setauthor(sc.nextLine());
			 
			 System.out.println("가격 입력:");
			 Bb3.setprice(sc.nextInt());
			 sc.nextLine();
			 
			System.out.println("출판사 입력:");
			Bb3.setpublisher(sc.nextLine());
			 
			
			System.out.println("b1의 책 정보:"+Bb1.information());
			System.out.println("b2의 책 정보:"+Bb2.information());
			System.out.println("b3의 책 정보:"+Bb3.information());
			/*
			Book b4 = new Book(title, author, price, publisher);*/
			
			
					Book B1 = null;
					Book B2 = null;
					Book B3= null;
			
					for(int i=1; i<=3; i++) {
						System.out.println("도서명 입력:");
						String title = sc.nextLine();
						System.out.println("저자 입력:");
						String author = sc.nextLine();
						System.out.println("가격 입력:");
						int price = sc.nextInt();
						System.out.println("출판사 입력:");
						String publisher = sc.nextLine();
				
				//매번 검사
				
				if(i==1)
					B1 = new Book(title, author, price, publisher);
				else if ( i==2)
					B2 = new Book(title, author, price, publisher);
				else
				    B3 = new Book(title, author, price, publisher);
			
			}
			System.err.println(B1.information());
			System.out.println(B2.information());
			System.out.println(B3.information());

		// 도서 제목으로 검색

		Book b1 = new Book("마이바티스 프로그래밍", "일동국", 28000, "한빛미디어");
		Book b2 = new Book("유어바티스 프로그래밍", "이동국", 29000, "둘빛미디어");
		Book b3 = new Book("위어바티스 프로그래밍", "삼동국", 30000, "셋빛미디어");

		System.out.println("검색할 책 제목: ");
		String search = sc.nextLine();
		if (b1.gettitle().equals(search))
			System.out.println(b1.information());
		else if (b2.gettitle().equals(search))
			System.out.println(b2.information());
		else
			System.out.println(b3.information());
	}

}
