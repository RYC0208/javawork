package com.addinedu.model.vo;

public class Book {
	//도서명 , 저자 , 가격 , 출판사
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
	}public String gettitle() {
		return title;
	}public void settitle(String title) {
		this.title = title;
		
	}public String getauthor() {
		return author;
	}public void setauthor(String author) {
		this.author = author; }
	public int getprice() {
		return price;
	}public void setprice(int price) {
		this.price = price;
		
	}public String getpublisher() {
		return publisher;
	}public void setpublisher(String publisher) {
		this.publisher = publisher;
	}
public String information() {
	return  "제목:"+title +" 저자:" + author +" 가격:"+price+"원"+" 출판사:"+publisher;
}
}
