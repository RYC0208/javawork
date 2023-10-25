package objMethod04;

public class Arithmetic {
	// 5칙연산 메소드 만들기
	
	int add1(int x, int y) {
		int re = x+ y;
		System.out.println(x+"+"+y+"="+re);
		return re;
		// return x+y;와 동일함  
}
	int add2(int x, int y) {
		int re = x- y;
		return re;
		// return x-y;와 동일함
	}
	int add3 (int x, int y) {
		int re = x*y;
		return re;
		// return x*y;와 동일함
	}
	 double add4 (int x, int y) {
		
		return (double)x/y;
		// return x/y;와 동일함
	}
	int add5 (int x, int y) {
		int re = x%y;
		return re;
		// return x%y;와 동일함
	}
	
}
