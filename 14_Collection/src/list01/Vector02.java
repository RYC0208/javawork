package list01;

import java.util.Vector;

public class Vector02 {

	public static void main(String[] args) {
		// 사용 방법은 ArrayList와 동일하다
		Vector<String> vlist = new Vector<>();
		vlist.add("Vector");
		vlist.add("ArrayList");
		
		vlist.remove(0);
		vlist.remove("Array");
	}

}