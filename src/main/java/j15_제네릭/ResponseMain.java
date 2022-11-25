package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data){ //<?>(와일드카드)-> 어떤자료형이 들어올지 모르겠다
        return new CMRespDto<>(msg, data);
    }
    /*
        ex)
        Info<? extends Object> getInfo()
        = Object를 상속받은 것들만 와일드카드 적용
        extends -> 상속받은 것들만
        super -> 나 자신과 부모만
     */

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(2022001)
                .name("유열림")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
