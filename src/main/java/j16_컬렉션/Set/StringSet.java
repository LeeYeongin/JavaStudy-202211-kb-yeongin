package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("김준일");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet);
		
		for(String s : nameSet) {
			if(s.equals("김준일")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		//Create
		Set<String> listToSet = new HashSet<String>(); // Set은 인터페이스, HashSet이 클래스
		listToSet.addAll(nameList); // addAll 매개변수는 collection -> map에서는 addAll 사용불가
		
		System.out.println(listToSet);
		
		//Remove
		nameSet.remove("김준일"); // 원하는 값을 직접 지워야함
		System.out.println(nameSet);
		
		//Update -> 값자체가 key이므로 remove한 다음 add하는 형식으로 정보 수정
		
		
	}
}
