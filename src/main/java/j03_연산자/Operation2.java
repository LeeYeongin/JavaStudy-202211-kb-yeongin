package j03_연산자;

public class Operation2 {
    public static void main(String[] args) {

        int num = 10;

        System.out.println(num++);
        System.out.println(num);
        /*
            print(num++)은
            1. print(num)
            2. num = num + 1
         */
        System.out.println(++num);
        System.out.println(num);
        /*
            print(++num)은
            1. num = num + 1
            2. print(num)
         */

    }
}