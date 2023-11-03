package list01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 * ArrayList<>
		 * <제네릭> => 자료형이 어떤게 들어올지 모른다
		 *		 	사용 할 때 자료형을 넣는다
		 *  - 갯수를 지정하지 않으면(기본 10개)
	   */// 갯수 지정 가능
		ArrayList<String> list = new ArrayList<String>(15);
		// 	부모형으로 변환하여 사용		
		
		List<String> alist = new ArrayList<>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML5");
		list.add("JSP");
		
		int listsize = list.size();
		System.out.println("총 객체의 수: "+listsize);
		
		String list21 = list.get(2);
		System.out.println(list21);
		//삽입
		list.add(2, "Spring");//인덱스 2번에 Spring을 끼워 넣어서  1칸씩 뒤로 밀림
		System.out.println("총 객체의 수: "+list.size());
		System.out.println(list.get(2));
		
		//기존 객체 변경
		list.set(2, "SpringBoot");
		System.out.println("총 객체 수: "+ list.size());
		System.out.println(list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
		//삭제 remove(index), remove(객체명)
		String removeStr = list.remove(0);
		System.out.println(removeStr);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		boolean re = list.remove("HTML5");
		System.out.println(re);
		
		list.clear();
		System.out.println("총 객체의 수: "+list.size());
		System.out.println("ArrayList가 비어있는가?"+list.isEmpty());
		
		//매개변수에 모든 객체를 받을 때<Object>
		ArrayList alist2 = new ArrayList();
		alist2.add(1);
		alist2.add(3.1415);
		alist2.add("23");
		alist2.add(new String("88"));
		
		Object obj1 = alist2.get(0);
		int num = (int)obj1;
		double douNum =(double)alist2.get(1);
		int strNum1 = Integer.parseInt((String)alist2.get(2));
		int strNum2 = Integer.parseInt((String)alist2.get(3));
		System.out.println(num + douNum + strNum1 + strNum2);
	}
	
	
}
