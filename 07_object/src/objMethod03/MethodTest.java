package objMethod03;

public class MethodTest {

	public static void main(String[] args) {
		Method m1 = new Method();
		
		m1.print1();
		
		int re = m1.print2();
		System.out.println(re);
		
		m1.print3();
		System.out.println(m1.print3());
		
		boolean re1 = m1.print4();
		System.out.println(re1);
		
		m1.print5(10);
		
		int re2 =m1.print6(5);
			System.out.println(re2);
			
		String str = m1.print7(7);
		System.out.println(str);
		System.out.println("--------------------");
		System.out.println(m1.print8(100, 500));
		
		m1.print9("이태규", 11111111);
		
		m1.print10(1.22, "이태규", false, 100000);
		
	}

}
