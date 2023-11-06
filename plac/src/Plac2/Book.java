package Plac2;

public class Book   {

	private  String title;
	private 	 String author;
	private  String publisher;
	
	
	public	Book(){		
	}
	public	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}public void settitle (String title) {
		this.title = title;
	}public String gettitle() {
		return title;
	}
	@Override
	public String toString(){
		return "도서 제목: "+title+", 저자: "+author+", 출판사: "+ publisher;
	}
}
	