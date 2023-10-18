package var01;

public class Ch01_int {

	public static void main(String[] args) {
		int num1;  
		num1 = 10;
		System.out.println(num1);
		
		num1 = 30;
		System.out.println(num1);
		
		int num2 = 100;
		System.out.println(num2);
		System.out.println(num1);
		
		System.out.println("-----------");
		System.out.println("30+100=" +( num1 + num2));
		System.out.println("100-30=" + (num2 - num1)); 
		System.out.println("30*100=" + num1 * num2);
		System.out.println("100/30=" + num2 / num1);
		System.out.println("-----------");
		
		int result = num1 + num2;
		System.out.println(result);
		
		int result2 = result * 20;
		System.out.println(result2);
		
		System.out.println(result2/result);
		
		System.out.println("------------------");
		
		
	    int ONE = result2 + 30;
	    System.out.println("2600+30=" + ONE);
	    
	    int one3 = result2-1300;
	    System.out.println("2600-1300=" + one3);
	    
	    int one1 = result2 *5;
	    System.out.println("2600*5=" + one1);
	    
	    int one2 = result2/5;
	    System.out.println("2600/5=" + one2);
	    
	    System.out.println("------------------");
	 
	    
	    		
		
	}

}
