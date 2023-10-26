package ExSnack12;

public class Snack {
private String kind;
private String name;
private String flavor;
private int number;
private int price;
Snack() {
	
}
Snack(String kind, String name, 
		String flavor, int number, int price) {
	this.kind=kind; 
	this.name=name; 
	this.flavor=flavor; 
	this.number=number; 
	this.price=price;
	
	//getter, setter 메소드
}// 과자 종류 kind

public void setKind(String kind) {
	this.kind = kind;
}
public String getkind() {
	return kind;

//과자 이름 name
	
}public void setname(String name) {
	this.name = name;
}public String getname(){
	return name;
	
//맛 flavor
	
}public void setflavor(String flavor) {
	this.flavor = flavor;
}public String flavor(){
	return flavor;
	
//개수 number
	
}public void setnumber(int number) {
	this.number = number;
}public int number(){
return number;

// 가격 price

}public void setprice(int price) {
	this.price = price;
}public int price(){

	return number;

}
public String information() {
	return kind+"," +name+","+number+","+ flavor+","+ price;
	
}
}

