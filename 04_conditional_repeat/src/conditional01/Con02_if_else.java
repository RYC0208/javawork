package conditional01;

import java.util.Scanner;

public class Con02_if_else {

	public static void main(String[] args) {
		/*
		if(조건식){
		 참일 때 실행 구문
		 } else{
		       거짓일 때 실행 구문
		       }
		 */
		Scanner sc = new Scanner (System.in);
		int score = 89;
		if(score >= 70) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		}else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에!");
			
		}
		System.out.println();
		
		int num1 = -100;
		if(num1 >= 0) 
			System.out.println("양수입니다");
		else 
			System.out.println("음수입니다");
		
		System.out.println("숫자를 입력하세요 :");
		int num2 = sc.nextInt();
		if(num2 %2 ==0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
		
		
		

		
		}


}
