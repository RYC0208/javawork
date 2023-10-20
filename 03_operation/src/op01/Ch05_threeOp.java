package op01;

import java.util.Scanner;

public class Ch05_threeOp {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		Scanner sc = new Scanner(System.in);
		
		// 삼항 연산자 : 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		
        String re = num1 < num2 ? "num1의 숫자가 더 크다" : "num2의 숫자가 더 작다";
        System.out.println(re);
        
       char re2 = num1 > num2 ? '대' : '소';
       System.out.println(re2);
       

       
       int num3 = -10;
       int re3 = num3 < 0 ? -num3 : num3;
       System.out.println(re3);
       
       
       System.out.println("점수 입력:");
       
       int in6 = sc.nextInt();
       
       String st1 = in6 >= 70 ? "합격" : "불합격";
       System.out.println("시험에 " + st1 + " 했습니다.");
       
       String st2 = 
    		   in6 > 100 ? "매길 수 없습니다.":
    		   in6 >= 90 ? "A학점" :
    			   in6 >= 80 ? "B학점" :
    				   in6 >= 70 ? "C학점" :
    					   in6 >= 0 ? "F학점" : "매길 수 없습니다" ;
    System.out.println("당신의 학점은 " + st2);
       
    		   

       
	}
	
	

}
