package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User{	// subclass -> 이 패키지에서만 사용가능
	private String username;
	private String password;
}

public class UserListException {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);
		
		int length = userList.size();
		
		try {
			for(int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			// 예외가 발생하면 그 지점부터 실행 X
			for(int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());
				System.out.println("password: " + userList.get(i).getPassword());
			}
		} catch(IndexOutOfBoundsException indexOutOfBoundsException) {
			length -= 1;
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for(int i = 0; i < length; i++) {
					System.out.println("username: " + userList.get(i).getUsername());
					System.out.println("password: " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) {
				System.out.println(nullPointerException.getMessage());
			}
			
		} catch (NullPointerException nullPointerException) {
		System.out.println(nullPointerException.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 무조건 마지막에 실행되는 부분
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 정상 종료");
		
	}

}
