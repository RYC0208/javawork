package abs02;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone("노용철");
		p1.turnon();
		p1.search();
		p1.infor();
		System.out.println("___________________");
		FolderPhone p2 = new FolderPhone("노용철");
		p2.turnon();
		p2.Message();
		p2.infor();
	}



}
