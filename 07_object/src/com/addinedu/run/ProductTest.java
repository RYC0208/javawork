package com.addinedu.run;

import java.util.Scanner;

import com.addinedu.mode.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
	Product pro1 = new Product();
	Scanner sc = new Scanner(System.in);
	System.out.println("제품의 id: ");
	pro1.setid(sc.next());
	System.out.println("제품의 이름: ");
	pro1.setname(sc.next());
	System.out.println("제품의 판매 장소: ");
	pro1.setarea(sc.next());
	System.out.println("제품의 가격: ");
	pro1.setprice(sc.nextInt());
	System.out.println("제품의 세금: ");
	pro1.settax(sc.nextDouble());
	System.out.println("___________"+pro1.getname()+"의 정보"+"___________");
	System.out.println(pro1.information());
	System.out.println("_________________________________");
	
	System.out.println("제품의 가격 설정: ");
	pro1.setprice(sc.nextInt());
	System.out.println(pro1.getname()+"의 변경된 가격: "+pro1.changeprice());
	double re1 = (double)pro1.getprice()+(pro1.getprice()/pro1.gettax());

	
	Product pro2 = new Product();
	System.out.println("제품의 id: ");
	pro2.setid(sc.next());
	System.out.println("제품의 이름: ");
	pro2.setname(sc.next());
	System.out.println("제품의 판매 장소: ");
	pro2.setarea(sc.next());
	System.out.println("제품의 가격: ");
	pro2.setprice(sc.nextInt());
	System.out.println("제품의 세금: ");
	pro2.settax(sc.nextDouble());
	System.out.println("___________"+pro2.getname()+"의 정보"+"___________");
	System.out.println(pro2.information());
	System.out.println("_________________________________");
	
	System.out.println("제품의 가격 설정: ");
	pro2.setprice(sc.nextInt());
	System.out.println(pro2.getname()+"의 변경된 가격: "+pro2.changeprice());
	double re2 = (double)pro2.getprice()+(pro2.getprice()/pro2.gettax());
	System.out.println("_________________________________");
	
	
	Product pro3 = new Product();
	System.out.println("제품의 id: ");
	pro3.setid(sc.next());
	System.out.println("제품의 이름: ");
	pro3.setname(sc.next());
	System.out.println("제품의 판매 장소: ");
	pro3.setarea(sc.next());
	System.out.println("제품의 가격: ");
	pro3.setprice(sc.nextInt());
	System.out.println("제품의 세금: ");
	pro3.settax(sc.nextDouble());
	System.out.println("___________"+pro3.getname()+"의 정보"+"___________");
	System.out.println(pro3.information());
	System.out.println("_________________________________");
	
	System.out.println("제품의 가격 설정: ");
	pro3.setprice(sc.nextInt());
	System.out.println(pro3.getname()+"의 변경된 가격: "+pro3.changeprice());
	double re3 = (double)pro3.getprice()+(pro3.getprice()/pro3.gettax());
	System.out.println("_________________________________");
	
System.out.println("____________________부가세_____________________");
System.out.printf("부가세 포함 %S의 가격: %.2f\n", 
pro1.getname(), re1);
	System.out.printf("부가세 포함 %S의 가격: %.2f\n", 
pro2.getname(), re2);
	System.out.printf("부가세 포함 %S의 가격: %.2f\n", 
pro3.getname(), re3);
	System.out.println("_____________________________________________");
	}

}
