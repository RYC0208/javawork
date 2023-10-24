package repetitive;

import java.util.Scanner;

public class Re04_do_while {

	public static void main(String[] args) {
	/*
	 * -조건을 나중에 확인하므로 무조건 조건과 상관없이 1번은 반드시 실행한다
	 * do{
	 * 
	 * }while(조건식);
	 * 
	 */
		boolean b1= false;
		while(b1) {
			System.out.println("while 조건식");
		}
		
		do {
			System.out.println("do-while 조건식");
		}while(b1); //do while 문은 어떠한걸 설명해야할 때
		
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		do {
			System.out.println("1.for문 설명, 2.while문 설명,3.do-while문 설명(종료하려면 0을 입력");
			 num1 = sc.nextInt();
			
			switch(num1) {
			case 1:
				System.out.println("조건이 정해져 있을 때 사용하면 좋다");
				break;
			case 2:
				System.out.println("특정 조건에 도달 할 때까지 사용");
				break;
			case 3:
				System.out.println("조건은 나중에 따지고 최소 1번은 실행");
			}
			
		
		
		}while(num1 != 0);
		System.out.println("프로그램 종료");
		

		
		
		

	}

}
