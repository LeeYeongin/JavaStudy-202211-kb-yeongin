package j14_스태틱;

/*
    공유영역

 */

import lombok.Data;

@Data
public class Product {
    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name){
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print(){
        System.out.println(autoIncrement);
        // System.out.println(serialNumber); 일반변수는 메모리가 할당되어야 접근가능 -> 사용불가
        // add(10,20); 일반 메소드라 사용불가
    }

    public int add(int a, int b){
        return a + b;
    }

}