package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = User.builder()
				.username("junil")
				.password("1234")
				.name("김준일")
				.email(null)
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Gson gson2 = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls() // null 값도 출력
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		
		String userJson = gson2.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		
		userObj = gson2.fromJson(userJson, User.class);
		System.out.println(userObj);
	}
}
