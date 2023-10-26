package overloding08;

public class Arithmetic {
	// 5칙연산 메소드 만들기
	
	int j = 10;
	
	int add1(int x, int y) {
		int re = x+ y;
		System.out.println(x+"+"+y+"="+re);
		return re;
		// return x+y;와 동일함  
} void add1(int x) {
	System.out.println(x + "+10=" + (x+10));
	System.out.println(x+ "+" + j + "=" + (x+j));
}void add1(double x, double y){
	System.out.println(x+ "+"+y+"="+(x+y));
}void add1(int x, double y){
	System.out.println("int,double");
	
	System.out.println(x+ "+"+y+"="+(x+y));
	}int add2(int x, int y) {
		int re = x- y;
		return re;
		// return x-y;와 동일함
	}
	int add3 (int x, int y) {
		int re = x*y;
		return re;
		// return x*y;와 동일함
	}void add3(int x){
		System.out.println(x+"*10="+x*10);
	}void add3(double x, double y){
		System.out.println(x+"*"+y+"="+x*y);}
	
	 double add4 (int x, int y) {
		
		return (double)x/y;
		// return x/y;와 동일함
	} void add4 (int x) {
		System.out.println(x+"/2="+x/2);
	}
	 
	double add4 (double x, double y){
	      System.out.println(x+"/"+y+"="+x/y);
	return x/y;
	   }
	 
	 
	 
	 
	 
	 
	int add5 (int x, int y) {
		int re = x%y;
		return re;
		// return x%y;와 동일함
	}
	
}
