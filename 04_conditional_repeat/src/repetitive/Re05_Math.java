package repetitive;

import java.util.Scanner;

public class Re05_Math {

	public static void main(String[] args) {
		//	Math(수학에 관련된 클래스)
		double ran1 = Math.random();//실수형 : 0 ~ 0.9999999999
		System.out.println(ran1);
		
		double ran2 = Math.random()* 5; // 0 ~ 9.9999999999999
		System.out.println(ran2);
		
		int reran2 = (int) ran2;//0~9 (정수로 형변환 하고 돌리면 소수점 이하는 버림)
		System.out.println(reran2);
		
		//1~10까지의 숫자를 얻고자 한다면
		int re2ran2 = (int)ran2 +1;
		System.out.println(re2ran2);
		
		//0~4
		double ran4 = Math.random()*5;
		int re3ran4 = (int)ran4;
		System.out.println(re3ran4);
		
		double ran3 = Math.random()* 100; // 0 ~ 99.9999999999999
		System.out.println(ran3);

		
		//주사위의 숫자 맞추기 게임
		//랜덤으로 주사위 숫자 만들기
		//사용자로 부터 숫자를 입력 받아서
		//숫자를 맞추면 "축하합니다. 맞췄습니다" 하고 끝내기
		//못 맞췄으면 계속
		//랜덤으로 1~6까지의 숫자를 추출하기
		int ra1 = (int)(Math.random()*6)+1;
		int nu1 = 0;
		do {
	    
	    Scanner sc= new Scanner (System.in);
	    System.out.println("숫자를 입력하세요:");
		nu1 = sc.nextInt();
		System.out.println("내가 던진 주사위 :"+nu1);
	    System.out.println("주사위:"+ra1);
		 if(ra1 == nu1)
			 System.out.println("축하합니다. 맞췄습니다");
	
		 else
			 System.out.println("틀렸습니다. 다시 시도하세요");
		 
		} while(ra1 != nu1);
		 
		
		
		
	}

}
