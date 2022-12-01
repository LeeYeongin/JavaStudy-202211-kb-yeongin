package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	
	public static void main(String[] args) {
		Gson gson = new Gson(); // gson 생성방법1
		
		GsonBuilder gsonBuilder = new GsonBuilder(); // gson 생성방법2
		Gson gson2 = gsonBuilder.setPrettyPrinting().create(); // setPreetyPrinting을 사용하면 출력모양이 달라짐
		// -> Gson gsonBuilder = new GsonBuilder().create();
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "abc");
		map.put("email", "abc@gmail.com");
		map.put("address", "부산 동래구");
		map.put("phone", "01012345678");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		
		map.put("hobby", hobby);
		
		System.out.println(map);
		
		// Json형태로 변경
		String json = gson2.toJson(map);
		System.out.println(json);
		
		// 원래 형태로 다시 변경
		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class); // json을 map으로 바꿔라
		System.out.println(jsonMap);
	}
}
