package com.addinedu.model.vo;

import java.util.ArrayList;
import java.util.Scanner;
public class BookArrayListTest {

	public static void main(String[] args) {		
			
Scanner sc = new Scanner (System.in);
	ArrayList<Book> al = new ArrayList<Book>();

System.out.println("도서명 입력:");
String title = sc.nextLine();
System.out.println("저자 입력:");
String author = sc.nextLine();
System.out.println("가격 입력:");
int price = sc.nextInt();
sc.nextLine();
System.out.println("출판사 입력:");
String publisher = sc.nextLine();

Book b1 = new Book(title, author, price, publisher);
System.out.println(b1.information());
al.add(b1);
	
	}

}
