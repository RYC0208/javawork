package op01;

public class Ch01_assignment {

	public static void main(String[] args) {
		int num1 = 10;

		num1 += 10;
		System.out.println("num1(10)+10 = " + num1);
	
		num1 = 10;
		
		num1 -= 5; //num1 = num1 - 5;    (=)는 우변의 값을 좌변에 대입하는 식
		System.out.println("num1(10) - 5 = " + num1);
		
		num1 = 10;
		num1 *= 3;
		System.out.println("num1(10) * 3 = " + num1);
		
		num1 = 10;
		num1 /= 3;
		System.out.println("num1(10) / 3 = " + num1);
		
		num1 = 10;
		num1 %= 3; // num1 = num1 % 3;
		System.out.println("num1(10) % 3 = " + num1);
		
	}

}
