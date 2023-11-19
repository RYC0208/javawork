package plac4;
import java.util.*;
public class BookController {
ArrayList<Book> list = new ArrayList<Book>();
BookController(){
	
}
public void insertBook(Book bk) {
 list.add(bk);
}
public ArrayList<Book> selectList(){
	return new ArrayList<>(list);
}
public ArrayList<Book> searchBook (String keyword){
	ArrayList<Book> search = new ArrayList<Book>();
	for(Book book : list) {
		if(book.getAuthor().contains(keyword));
			search.add(book);
	} 
	return search;
} public  Book deleteBook(String title, String author) {
	Book book = null;
	for(int i =0; i<list.size(); i++) {
		if(author.equals(list.get(i).getTitle()) 
		&& author.equals(list.get(i).getAuthor()))
		book = list.remove(i);{
		break;
		}
	}return book;
}
}
