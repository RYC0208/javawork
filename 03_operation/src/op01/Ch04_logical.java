package op01;

public class Ch04_logical {

	public static void main(String[] args) {
		//논리합과 논리곱
		/*
		 * x   y  논리합(&&)   논리곱(||) , 논리곱: 둘중에 하나만 참이어도 참 , 논리합: 둘중에 하나라도 거짓이면 거짓
		 * 0   0     0         0
		 * 0   1     0         1    
		 * 1   0     0         1
		 * 1   1     1         1
		 */
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 < num2;
	    System.out.println(re1);
	    
	    re1 = num1 > num2 || num1 < num2;
        System.out.println(re1);
        
        
	}

}
