package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {

    public static void show(){
        System.out.println("메인메소드에서 호출");
    }
    public static void main(String[] args) {
        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print();

        show(); //static 메소드라 생성하지않고 사용가능

        // Method1 클래스의 메소드들이 public static이라
        // 다른 클래스에서 생성하지 않고 사용가능
        Method1.main(null);
        Method1.method1();
    }
}

/*
    show()가 static 메소드가 아닌경우 사용하려면
    Product pm = new ProductMain();
    pm.show();
 */