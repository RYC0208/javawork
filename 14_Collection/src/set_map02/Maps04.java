package set_map02;
import java.util.*;

public class Maps04 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		//키는 중복 불가, 값은 중복 가능
		map.put(1, "홍길동");
		map.put(2, "아무개");
		map.put(2, "이길동");// 같은키에 넣으면 값 변경
				System.out.println(map);
				
			Map<String, Double> map2 = new HashMap<String, Double>();
		map2.put("java", 34.55);
		map2.put("Oracle", 35.55);
		map2.put("joba", 14.45);
		System.out.println(map2);
		System.out.println(map2.get("joba"));
		System.out.println(map2.remove("joba"));
		System.out.println(map2);
		System.out.println();
		
		mapPrint(map);
		
	}
	static void mapPrint(Map<Integer, String> map) {
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			int key =keyIterator.next();
			String value = map.get(key);
			System.out.println(key +":"+value);
		}
	}

}
