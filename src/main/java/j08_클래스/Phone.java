package j08_클래스;

public class Phone {

    String company;
    String model;

    Phone() {} //기본생성자는 생략가능(늘 존재), overloading되면 명시해줘야 함

    Phone(String c, String m) {   //기본 생성자 overloading -> 기본 생성자 비활성화
        company = c;
        model = m;
    }

    void printPhoneCompany(){
        System.out.println("제조사: " + company);
        System.out.println();
    }

    void printPhoneModel(){
        System.out.println("모델명: " + model);
        System.out.println();
    }

}
