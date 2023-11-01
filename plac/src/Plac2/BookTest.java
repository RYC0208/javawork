package Plac2;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
	LibraryCon lc = new LibraryCon();
	lc.insertBook();
	ArrayList<Book> bList = lc.selectAll();
	for(int i=0; i<bList.size();i++) {
		System.out.println(bList.get(i));
	    }
	
	Member mem = new Member("김수연", 21,'여');
	lc.insertMember(mem);
	lc.myinfo();
	System.out.println("========================================================");
	
	
	Book searchBook = lc.searchBook("오라클");
	if(searchBook == null) {
		System.out.println("없어");
	}else {
	System.out.println(searchBook);
	}
	
	
	
	System.out.println("++++++++++++++++++++++++++++++++++");
	int index = lc.rentBook(2);
	if(index < bList.size()) {
	System.out.println("빌려주는 책 정보: \n" + bList.get(index)+"\n대여 되었습니다.");
	}else {
		System.out.println("없어");
	}
	}

}
