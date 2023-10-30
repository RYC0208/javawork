package in01;
class AA{
	int i;
	int j;
	
	void setIJ(int x, int y) {
		i = x ;
		j = y ;
		
	}
}class BB extends AA{
	int total;
	void sum() {
		total = i + j;
	}
}


public class inheritanceTest2 {

	public static void main(String[] args) {
BB b = new BB();
b.setIJ(10, 20);
System.out.println(b.total);
	}

}
