package plac;

import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		/*	System.out.println("연산자를 입력하세요:");
			char ch1 = sc.next().charAt(0);
			System.out.println("숫자 첫번째 숫자를 입력하세요:");
			
			int num1 = sc.nextInt();	
			System.out.println("숫자 두번째 숫자를 입력하세요:");
			int num2 = sc.nextInt();
			
			
			int re1 = num1 + ch1 + num2;
			*/
		
		System.out.println("연산할 숫자와 연산자 입력 ex) 3+5");
		int num5 = sc.nextInt();
		char ch5 = sc.next().charAt(0);
		int num6 = sc.nextInt();
		
		
		switch (ch5) {
		case '+' :
			System.out.println("결과 값은:"+(num5 + num6)+"입니다");
		 break;
			
		case '-' :
			System.out.println("결과 값은"+(num5-num6)+"입니다");
			break;
		case '*':
			System.out.println("결과 값은:"+(num5 * num6)+"입니다");
			break;
			
		case '/':
			System.out.printf("결과 값은: %.2f입니다 \n", (double)num5/num6);
			/*		System.out.printf("%d/%d=%.2f", num1,num2,(double)num1/num2);*/
			break;
			
		case '%':
			System.out.println("결과 값은:"+(num5%num6)+"입니다");
			break;
			default:
			System.out.println("옳바른 연산자가 아닙니다");
			
		
		}

		
		
		
		
	}

}
