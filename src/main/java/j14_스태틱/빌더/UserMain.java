package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()  // builder는 static 메소드
                .username("junil")  // username의 주소를 return
                .password("1234")
                .email("skjil1218@kakao.com")
                .name("김준일")
                .build();   // user객체를 생성해서 return
                            // 원하는 정보만을 이용해서 객체 생성가능,
                            // 매개변수의 순서도 상관없음

        System.out.println(user);
    }
}
