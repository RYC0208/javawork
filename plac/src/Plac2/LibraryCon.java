package Plac2;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCon {

	private Member mem = new Member();
	
	private ArrayList<Book> bList = new ArrayList<>();
	
	public void insertMember(Member m) {
		this.mem = m;


	}
	void myinfo() {
		
		System.out.println(mem);

	}public void insertBook() {
		bList.add(new Book("오라클","김용권","둘빛미디어"));
		bList.add(new Book("java","신용권","한빛미디어"));
		bList.add(new Book("스프링","박용권","셋빛미디어"));
		
	}public ArrayList<Book> selectAll(){
	return bList;
	
	}
	public Book searchBook(String keyword) {
		
		Book book = null;
	
		 //어레이 리스트는 랭스가 아닌 사이즈를 사용
		 for(int i=0; i<bList.size(); i++) {
				if(bList.isEmpty()){
					System.out.println("책 없어");
					break;
				} 
				else if(keyword.equals(bList.get(i).gettitle())) {
				 book = bList.get(i);
				 break;
			 }
			 
		 }return book;
		 
	}	public int rentBook(int index) {
		return index;
	}
}

