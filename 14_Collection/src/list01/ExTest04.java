package list01;

import java.util.ArrayList;

public class ExTest04 {

	public static void main(String[] args) {
  ArrayList<Person> list = new ArrayList<Person>();
  Person per1  = new Person("노용철", 25, "01097895370", "경기도 수원");
  Person per2  = new Person("도용철", 26, "01097895470", "경기도 수투");
  Person per3  = new Person("로용철", 27, "01097895570", "경기도 수쓰리");
  
  
  list.add(per1);
  list.add(per2);
  list.add(per3);
  for(int i = 0; i<list.size(); i++) {
	 System.out.println(list.get(i));
  }

}
}
