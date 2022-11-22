package j12_추상.추상클래스;

/*
    추상 메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야 한다.
 */

public abstract class Animal {
    //일반적인 변수, 생성자, 메소드 사용 가능
    private String kind;

    public Animal(){}   //overloading됐기때문에 기본생성자 직접 선언

    public Animal(String kind) {    //overloading
        System.out.println(kind + "이(가) 생성되었습니다.");
    }

    //override를 위한 용도 -> 추상메소드
    public abstract void move();

    public void eat(){
        System.out.println("동물이 밥을 먹습니다.");
    }
}
