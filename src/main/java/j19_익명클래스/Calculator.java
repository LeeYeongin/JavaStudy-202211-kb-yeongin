package j19_익명클래스;

@FunctionalInterface //람다식을 사용한다는 의미 => 두개의 추상 메소드 사용불가
public interface Calculator {

	public int calc(int a, int b);
	
	// public int calc(int a, int b, int c); => overloading도 안됨 
	// 일반적으로 인수에 배열사용하여 원하는만큼의 인수를 덧셈에 사용
	
	
	// overriding이 필요 없기 때문에 default 메소드는 사용가능
	public default int a() {
		return 10;
	}
}
