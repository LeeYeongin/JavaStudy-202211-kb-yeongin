package j12_추상.인터페이스;

/*
    1. 모든 메소드는 기본적으로 추상메소드이다.
    2. 변수는 선언할 수 없다.
    3. 상수는 선언할 수 있다. (기본적으로 모든 변수선언은 상수로 선언된다 -> final 생략가능)
    4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
 */
public interface Calculator {
    public int ERROR_CODE = -9999999;   // private는 불가능, 안쓰는게 좋음

    public int calc(int[] values);
}

// private String name; 일반 변수는 사용불가 (public도 동일)
//public Calculator() {} -> 생성자를 만들 수 없음, 사용 X
    /*
    public default void setErrorCode() {
        ERROR_CODE = 10;    // 상수라서 값 변경 불가
    }
    */
