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
		/*		System.out.print("주민번호 입력(-포함): ");
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
				} System.out.println(copy);*/
		//문제 5
		
		boolean run = true;
		int studentnum = 0;
		int[] score = null;
		int n1= 0;
				
				while(run) {
					System.out.println("-----------------------");
					System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
					System.out.println("-----------------------");
					System.out.println("선택>");
				
					int selectno = Integer.parseInt(sc.nextLine());
					
					
					if(selectno ==1) {
					 System.out.println("학생수>");
					 studentnum = Integer.parseInt(sc.nextLine());
					 score = new int[studentnum];
					
					}else if (selectno ==2) {
					for(int i = 0; i<score.length ; i++) {
						
						n1++;
					System.out.println("학생["+(n1)+"]> ");
					score[i] = Integer.parseInt(sc.nextLine());
					} n1=0;
						
					}else if (selectno ==3) {
						for (int i = 0; i < score.length; i++) {
							n1++;
							System.out.println("학생["+n1+"]:"+score[i]);
						}
						
					}else if (selectno ==4) {
						int max = 0;
						int sum = 0;
						double avg = 0;
						for (int i = 0; i< score.length;i++) {
							max = (max<score[i]) ? score[i] :max;
							sum += score[i];
						} avg=(double) sum/ studentnum;
						System.out.println("최고 점수: "+max);
						System.out.println("평균 점수: "+avg);
						
					}else if (selectno ==5)
					run = false;
				}
				System.out.println("프로그램 종료");
	}

}
