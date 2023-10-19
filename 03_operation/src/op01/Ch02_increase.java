package op01;

public class Ch02_increase {

	public static void main(String[] args) {
		// ++ 하나 증가
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		num1 = 10;
		num1--;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		
		// 단항(1개의 항)일 때는 연산자가 앞에 있으나 뒤에 있으나 결과는 같다
		++num1;
		--num1;
		
		// 연산시 달라짐
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;           // ++이 항의 앞에 붙으면 자신 먼저 증가 뒤에 붙으면 모든 계산이 끝난뒤 자신을 증가시킴 
		result = ++num2 + num3++;
		System.out.println(result);
		System.out.println(num3);
		
		num2 = 10;
		num3 = 10;
		
		// 1. 21
		// 2. 20
		// 3. 19
		

	}

}
