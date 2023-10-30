package inSpuer04;

import java.util.Scanner;

public class Ex01 {
int num1 = 30;
int num2 = 20;
String name;
boolean flag;
double numd1;
Scanner sc = new Scanner(System.in);
int MaxNum = 100;

int plus(int x, int y) {
	int re = x+y;
	return re;
	
}double divide(double x, double y){
	double re = x/y;
	return re;
	
}void scan(){
	System.out.println("연산할 연산자와867014as!@"
			+ " 숫자 2개를 입력하세요 ex)+ 2 2 :");
	char w = sc.next().charAt(0);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int result = 0;
if (w == '+') {
	result = n1+n2;
	
}else if (w == '-') {
	result = n1-n2;
}else if (w =='*') {
	result = n1*n2;
}else if (w =='/') {
	result = n1/n2;
}else if (w == '%') {
	result = n1%n2;
}else {
	System.out.println("정확한 입력이 아닙니다.");
}System.out.println(result);
}

}