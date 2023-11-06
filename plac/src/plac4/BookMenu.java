package plac4;
import java.util.*;
public class BookMenu {
	Scanner sc = new Scanner(System.in);
private	BookController bc = new BookController();

public void MainMenu() {
	boolean exit = false;
	while(!exit) {
	System.out.println("1. 새 도서 추가");
	System.out.println("2. 도서 전체 조회");
	System.out.println("3. 도서 검색 조회");
	System.out.println("4. 도서 삭제");
	System.out.println("9. 프로그램 종료");
	System.out.println("메뉴를 선택하세요: ");

	int cho = sc.nextInt();
	sc.nextLine();
	switch(cho) {
	
	case 1:
		insertBook();
		break;
	case 2:
		
		break;
	case 3:
	
		break;
	case 4:
	
		break;
	case 9:
		System.out.println("프로그램을 종료합니다.");
		break;
	default :
		System.out.println("다시 입력하세요.");
} 
}

}public void insertBook() {
	System.out.println("도서의 제목을 입력하세요: ");
	String title = sc.nextLine();
	System.out.println("도서의 저자를 입력하세요: ");
	String author = sc.nextLine();
	System.out.println("장르 입력 1. 인문/2. 자연과학/3. 의료/4. 기타: ");
	int category = sc.nextInt();
	System.out.println("가격을 입력하세요: ");
	int price = sc.nextInt();
	String category1 =null;
	
	switch(category){
		case 1:
			category1 = "인문";
		case 2:
			category1 = "자연과학";
		case 3:
			category1 = "의료";
		default:
			category1 = "기타";
	}
	Book bo = new Book(title, author, category, price);
	bc.insertBook(bo);
	System.out.println("도서가 추가 되었습니다.");
	
}public void selectBook() {
	ArrayList<Book>booklist = bc.selectList();
	System.out.println("====== 도서 전체 조회 ======");
	if(booklist.isEmpty())
		System.out.println("도서를 찾을 수 없습니다");
	else
		for (Book book: booklist){
		System.out.println(book);
	}
		
		
}public void searchBook() {
	System.out.println("검색할 도서의 키워드를 입력하세요: ");
	String keyword = sc.nextLine();
  ArrayList<Book> list = bc.searchBook(keyword);
  if(list.isEmpty())
	  System.out.println("도서를 찾을 수 없습니다");
  else {
	  for( Book book: list) {
		  System.out.println(book);
	  }
  }
}public void deleteBook() {
	System.out.println("삭제할 도서의 제목을 입력하세요: ");
	String title = sc.nextLine();
	System.out.println("삭제할 도서의 저자를 입력하세요: ");
	String author = sc.nextLine();
	Book book = bc.deleteBook(title, author);
	
	if(book == null) {
		System.out.println("도서를 찾을 수 없습니다.");
	}else {
		System.out.println("삭제 되었습니다.");
		
	}

}
	
}
