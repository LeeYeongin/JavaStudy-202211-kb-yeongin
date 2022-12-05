package j21_문자열메소드;

public class StringMethod {
	
	public static void main(String[] args) {
		String name = "김준일김수현";
		
		// 문자열의 index도 0부터 시작
		System.out.println(name.length());
		
		// 문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));
		
		// 문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		
		//String subName1 = name.substring(0, 2);  0번부터 2번 인덱스 전까지 String자르기
		//String subName2 = name.substring(2);  2번 인덱스 부터 끝까지 String자르기
		
		String nameFind = "김준일";
		
		// nameFind가 모두 일치하는 부분의 첫시작부분 index반환
		String subName1 = name.substring(name.indexOf(nameFind), name.indexOf(nameFind) + nameFind.length());
		System.out.println(subName1);
		
		nameFind = "김수현";
		String subName2 = name.substring(name.indexOf(nameFind), name.indexOf(nameFind) + nameFind.length());
		System.out.println(subName2);
		
		String file = "C:/String.java";
		String fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		String extension = file.substring(file.lastIndexOf("."));
		
		System.out.println(fileName);
		System.out.println(extension);
	}

}
