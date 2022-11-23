package j13_Object;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        String str = "A";   // literal -> 이미 저장되어있는 A의 값을 의미
        String str2 = "A";  // literal -> 이미 저장되어있는 A의 값을 의미
        String str3 =  new String("A"); // 새로운 주소 할당 후 A의 주소를 담음

        System.out.println(str == str2);   // true
        System.out.println(str.equals(str2)); // true

        System.out.println(str);    // 주소값이 아닌 문자가 출력
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3); // false

        System.out.println(str.toString()); //


    }
}
