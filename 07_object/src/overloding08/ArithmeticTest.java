package overloding08;

import java.nio.file.spi.FileSystemProvider;

public class ArithmeticTest {

	public static void main(String[] args) {
		
	Arithmetic n1 = new Arithmetic();
	n1.add1(2, 0);
	
	System.out.println(n1.add1(3, 5));
	
	System.out.println(n1.add2(50, 20));
	
	System.out.println(n1.add3(500, 4));
	
	System.out.printf("%.3f\n", n1.add4(500, 200));
	
	System.out.println(n1.add5(200, 69));
	n1.add1(102);
	n1.add1(92.12, 12.31);
	Arithmetic add4 = new Arithmetic();
	
	add4.add4(34, 12.3);
	double re = add4.add4(2.1, 1.1);
	
	}
}
