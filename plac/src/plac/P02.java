package plac;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("문자를 하나 입력하세요 : "); 
		char c1 = scan.next().charAt(0);
		int in1 = c1;
		
		System.out.println(c1 + "의 unicode : " + in1);
		
		System.out.println("국어, 영어, 수학 점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int all = kor + eng + math;
		double avg = all / 3.0;
		System.out.println("총점 : " + all);
		System.out.printf("평균 : %.2f", avg);
		
        int iNum1 = 10;
        int iNum2 = 4;
        
        float fNum = 3.0f;
        
        double dNum = 2.5;
        
        char ch = 'A';
        
        System.out.println( iNum1 /iNum2 ); // 2
        System.out.println( (int)dNum ); // 2
        
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (double)iNum1 ); // 10.0
        
        System.out.println( (double)iNum1/ iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        
        System.out.println( (int)fNum ); // 3
        System.out.println( iNum1 / (int)fNum ); // 3

        System.out.println( iNum1/ fNum );// 3.3333333
        System.out.println( (double)iNum1/ fNum ); // 3.3333333333333335
        
        System.out.println( ch ); // 'A'
        System.out.println( (int)ch ); // 65
        System.out.println( (int)ch +  iNum1 ); // 75
        System.out.println( (char)(ch + iNum1) ); // 'K'
        



}
}