package plac4;

import java.util.Objects;

public class Book {
	//필드
private String title;
private String author;
private int category;
private int price;

//생성자
public Book(){
}
public Book(String title, String author, int category, int price) {
	this.title = title;
	this.author = author;
	this.category = category;
	this.price = price;
	}
//게터 세터
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getCategory() {
	return category;
}
public void setCategory(int category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;}
//해시코드
@Override
public int hashCode() {
	return Objects.hash(author, category, price, title);
}
//이퀄스
@Override
public boolean equals(Object obj) {
	if(obj instanceof Book) {
		Book b = (Book)obj;
		return 
				(author.equals(b.author))
				&&(price==b.price)
				&&(title.equals(b.title))
				&&(category==(b.category));
	}return false;
	/*if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
			&& Objects.equals(title, other.title);*/
}
//투스트링
@Override
public String toString() {
	return "제목: " + title + ", 저자: " + author + ", 카테고리: " + category + ", 가격: " + price + "]";
}
}
