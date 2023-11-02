package object01;
class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		Value v = (Value)o;
		int num = v.value;
		//int num1 =((Value)o).value;
		//return value == ((Value)o).value;//<-하나만 있어도 됨..
		//  객체를 생성한 value와 (value)로 강제 형변환된 o.value의 값이 같은가?를 물어봄
		return value == num;
		}
}
public class Equals01{

	public static void main(String[] args) {
		Value value1 = new Value(10);
		Value value2 = new Value(10);
//		오버라이딩 하기 전
/*		if(value1.equals(value2)) 
			System.out.println("value1과 value2의 주소가  같다");
		else
			System.out.println("valuse1과 valuse2의 주소가 다르다");*/
		
		//오버라이딩 하고 난 후
		if(value1.equals(value2)) 
			System.out.println("value1과 value2의 값이 같다");
		else
			System.out.println("valuse1과 valuse2의 값이 다르다");
			
		if(value1 == value2)
			System.out.println("value1과 value2의 주소가 같다");
		else 
			System.out.println("value1과 value2의 주소가 다르다");
		System.out.println("----------------------------------");
		value1= value2;
		
		if(value1.equals(value2))
			System.out.println("valu1과 value2가 같다");
		else
			System.out.println("valu1과 value2가 다르다");
	}

}
	  		