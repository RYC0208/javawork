package polyEx09;

public class Pet {
private String kind;
private String color;


Pet(String kind, String color){
	this.kind = kind;
	this.color = color;
}void sound(){
	System.out.println("울음 소리");
	
}void pattern() {
	System.out.println("특징");
}
String getKind() {
	return kind;
}void getColor () {
	System.out.println(color);
}public String toString() {
	return "종류: " + kind + ", 색상: "+color;
}void infor(){
	System.out.println("종류: " + kind + ", 색상: " + color);
}
}
