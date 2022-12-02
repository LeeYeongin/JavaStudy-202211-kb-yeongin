package j18_예외;

public class ThrowsException {
	
	public static void printArray(int[] numbers) throws Exception { // -> 예외를 미룸
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5};
	
		try {
			printArray(nums);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	// main함수에서 throws Exception을 하면 JVM까지 예외가 미뤄짐
	// -> 중간에 예외발생으로 인한 프로그램 정지를 방지하기 위해 throws Exception사용
	// NullPointerException | ArrayIndexOutOfBoundsException -> 둘중 하나의 예외가 발생하면
}
