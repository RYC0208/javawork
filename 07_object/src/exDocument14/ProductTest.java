package exDocument14;

class Product{
	static int count;
	String serial;
	
	Product(){
		++count;
		serial ="Addinedu-"+count;
	}
	Product(int serial){
		
	}
}
public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1의 시리얼:"+p1.serial);
		System.out.println("p1의 시리얼:"+p2.serial);
		System.out.println("p1의 시리얼:"+p3.serial);
		System.out.println("p1의 시리얼:"+p4.serial);
		System.out.println("생성된 총 개수:"+Product.count);
		
	}

}
