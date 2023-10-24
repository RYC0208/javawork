package repetitive;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Re06_contineu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*		//break : 반복문을 빠져 나올때
				//continue: continue 하위의 실행문을 실행하지 않고 반복문을 다시 실행 할 때
				//          continue는 주로 ~을 제외 할 때 많이 사용함
				//1~100까지의 숫자 중 3의 배수를 제외한 합계를 구하기
						int num1 = 0;
						for(int i=1; i<=100; i++) {
						 if(i%3==0) // 배수
							 continue;
							num1+= i;	
				
						}
						 System.out.println("1~100까지의 3의 배수를 제외한 합계 ="+num1);
						
						 int num2 = 0;
						 for(int ii=1; ii<=100; ii++) {
							 if(ii%3!=0)
								 continue;
								 num2+=ii;
					
						 }
						 System.out.println("1~100까지의 3의 배수의 합="+num2);
						 
						 
				   System.out.println("숫자를 입력하세요: ");
				       int n1 =sc.nextInt();
				
				       int n2 = 0;
				       for(int i1=1; i1<=n1; i1++) {
				    	   
				    	   if(i1>n1)
				    		   continue;
				    	   n2+=i1;
				System.out.println(n2);
				       }System.out.println("1부터"+n1+"까지의 합: "+n2);
				       
				       
						int ra1 = (int)(Math.random()*100)+1;
						int nu1 = 0;
						do {
							System.out.println("숫자를 입력하세요:");
								nu1 = sc.nextInt();
							    System.out.println("랜덤 추출한 숫자:"+ra1);
							    System.out.println("내가 적은 숫자 :"+nu1);
							    if(101 <= nu1 || 0> nu1) {
									 System.out.println("1부터 100까지의 숫자를 입력하세요:");
			
										
							    }
							    else if(ra1>nu1)
									 System.out.println("더 큰 숫자를 입력해보세요");
							    else if(ra1<nu1) {
							    	System.out.println("더 작은 숫자를 입력해보세요");
							    }
							    	
								 
								} while(ra1 == nu1);
						 System.out.println("축하합니다. 맞췄습니다");
						*/
		/*		while(true) {
				System.out.println("숫자를 입력하세요: ");
				int in1 = sc.nextInt();
				
				if(in1 == 0) {
					System.out.println("1이상의 숫자를 다시 입력하세요.");
				
					continue;
					}
				for (int i=in1; i>=1;i--) {
					if(i == 1)
						System.out.println(i);
					else
					System.out.print(i+", ");
			
						
				} 
				break;
				} */
		System.out.println();
		
		//1번째 답
		boolean change = true;
		while(change) {
			System.out.println("두 수를 입력하세요 ex) 10 8: ");
			int nn1 = sc.nextInt();
			int nn2 = sc.nextInt();
			
			if(nn1 == 0 || nn2 ==0) {
				System.out.println("0보다 큰 수를 입력하세요");
				continue;}
			if(nn1 > nn2) {
				for(int i=nn2;i<=nn1;i++)
					System.out.print(i+", ");
			}else {
				for(int i=nn1;i<=nn2;i++)
					System.out.println(i+", ");
			}
			change = false;
		}
		
		}
	}
