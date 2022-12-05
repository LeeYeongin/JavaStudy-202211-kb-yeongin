package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {

	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN, GUEST";
		roles = roles.replaceAll(" ", "");
		
		String[] roleArray = roles.split(",");
		List<String> rolesList = Arrays.asList(roleArray);
		
		System.out.println(rolesList);
		rolesList.forEach(role -> {
			// prefix(접두어) startsWith()
			// suffix(접미어) endsWith()
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) { // equalsIgnoreCase() => 대소문자 구분X 글자비교
				System.out.println("권한: " + role);
			}
		});
	}
}
