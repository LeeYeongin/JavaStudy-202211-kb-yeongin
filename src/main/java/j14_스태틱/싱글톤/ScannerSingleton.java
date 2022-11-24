package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {
    // 2. 자기 자신을 static 변수로 가지고 있어야한다.
    private static ScannerSingleton instance = null;

    @Getter
    private Scanner scanner; // Scanner에 대한 getter가 생성

    // 1. 생성자가 private 접근지정자여야한다.
    private ScannerSingleton() {
        scanner = new Scanner(System.in);
    }

    // static 변수를 return해야함으로 static 메소드로 선언
    public static ScannerSingleton getInstance() {
        if (instance == null) { // 객체생성이 안된경우
            instance = new ScannerSingleton();
        }
        return instance;
    }
}