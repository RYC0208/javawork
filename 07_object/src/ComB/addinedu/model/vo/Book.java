package ComB.addinedu.model.vo;

public class Book {
private String title;
private int price;
private double discount;
private String author;

public Book(){
}
public Book(String title, int price, double 
		discount, String author){
	this.title = title;
	this.price = price;
	this.discount = discount;
	this.author = author;
	
}public void settitle() {
	this.title = title;
}public String gettitle() {
	return title;
}

public void setprice() {
	this.price = price;
}public int getprice() {
	return price;
	
}public void setdiscount() {
	this.discount = discount;
}public double getdiscount() {
	return discount;
	
}public void setauthor() {
	this.author = author;
}public String getauthor() {
	return author;
}public String inform() {
	return "책 제목:"+title+" 가격:"+price+"원"+" 할인율:"+discount
			+"%"+" 저자:"+author+"지음";
}public int changeprice() {
	return price;
}
}