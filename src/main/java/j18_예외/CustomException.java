package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L; // Class명에 노란줄뜨면 추가(없어도 상관 X)
	
	Map<String, String> errorMap;
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}

	public void printErroMap() {
		Objects.requireNonNull(errorMap); // errorMap이 null이면 NullPointerException 발생
		
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
		System.out.println();
	}
}
