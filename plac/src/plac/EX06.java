package plac;

import java.util.Arrays;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		//문제-6 답안지
		//문제 1
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("배열의 길이 입력:");
		int num = sc.nextInt();      // 입력 스캔
		int iarr[] = new int[num];  // 스캔한 값을 (iarr) 배열의 길이로 지정
		int sum = 0;
		for(int i=0; i<iarr.length; i++) {
			System.out.println("배열[" + i + "] index의 넣을 값을 입력: ");
			iarr[i] = sc.nextInt();
			sum += iarr[i];
			
		}System.out.println(Arrays.toString(iarr));
		System.out.println("총합 = " + sum);*/
		
		//문제 2
		/*		while(true) {
						System.out.println("정수 입력:");
						int num2 = sc.nextInt();
						if(num2%2 == 0 || num2 < 3) {
							System.out.println("다시 입력하세요");
							continue;
						}
						int iarr2[] = new int[num2];
						int count = 1;
						for(int i=0; i<iarr2.length; i++) {
							if(i < num2/2)
								
								iarr2[i] = count++;
							else
								iarr2[i] = count--;
						}System.out.println(Arrays.toString(iarr2));
						break;
				}*/
		//문제 3
		/*		String chickens[] = {"후라이드","파닭","신호등","간장"};
				System.out.println("메뉴를 입력하세요: ");
				String menu =sc.next();
				
				boolean flag = false;
				for(int i=0; i<chickens.length;i++) {
					if(menu.equals(chickens[i])) {
						flag = true;
						break;
					}
				}
				if(flag)
					System.out.println(menu+" 치킨 배달 가능");
				else 
					System.out.println(menu+"는 없는 메뉴 입니다.");*/
		//문제 4
		System.out.print("주민번호 입력(-포함): ");
		String jumin = sc.next();
		char[] origin = new char[jumin.length()];
		for(int i=0; i<origin.length; i++) {
			origin[i] = jumin.charAt(i);
		}
		char[] copy = new char[origin.length];
		for(int i=0; i<copy.length; i++) {
			if(i<8)
				copy[i] = origin[i];
			else copy[i] = '*';
		} System.out.println(copy);
	}

}
