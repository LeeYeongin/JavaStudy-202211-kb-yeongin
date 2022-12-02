package j19_익명클래스;

public class CalcMain {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator() {
			@Override
			public int calc(int a, int b) {
				return a + b;
			}
		};
		int r3 = c.calc(10,20);
		System.out.println(r3);
		// 람다식 => 인터페이스 안에 하나의 추상 메소드가 존재하는 경우만 사용가능 + 인터페이스에서만 사용가능
		//			(여러개의 메소드가 존재하면 어떤 메소드를 정의해야하는지 알 수 X)
		// return이외의 실행문이 없을 경우 (return, 중괄호, 변수자료형은 생략)
		Calculator c1 = (x, y) -> x + y;
		
		/*
		 * Calculator c1 = (x, y) -> {		// 중괄호를 사용하여 원하는 실행문 추가 가능
		 * 		System.out.println("덧셈");
		 * 		return x + y;
		 *}
		 */
		
		CalculatorSub cs = x -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		int r1 = c1.calc(10,20);
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
	}

}