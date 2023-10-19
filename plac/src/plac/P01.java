package plac;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.println("이름 :" + name);
		
		System.out.print("당신은 남자 입니까?(true or false) : ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 남자 입니까 :" + gender);
		
		System.out.print("나이 :");
		int age = scan.nextInt();
		System.out.println("나이 :" + age);
		
		System.out.print("키 : ");
		double key = scan.nextDouble();
		System.out.println("키 : "+key);
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("첫번째 정수 : 10");
		System.out.println("두번째 정수 : 5");
		
		System.out.println("10+5=" +(num1+num2));
		System.out.println("10-5=" +(num1-num2));
		System.out.println("10*5=" +(num1*num2));
		System.out.println("10/5=" +(num1/num2));
		
		
		double num3 = 20.2;
		double num4 = 15.8;
		System.out.println("사각형의 세로 길이/ 20.2");
		System.out.println("사각형의 가로 길이/ 15.8");
		System.out.println("사각형의 둘레는 ="+(num3+num4)*2);
		System.out.println("사각형의 면적은 ="+ (num3*num4));
	

	}

}
