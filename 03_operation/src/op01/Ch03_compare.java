package op01;

public class Ch03_compare {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 50;
		boolean re1 = num1 >= num2;  // == (같은가) != (같지 않은가)
		boolean re2 = num1 == num2;
		
		System.out.println("num1과 num2의 값이 같은가? "+ re2);
		System.out.println("num1과 num2의 같이 같지 않은가? "+ (num1 != num2));
	}

}
