package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("age", 29);
		map.put("gender", true);
		
		// HashMap -> hashcode에 따라
		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로");
		
		map.put("address", address);
		
		// TreeMap
		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);
		
		//map.get을 했을때 return된 값은 object자료형 -> 다시 get을 사용하려면 downcasting 필요
		System.out.println(((Map<Integer, String>) map.get("subject")).get(403));
		
		List<String> hobby = new ArrayList<String>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(((List<String>)map.get("hobby")).get(2));
		
		System.out.println();
		Set<Entry<String, Object>> userEntry = map.entrySet();
		
		System.out.println(map);
		System.out.println(userEntry);
		
		Set<String> names = new HashSet<>();
		names.add("abc1");
		names.add("abc2");
		names.add("abc3");
		names.add("abc4");
		names.add("abc5");
		
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		//entry로 key, value를 꺼낼 수 있음
		for(Entry<String, Object> entry: userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
		
		/*===========================================*/
		
		Set<String> keys = map.keySet(); // key값만 set으로 꺼낼 수 있음
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key)); // key값을 이용해 value값도 꺼낼 수 있음
		}
		
		System.out.println("----------------------------");
		System.out.println(map.values());
		
		System.out.println();
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
		
		
	}
}