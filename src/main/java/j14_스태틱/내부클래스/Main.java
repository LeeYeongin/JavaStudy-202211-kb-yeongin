package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {
        A.B b = new A().new B("김준일"); // 내부클래스는 단독적으로 생성불가
        System.out.println(b.getName());
    }
}
