package object01;
class Person{
	int id;
	
	Person(int id){
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) 
			return id == ((Person)obj).id;
		else 
		return false;
}
public class EqualsEx1 {

	public static void main(String[] args) {
		Person id1 = new Person(20231102);
		Person id2 = new Person(20231103);
 
		if(id1.equals(id2))
			System.out.println("id 생성 날자가 같다");
		else
			System.out.println("id 생성 날자가 다르다");
		
		if(id1 == id2)
			System.out.println("id1과 id2의 주소가 같다");
		else
			System.out.println("id1과 id2의 주소가 다르다");
		
	}

}
}
