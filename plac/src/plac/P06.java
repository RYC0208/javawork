package plac;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("숫자를 입력하세요: ");
	       int n1 =sc.nextInt();
	
	       int n2 = 0;
	       for(int i1=1; i1<=n1; n1--) {
	    	   
	    	   if(i1>n1)
	    		   continue;
	    	   i1+=n2;
	System.out.println(i1);
	       }

	}

}
