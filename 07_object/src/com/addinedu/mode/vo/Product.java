package com.addinedu.mode.vo;

public class Product {
private String id;
private String name;
private String area;
private int price;
private double tax;

public Product(){
	
}
Product(String id, String name, String area, int price,
		double tax) {
 this.id=id;
 this.name=name;
 this.area=area;
 this.price=price;
 this.tax=tax;
}
public void setid(String id) {
	this.id = id;
}public String getid() {
	return id;
}
public void setname(String name) {
	this.name = name;
}public String getname() {
	return name;
	
}public void setarea(String area) {
	this.area = area;
}public String getarea() {
	return area;
}public void setprice(int price) {
	this.price = price;
}public int getprice() {
	return price;
}public void settax(double tax) {
	this.tax = tax;
}public double gettax() {
	return tax;
}public String information() {
	return "아이디:"+id+" 제품명:"+name+" 장소:"+area+" 가격:"+price+"원"+" 세금:"+tax;
}public int changeprice() {
	return price;
}


}
