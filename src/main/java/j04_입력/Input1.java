package j04_입력;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        Scanner scanner = new Scanner(System.in); //Scanner class 생성

        name = scanner.nextLine(); //띄어쓰기, Enter 입력 포함
        age = scanner.nextInt(); //띄어쓰기, Enter 입력 포함X
        scanner.nextLine(); //Enter 입력을 날려주는 역할
        phone = scanner.nextLine();
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);
    }
}
