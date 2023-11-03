package set_map02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class  Member   {
	String name;  //회원 이름
	int age;		//회원 나이	//회원 성별

		
	 public	Member(){		
		}
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
		//return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
		 return (	member.age == age) &&( member.name.equals(name));
		 }
		return false;
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);*/
	}
	public void setAge(int age) {
		this.age = age;
	}
	public 	Member(String name, int age){
			this.name = name;
			this.age = age;
			
		}
		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + "]";
		}

	}

public class Set02 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동", 20));
		System.out.println(set.size());

		} 
		
		
	}


