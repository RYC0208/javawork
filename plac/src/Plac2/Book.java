package Plac2;

public class Book implements LibraryController {

	String title;
	String author;
	String publisher;
	Book(){		
	}
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}public String toString(){
		return "도서 제목: "+title+", 저자: "+author+", 출판사: "+ publisher;
	}
}
