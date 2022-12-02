package j20_함수형인터페이스;

public class Main1 {
	public static void main(String[] args) {
		int a = 10;
		
		// 메소드 안에서 메소드 정의가능 => 매개변수를 주지않아도 다른 변수들을 사용 가능
		Runnable application1 = () -> {	// 매개변수가 없을때 () 생략불가
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);
		};
		
		application1.run();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// 비동기처리
		t1.start();
		t2.start();
	}
}

//Runnable timer = () -> {
//	for(int i = 0; i < 100; i++) {
//		try {
//			System.out.println(i + " : " + (i + 1));
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//};
//
//Thread t2 = new Thread(timer);