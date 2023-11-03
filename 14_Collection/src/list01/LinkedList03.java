package list01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
// 객체만 넣을 수 있다
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(3);    //맨 끝에 추가
		list.add(1, 5); // index 1에 5를 추가
		list.addFirst(1);// 맨 앞에 추가
		list.add(7); //다시 맨 뒤에 추가 그러면 순서는 1 3 5 7
		
		
		for(int i : list)
			System.out.println(i);
		System.out.println();
		
		list.remove(); // ()칸을 비워두면 맨 앞노드 삭제
		
		for(int i : list)
			System.out.println(i);
		
		list.remove(1);		
		list.removeLast();			//맨 끝 노드 삭제
	//	list.remove(list.size()-1); // 맨 끝 노드 삭제
		
		System.out.println();
		list.remove(0);
		
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		
		Iterator<Integer> it = list.iterator();
		//hesNext() => 남아 있는 객체가 있는가?
		//next() => 순회 하면서 값 얻어오기
		
		while(it.hasNext()) {
		 int num =	it.next();
		 System.out.println(num);
		 
		}
		
	}
}
