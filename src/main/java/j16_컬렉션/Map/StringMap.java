package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
	
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		// Add
		// Map은 put으로 데이터 추가
		language.put("java", "자바2");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬"); // key값은 중복 X, value는 중복 O
		language.put("python", "파이썬?"); // key값이 중복되면 뒤에 들어온 value로 덮어씌움
		
		// 순서는 Set처럼 없음
		System.out.println(language);
		
		String s = language.get("java");
		System.out.println(s);
		
		// update
		// oldvalue가 같지 않으면 replace발생 X
		// language.replace("java", "자바", "자바3"); 
		language.replace("java", "자바");
		System.out.println(language.get("java"));
		
		language.remove("python2");
		System.out.println(language);
		
	}
}