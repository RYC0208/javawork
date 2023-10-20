package plac;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

	    
		/* System.out.print("숫자를 입력하세요:");
		  int in1 = sc.nextInt();
		  String re4 = in1 < 0 ? "음수" : "음수가 아니다";
		  System.out.println(re4);	
		  
		  
		  
		  
		     System.out.print("숫자를 입력하세요:");
		      int i3 = sc.nextInt();
		      
		      String st2 = 
		   		   i3 > 0 ? "양수.":
		   		   i3 < 0 ? "음수." : "0.";
		     System.out.println(st2);*/
               
		/*               System.out.println("인원 수 :");
		       int in2 = sc.nextInt();
		       System.out.println("사탕의 개수 :");
		       int in3 = sc.nextInt();
		       
		       int in4 = in3/in2 ;
		       int in5 = in3-in4*in2  ;
		       System.out.println("1인당 사탕 개수 :" + in4+"\n" + "남은 사탕의 개수 :" + in5);*/

		/*	 System.out.println("이름:");
				String name = sc.next();
			 System.out.println("학년:");
				int CL = sc.nextInt();
			 System.out.println("반:");
				int CL2 = sc.nextInt();
			 System.out.println("번호:");
			 int CL3 = sc.nextInt();
			 System.out.println("성별(M/f):");
				char se = sc.next().charAt(0);
				String re1 = se == 'M' ? "남학생" : se == 'F' ? "여학생" : "뭐야";
			 System.out.println("성적:");
				double po = sc.nextDouble();
		
				System.out.println(CL+"학년 "+CL2+"반 "+CL3+"번 "+name+re1+"의 "+"성적은 "+po+"이다.");	*/
			
		System.out.println("나이를 입력하세요:");
              int in10 = sc.nextInt();
              String st11 = 
            		  in10 <= 13 ? "어린이" :
            	  in10 > 19 ? "성인" : "청소년";
              
              System.out.println(st11);
              
             
              System.out.println("숫자를 입력:");
              int inn1 = sc.nextInt();
              int inn2 = inn1%2;
              String stt1 = inn2 == 0 ? "짝수" :"홀수";
              System.out.println(stt1);
              
              
		         

		        			
		        	    	
		        			
	}

}
